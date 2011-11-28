package main.web;

import main.entities.RiigiAdminYksuseLiik;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "riigiadminyksuseliiks", formBackingObject = RiigiAdminYksuseLiik.class)
@RequestMapping("/riigiadminyksuseliiks")
@Controller
public class RiigiAdminYksuseLiikController {
}
