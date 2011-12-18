package main.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.persistence.INTSIDENT;
import org.persistence.PIIRILOIK;
import org.persistence.PIIRIVALVUR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/intsidendidpiirivalvurikaupa/**")
@Controller
public class IntsidendidPiirivalvuriKaupaController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

//    @RequestMapping(method = RequestMethod.POST, value = "{id}")
//    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response)
//    {
//    }
    
    @ModelAttribute("INTSIDENT") 
    @RequestMapping(method = RequestMethod.POST, params = "intsidentId")
    public ModelAndView piirivalvurInfo(@Valid INTSIDENT intsident, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest)
    {
     HttpSession session = httpServletRequest.getSession();
     session.setAttribute("intsident_id", intsident.getIntsidentId());
     if(session.getAttribute("tuldiintsidendireg") != null)
     { session.removeAttribute("tuldiintsidendireg");}
     return new ModelAndView("redirect:/intsidendiredaktor/index");
    } 
    

    @RequestMapping(method = RequestMethod.POST, params = "varskenda")
    public void varskenda(Model uiModel, HttpServletRequest httpServletRequest)
    {
    	String algus = httpServletRequest.getParameter("algus");
    	String lopp = httpServletRequest.getParameter("lopp");
    	String piiriloik = httpServletRequest.getParameter("piiriloik");
    	Date algusd = null;
    	Date loppd = null;
    	Long piiriloikL = null;
    	SimpleDateFormat parse = new SimpleDateFormat("dd.MM.yyyy");
    	if(algus != null && algus.trim() != "")
    	{ 
    		try 
    		{ algusd = parse.parse(algus); } 
    		catch (ParseException e)
    		{} 
    	}
    	if(lopp != null && lopp.trim() != "")
    	{ 
    		try 
    		{ loppd = parse.parse(lopp); } 
    		catch (ParseException e)
    		{} 
    	}
    	if(piiriloik != null && piiriloik != "")
    	{ piiriloikL = Long.parseLong(piiriloik); }
    	
    	List<PiirivalvuriIntsidendid> data = new ArrayList<PiirivalvuriIntsidendid>();
        for(PIIRIVALVUR piirivalvur: allPiirivalvurid())
        { data.add(PiirivalvuriIntsidendid.leiaPiirivalvurigaSeotudIntsidendid(piirivalvur,algusd,loppd,piiriloikL)); }
        uiModel.addAttribute("dataobjekt", data);
        uiModel.addAttribute("piiriloik", allPiiriloik());
        uiModel.addAttribute("alates",algus);
        uiModel.addAttribute("kuni",lopp);
        uiModel.addAttribute("piiriloikvalik",piiriloik);
    } 
    
    @SuppressWarnings("deprecation")
	private List<PIIRIVALVUR> allPiirivalvurid(){
    	
    	List<PIIRIVALVUR> valvurid = PIIRIVALVUR.findAllPIIRIVALVURS();
    	List<PIIRIVALVUR> tulemList = new ArrayList<PIIRIVALVUR>();
    	for(PIIRIVALVUR isin : valvurid)
        {
         if(isin.getSuletud().before(new Date()))
         { continue; }
         else
         { tulemList.add(isin); }
        }
    	
    	
    	return tulemList;
    }
    
    @SuppressWarnings("deprecation")
	private List<PIIRILOIK> allPiiriloik(){
    	
    	List<PIIRILOIK> loigud = PIIRILOIK.findAllPIIRILOIKS();
    	List<PIIRILOIK> tulemList = new ArrayList<PIIRILOIK>();
    	for(PIIRILOIK isin : loigud)
        {
         if(isin.getSuletud().before(new Date()))
         { continue; }
         else
         { tulemList.add(isin); }
        }
    	
    	
    	return tulemList;
    }
    
    
    @RequestMapping
    public String index(Model uiModel, HttpServletRequest request) 
    {
    	List<PiirivalvuriIntsidendid> data = new ArrayList<PiirivalvuriIntsidendid>();
    	for(PIIRIVALVUR piirivalvur: allPiirivalvurid())
    	{ data.add(PiirivalvuriIntsidendid.leiaPiirivalvurigaSeotudIntsidendid(piirivalvur)); }
    	uiModel.addAttribute("dataobjekt", data);
        uiModel.addAttribute("piiriloik", allPiiriloik());
        return "intsidendidpiirivalvurikaupa/index";
    }
}