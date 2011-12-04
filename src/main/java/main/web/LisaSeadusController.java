package main.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.persistence.PIIRIVALVURI_SEADUS_INTSIDENDI;
import org.persistence.SEADUSE_PUNKT;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/lisaseadus/**")
@Controller
public class LisaSeadusController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    @ModelAttribute("PIIRIVALVUR_SEADUS_INTSIDENDI") 
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView create(@Valid PIIRIVALVURI_SEADUS_INTSIDENDI pvSeadusIntsidendis, BindingResult bindingResult, Model uiModel, HttpServletRequest request) {
        if (bindingResult.hasErrors()) 
        {
            System.out.println("viga");
            return new ModelAndView("redirect:/intsidendipiirivalvurired/index");
        }
        uiModel.asMap().clear();
        HttpSession session = request.getSession();
    	long pnIntsidendisID = (Long) session.getAttribute("pvIntsidendis_id");
    	pvSeadusIntsidendis.setPIIRIVALVUR_INTSIDENDIS_ID(PIIRIVALVUR_INTSIDENDIS.findPIIRIVALVUR_INTSIDENDIS(pnIntsidendisID));
   
        //TODO EDIT LOG_ON INFO
        pvSeadusIntsidendis.setAvaja(SecurityContextHolder.getContext().getAuthentication().getName());
        pvSeadusIntsidendis.setAvatud(null);
        pvSeadusIntsidendis.setMuudetud(null);
        pvSeadusIntsidendis.setMuutja(SecurityContextHolder.getContext().getAuthentication().getName());
        pvSeadusIntsidendis.setSuletud(null);
        pvSeadusIntsidendis.setAlates(Calendar.getInstance().getTime());
        pvSeadusIntsidendis.setKuni(Calendar.getInstance().getTime());
        pvSeadusIntsidendis.persist();

        return new ModelAndView("redirect:/intsidendipiirivalvurired/index");
    } 

    @SuppressWarnings("deprecation")
	@RequestMapping
    public String index(Model uiModel) {
        
    	
    	List<SEADUSE_PUNKT> seadused = SEADUSE_PUNKT.findAllSEADUSE_PUNKTs();
    	List<SEADUSE_PUNKT> tulemList = new ArrayList<SEADUSE_PUNKT>();
    	for(SEADUSE_PUNKT isin : seadused)
        {
         if(isin.getSuletud().getYear() != 9999 &&
         		isin.getSuletud().getMonth() != 12 &&
         		isin.getSuletud().getDate() != 31)
         { continue; }
         else
         { tulemList.add(isin); }
        }
    	uiModel.addAttribute("seadused", tulemList);
    	
        return "lisaseadus/index";
    }
}
