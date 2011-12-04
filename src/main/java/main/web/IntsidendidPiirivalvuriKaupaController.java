package main.web;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.PathVariable;
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
    
    
    @RequestMapping
    public String index(Model uiModel, HttpServletRequest request) 
    {
        HttpSession session = request.getSession();
     List<PiirivalvuriIntsidendid> data = new ArrayList<PiirivalvuriIntsidendid>();
     for(PIIRIVALVUR piirivalvur: PIIRIVALVUR.findAllPIIRIVALVURS())
     { data.add(PiirivalvuriIntsidendid.leiaPiirivalvurigaSeotudIntsidendid(piirivalvur)); }
     uiModel.addAttribute("dataobjekt", data);
        uiModel.addAttribute("piiriloik", PIIRILOIK.findAllPIIRILOIKS());
        return "intsidendidpiirivalvurikaupa/index";
    }
}