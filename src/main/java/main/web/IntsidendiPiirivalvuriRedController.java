package main.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.persistence.INTSIDENT;
import org.persistence.PIIRIVALVUR_INTSIDENDIS;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/intsidendipiirivalvurired/**")
@Controller
public class IntsidendiPiirivalvuriRedController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response)
    { System.out.println("Posted!"); }

    @RequestMapping
    public String index(Model uiModel, HttpServletRequest request)
    {
    	HttpSession session = request.getSession();
    	long kuvatavIntsidentID = (Long) session.getAttribute("intsident_id"); 	
    	INTSIDENT laetudIntsident = INTSIDENT.findINTSIDENT(kuvatavIntsidentID);
    	uiModel.addAttribute("laetudintsident", laetudIntsident);
    	PIIRIVALVUR_INTSIDENDIS kuvatavPiirivalvuriIntsidentId = (PIIRIVALVUR_INTSIDENDIS) session.getAttribute("piirivalvurintsident_id");
    	uiModel.addAttribute("laetudpiirivalvurintsidendis", kuvatavPiirivalvuriIntsidentId);
    	
        return "intsidendipiirivalvurired/index";
    }
}
