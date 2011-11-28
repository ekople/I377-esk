package main.web;

import main.entities.ObjektIntsidendi;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "objektintsidendis", formBackingObject = ObjektIntsidendi.class)
@RequestMapping("/objektintsidendis")
@Controller
public class ObjektIntsidendiController {
}
