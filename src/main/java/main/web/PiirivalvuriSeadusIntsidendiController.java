package main.web;

import main.entities.PiirivalvuriSeadusIntsidendi;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvuriseadusintsidendis", formBackingObject = PiirivalvuriSeadusIntsidendi.class)
@RequestMapping("/piirivalvuriseadusintsidendis")
@Controller
public class PiirivalvuriSeadusIntsidendiController {
}
