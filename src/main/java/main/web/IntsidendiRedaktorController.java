package main.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.persistence.INTSIDENT;
import org.persistence.OBJEKT;
import org.persistence.PIIRIRIKKUJA;
import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.persistence.VAHTKOND;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/intsidendiredaktor/**")
@Controller
public class IntsidendiRedaktorController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    
    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response)
    {
    	System.out.println("posted!");
    }

    @RequestMapping(method = RequestMethod.POST, params = "piirivalvurinfo")
    public void piirivalvurInfo(ModelMap modelMap, HttpServletRequest httpServletRequest) {
    	System.out.println(modelMap.toString());
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
