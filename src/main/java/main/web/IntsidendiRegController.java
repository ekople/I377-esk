package main.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.persistence.INTSIDENDI_LIIK;
import org.persistence.INTSIDENT;
import org.persistence.PIIRILOIK;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/intsidendireg/**")
@Controller
public class IntsidendiRegController{
	
    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("123412312");
    }
    /*
    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("asdasd");
    } */
    /*
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
    	return "intsidendireg";
    } */

    @ModelAttribute("INTSIDENT") 
    @RequestMapping(method = RequestMethod.POST, params = "salvesta")
    public ModelAndView create(@Valid INTSIDENT intsident, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) 
        {
            System.out.println("viga");
            return new ModelAndView("redirect:/intsidendireg/");
        }
        uiModel.asMap().clear();
        //TODO EDIT LOG_ON INFO
        intsident.setAvaja(null);
        intsident.setAvatud(null);
        intsident.setMuudetud(null);
        intsident.setMuutja(null);
        intsident.setSuletud(null);
        intsident.persist();
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("intsident_id", intsident.getIntsidentId());
        session.setAttribute("tuldiintsidendireg", true);
        return new ModelAndView("redirect:/intsidendiredaktor/index");
    } 
    

    @RequestMapping(method = RequestMethod.POST, params = "tagasi")
    public ModelAndView back(HttpServletRequest httpServletRequest) {
        return new ModelAndView("redirect:../");
    } 
    /*
    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("INTSIDENT") INTSIDENT intsident,
            BindingResult result, SessionStatus status) {

        if (result.hasErrors()) {
            return "petForm";
        }
        else {
            intsident.persist();
            status.setComplete();
            return "redirect:owner.do?ownerId=" + pet.getOwner().getId();
        }
    } */
    @RequestMapping
    public String index(Model uiModel) {
        uiModel.addAttribute("intsidendi_liik", INTSIDENDI_LIIK.findAllINTSIDENDI_LIIKs());
        uiModel.addAttribute("piiriloik", PIIRILOIK.findAllPIIRILOIKS());

        return "intsidendireg/index";
    }
}
