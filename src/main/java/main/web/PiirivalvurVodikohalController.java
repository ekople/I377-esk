package main.web;

import main.entities.PiirivalvurVodikohal;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvurvodikohals", formBackingObject = PiirivalvurVodikohal.class)
@RequestMapping("/piirivalvurvodikohals")
@Controller
public class PiirivalvurVodikohalController {
}
