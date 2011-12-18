package main.web;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.persistence.INTSIDENT;
import org.persistence.PIIRIVALVURI_SEADUS_INTSIDENDI;

import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/intsidendipiirivalvurired/**")
@Controller
public class IntsidendiPiirivalvuriRedController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    
    @RequestMapping(method = RequestMethod.POST, params = "vahetaPV")
    public ModelAndView piirivalvuriLisamine(ModelMap modelMap, HttpServletRequest httpServletRequest) {
        return new ModelAndView("redirect:/muudasodurintsidendis/index");
    }
    @ModelAttribute("Redaktor") 
    @RequestMapping(method = RequestMethod.POST, params = "eemaldaSeadus")
    public ModelAndView seaduseEemaldamine(@Valid Redaktor redaktor, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
    	PIIRIVALVURI_SEADUS_INTSIDENDI vabasta = PIIRIVALVURI_SEADUS_INTSIDENDI.findPIIRIVALVURI_SEADUS_INTSIDENDI(redaktor.getEemaldaSeadus());
    	vabasta.setSuletud(Calendar.getInstance().getTime());
    	//TODO!!!!!!
    	vabasta.setSulgeja(SecurityContextHolder.getContext().getAuthentication().getName());
    	vabasta.persist();
        return new ModelAndView("redirect:/intsidendipiirivalvurired/index");
    }
    @RequestMapping(method = RequestMethod.POST, params = "lisaSeadus")
    public ModelAndView seaduseLisamine(@Valid Redaktor redaktor, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        return new ModelAndView("redirect:/lisaseadus/index");
    }
    
    @RequestMapping(method = RequestMethod.POST, params = "loobu")
    public ModelAndView exit( HttpServletRequest request) {
        return new ModelAndView("redirect:/intsidendiredaktor/index");
    }
    @ModelAttribute("PIIRIVALVUR_INTSIDENDIS") 
    @RequestMapping(method = RequestMethod.POST, params = "salvesta")
    public ModelAndView save(@Valid PIIRIVALVUR_INTSIDENDIS pvIntsidendis, BindingResult bindingResult, Model uiModel, HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	long pnIntsidendisID = (Long) session.getAttribute("pvIntsidendis_id");
    	Calendar hetk = Calendar.getInstance();
    	
    	PIIRIVALVUR_INTSIDENDIS vana = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(pnIntsidendisID);
    	PIIRIVALVUR_INTSIDENDIS uus = new PIIRIVALVUR_INTSIDENDIS();
    	uus.setAlates(vana.getAlates());
    	//TODO::
    	uus.setAvaja(SecurityContextHolder.getContext().getAuthentication().getName());
    	uus.setAvatud(hetk.getTime());
    	uus.setINTSIDENT_ID(vana.getINTSIDENT_ID());
    	uus.setKirjeldus(pvIntsidendis.getKirjeldus());
    	uus.setKommentaar(pvIntsidendis.getKommentaar());
    	uus.setKuni(vana.getKuni());
    	uus.setMuudetud(hetk.getTime());
    	uus.setMuutja(SecurityContextHolder.getContext().getAuthentication().getName());
    	uus.setPIIRIVALVUR_ID(vana.getPIIRIVALVUR_ID());
    	
    	uus.setPIIRIVALVURI_SEADUS_INTSIDENDI(null);
    	
    	uus.setSuletud(null);
    	uus.setSulgeja(null);
    	
    	
    	vana.setMuudetud(hetk.getTime());
    	vana.setMuutja(SecurityContextHolder.getContext().getAuthentication().getName());
    	vana.setSuletud(hetk.getTime());
    	vana.setSulgeja(SecurityContextHolder.getContext().getAuthentication().getName());
    	vana.persist();

    	uus.persist();
        return new ModelAndView("redirect:/intsidendiredaktor/index");
    }
    
    

	@RequestMapping
    public String index(Model uiModel, HttpServletRequest request)
    {
    	HttpSession session = request.getSession();
    	long kuvatavIntsidentID = (Long) session.getAttribute("intsident_id"); 	
    	INTSIDENT laetudIntsident = INTSIDENT.findINTSIDENT(kuvatavIntsidentID);
    	uiModel.addAttribute("laetudintsident", laetudIntsident);
    	
    	long pnIntsidendisID = (Long) session.getAttribute("pvIntsidendis_id");
    	PIIRIVALVUR_INTSIDENDIS intsidendis = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(pnIntsidendisID);
    	uiModel.addAttribute("laetudpiirivalvurintsidendis", intsidendis);
    	
    	List<PIIRIVALVURI_SEADUS_INTSIDENDI> seadused = PIIRIVALVURI_SEADUS_INTSIDENDI.findAllPIIRIVALVURI_SEADUS_INTSIDENDIs();
    	uiModel.addAttribute("laetudSeadused", seadused);
    	
        return "intsidendipiirivalvurired/index";
    }
}
