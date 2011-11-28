package main.web;

import main.entities.IsikuSeadusIntsidendi;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "isikuseadusintsidendis", formBackingObject = IsikuSeadusIntsidendi.class)
@RequestMapping("/isikuseadusintsidendis")
@Controller
public class IsikuSeadusIntsidendiController {
}
