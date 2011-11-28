package main.web;

import main.entities.RuumiyksuseLiik;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "ruumiyksuseliiks", formBackingObject = RuumiyksuseLiik.class)
@RequestMapping("/ruumiyksuseliiks")
@Controller
public class RuumiyksuseLiikController {
}
