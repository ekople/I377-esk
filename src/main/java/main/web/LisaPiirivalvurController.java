package main.web;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import org.persistence.INTSIDENT;
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

@RequestMapping("/lisapiirivalvur/**")
@Controller
public class LisaPiirivalvurController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    
    @ModelAttribute("PIIRIVALVUR_INTSIDENDIS") 
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView create(@Valid PIIRIVALVUR_INTSIDENDIS pvIntsidendis, BindingResult bindingResult, Model uiModel, HttpServletRequest request) {
        if (bindingResult.hasErrors()) 
        {
            System.out.println("viga");
            return new ModelAndView("redirect:/intsidendiredaktor/index");
        }
        uiModel.asMap().clear();
        HttpSession session = request.getSession();
    	long kuvatavIntsidentID = (Long) session.getAttribute("intsident_id"); 
    	INTSIDENT laetudIntsident = INTSIDENT.findINTSIDENT(kuvatavIntsidentID);
        pvIntsidendis.setINTSIDENT_ID(laetudIntsident);
        //TODO EDIT LOG_ON INFO
        pvIntsidendis.setAvaja(SecurityContextHolder.getContext().getAuthentication().getName());
        pvIntsidendis.setAvatud(null);
        pvIntsidendis.setMuudetud(null);
        pvIntsidendis.setMuutja(SecurityContextHolder.getContext().getAuthentication().getName());
        pvIntsidendis.setSuletud(null);
        pvIntsidendis.persist();

        return new ModelAndView("redirect:/intsidendiredaktor/index");
    } 
    
    
    
    
    @RequestMapping
    public String index(Model uiModel) {
    	
        uiModel.addAttribute("piirivalvurid", PIIRIVALVUR.findAllPIIRIVALVURS());
        return "lisapiirivalvur/index";
    }
    
}
