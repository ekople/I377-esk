package main.web;

import main.entities.IsikIntsidendi;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "isikintsidendis", formBackingObject = IsikIntsidendi.class)
@RequestMapping("/isikintsidendis")
@Controller
public class IsikIntsidendiController {
}
