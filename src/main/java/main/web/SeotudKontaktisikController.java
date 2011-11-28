package main.web;

import main.entities.SeotudKontaktisik;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "seotudkontaktisiks", formBackingObject = SeotudKontaktisik.class)
@RequestMapping("/seotudkontaktisiks")
@Controller
public class SeotudKontaktisikController {
}
