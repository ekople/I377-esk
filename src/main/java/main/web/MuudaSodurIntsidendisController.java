package main.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.persistence.PIIRIVALVUR;
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

@RequestMapping("/muudasodurintsidendis/**")
@Controller
public class MuudaSodurIntsidendisController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, params = "loobu")
    public ModelAndView exit( HttpServletRequest request) {
        return new ModelAndView("redirect:/intsidendipiirivalvurired/index");
    }
    @ModelAttribute("PIIRIVALVUR") 
    @RequestMapping(method = RequestMethod.POST, params = "salvesta")
    public ModelAndView save(@Valid PIIRIVALVUR piirivalvur, BindingResult bindingResult, Model uiModel, HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	long pnIntsidendisID = (Long) session.getAttribute("pvIntsidendis_id");
    	
    	Calendar hetk = Calendar.getInstance();
    	
    	PIIRIVALVUR uuspv = PIIRIVALVUR.findPIIRIVALVUR(piirivalvur.getPiirivalvurId());
    	
    	PIIRIVALVUR_INTSIDENDIS vana = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(pnIntsidendisID);
    	PIIRIVALVUR_INTSIDENDIS uus = new PIIRIVALVUR_INTSIDENDIS();
    	uus.setAlates(vana.getAlates());
    	//TODO::
    	uus.setAvaja(SecurityContextHolder.getContext().getAuthentication().getName());
    	uus.setAvatud(hetk.getTime());
    	uus.setINTSIDENT_ID(vana.getINTSIDENT_ID());
    	uus.setKirjeldus(vana.getKirjeldus());
    	uus.setKommentaar(vana.getKommentaar());
    	uus.setKuni(vana.getKuni());
    	uus.setMuudetud(hetk.getTime());
    	uus.setMuutja(SecurityContextHolder.getContext().getAuthentication().getName());
    	uus.setPIIRIVALVUR_ID(uuspv);
    	
    	uus.setPIIRIVALVURI_SEADUS_INTSIDENDI(null);
    	
    	uus.setSuletud(null);
    	uus.setSulgeja(null);
    	
    	
    	vana.setMuudetud(hetk.getTime());
    	vana.setMuutja(SecurityContextHolder.getContext().getAuthentication().getName());
    	vana.setSuletud(hetk.getTime());
    	vana.setSulgeja(SecurityContextHolder.getContext().getAuthentication().getName());
    	vana.persist();

    	uus.persist();
    	
    	session.setAttribute("pvIntsidendis_id", uus.getPiirivalvurIntsidendisId());
    	
        return new ModelAndView("redirect:/intsidendipiirivalvurired/index");
    }
    
    @RequestMapping
    public String index(Model uiModel, HttpServletRequest request) {
    	
    	HttpSession session = request.getSession();
    	long pnIntsidendisID = (Long) session.getAttribute("pvIntsidendis_id");
    	PIIRIVALVUR_INTSIDENDIS intsidendis = PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(pnIntsidendisID);
    	PIIRIVALVUR vanaValvur = intsidendis.getPIIRIVALVUR_ID();
    	uiModel.addAttribute("endinepiirivalvurintsidendis", vanaValvur);
    	
    	
    	List<PIIRIVALVUR> piirivalvurid = PIIRIVALVUR.findAllPIIRIVALVURS();
    	List<PIIRIVALVUR> tulemList = new ArrayList<PIIRIVALVUR>();
    	for(PIIRIVALVUR isin : piirivalvurid)
        {

         if(isin.getSuletud().getYear() != 9999 &&
         		isin.getSuletud().getMonth() != 12 &&
         		isin.getSuletud().getDate() != 31)
         { continue; }
         else
         { tulemList.add(isin); }
        }
    	uiModel.addAttribute("piirivalvurid", tulemList);
        return "muudasodurintsidendis/index";
    }
}
