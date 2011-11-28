package main.web;

import main.entities.PiirivalvurVaeosa;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvurvaeosas", formBackingObject = PiirivalvurVaeosa.class)
@RequestMapping("/piirivalvurvaeosas")
@Controller
public class PiirivalvurVaeosaController {
}
