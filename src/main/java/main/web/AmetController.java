package main.web;

import main.entities.Amet;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "amets", formBackingObject = Amet.class)
@RequestMapping("/amets")
@Controller
public class AmetController {
}
