package main.web;

import main.entities.VahtkondIntsidendi;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vahtkondintsidendis", formBackingObject = VahtkondIntsidendi.class)
@RequestMapping("/vahtkondintsidendis")
@Controller
public class VahtkondIntsidendiController {
}
