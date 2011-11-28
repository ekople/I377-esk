package main.web;

import main.entities.PiirivalvurPiiripunkti;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvurpiiripunktis", formBackingObject = PiirivalvurPiiripunkti.class)
@RequestMapping("/piirivalvurpiiripunktis")
@Controller
public class PiirivalvurPiiripunktiController {
}
