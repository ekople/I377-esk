package main.web;

import main.entities.AmetVaeosa;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "ametvaeosas", formBackingObject = AmetVaeosa.class)
@RequestMapping("/ametvaeosas")
@Controller
public class AmetVaeosaController {
}
