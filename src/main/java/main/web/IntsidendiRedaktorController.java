package main.web;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.persistence.INTSIDENT;
import org.persistence.OBJEKT;
import org.persistence.PIIRIRIKKUJA;
import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.persistence.VAHTKOND;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/intsidendiredaktor/**")
@Controller
public class IntsidendiRedaktorController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    @RequestMapping(method = RequestMethod.POST, params = "tagasiintsidentidenimekirja")
    public ModelAndView exit( HttpServletRequest request) {
        return new ModelAndView("redirect:/intsidendidpiirivalvurikaupa/index");
    }
    
    @RequestMapping(method = RequestMethod.POST, params = "tagasipealehele")
    public ModelAndView exit2( HttpServletRequest request) {
        return new ModelAndView("redirect:/");
    }
    
    @RequestMapping(method = RequestMethod.POST, params = "piirivalvurinfo")
    public void piirivalvurInfo(ModelMap modelMap, HttpServletRequest httpServletRequest) {
    } 
    
    @RequestMapping(method = RequestMethod.POST, params = "lisaPV")
    public ModelAndView piirivalvuriLisamine(ModelMap modelMap, HttpServletRequest httpServletRequest) {
        return new ModelAndView("redirect:/lisapiirivalvur/index");
    }
    
    @ModelAttribute("Redaktor") 
    @RequestMapping(method = RequestMethod.POST, params = "eemaldaPV")
    public ModelAndView piirivalvuriEemaldamine(@Valid Redaktor redaktor, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
    	//PiirivalvurIntsidendis saiLahti = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(piirivalvurIntsidendisId);
    	PIIRIVALVUR_INTSIDENDIS vabasta = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(redaktor.getEemaldaPV());
    	vabasta.setSuletud(Calendar.getInstance().getTime());
    	//TODO!!!!!!
    	vabasta.setSulgeja(null);
    	vabasta.persist();
        return new ModelAndView("redirect:/intsidendiredaktor/index");
    }
    
    @ModelAttribute("Redaktor") 
    @RequestMapping(method = RequestMethod.POST, params = "infoPV")
    public ModelAndView piirivalvuriInfo(@Valid Redaktor redaktor, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
    	//PiirivalvurIntsidendis saiLahti = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(piirivalvurIntsidendisId);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("pvIntsidendis_id", redaktor.getInfoPV());
        return new ModelAndView("redirect:/intsidendipiirivalvurired/index");
    }

    
    @RequestMapping
    public String index(Model uiModel, HttpServletRequest request) 
    {	
    	
    	HttpSession session = request.getSession();
    	if(session.getAttribute("tuldiintsidendireg") == null)
    	{ uiModel.addAttribute("tuldiintsidendireg",0); }
    	else
    	{ uiModel.addAttribute("tuldiintsidendireg",1); }
    	    	
    	long kuvatavIntsidentID = (Long) session.getAttribute("intsident_id"); 	
    	INTSIDENT laetudIntsident = INTSIDENT.findINTSIDENT(kuvatavIntsidentID);
    	uiModel.addAttribute("laetudintsident", laetudIntsident);

    	List<PIIRIRIKKUJA> piiririkkujad = 
    			IntsidendigaSeotudElem.GetIntsidendigaSeotudAktivPiiririkkujad(laetudIntsident);
    	uiModel.addAttribute("laetudpiiririkkujad",piiririkkujad);
    	List<VAHTKOND> vahtkonnad = 
    			IntsidendigaSeotudElem.GetIntsidendigaSeotudAktivVahtkonnad(laetudIntsident);
    	uiModel.addAttribute("laetudvahtkonnad",vahtkonnad);
    	List<OBJEKT> objektid =
    			IntsidendigaSeotudElem.GetIntsidendigaSeotudAktivObjektid(laetudIntsident);
    	uiModel.addAttribute("laetudobjektid",objektid);
    	List<PIIRIVALVUR_INTSIDENDIS> piirivalvuriIntsidendid =
    			IntsidendigaSeotudElem.GetIntsidendigaSeotudAktivPiirivalvuriIntsidendid(laetudIntsident);
    	uiModel.addAttribute("laetudpiirivalvuriintsidendid",piirivalvuriIntsidendid);
        return "intsidendiredaktor/index";
        
    }
}
