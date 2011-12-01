package main.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.persistence.PIIRIVALVUR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/intsidendidpiirivalvurikaupa/**")
@Controller
public class IntsidendidPiirivalvuriKaupaController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index(Model uiModel) 
    {
    	List<PiirivalvuriIntsidendid> data = new ArrayList<PiirivalvuriIntsidendid>();
    	
    	for(PIIRIVALVUR piirivalvur: PIIRIVALVUR.findAllPIIRIVALVURS())
    	{
    		data.add(PiirivalvuriIntsidendid.leiaPiirivalvurigaSeotudIntsidendid(piirivalvur));
    	}
    	
    	uiModel.addAttribute("dataobjekt", data);
        return "intsidendidpiirivalvurikaupa/index";
    }
}
