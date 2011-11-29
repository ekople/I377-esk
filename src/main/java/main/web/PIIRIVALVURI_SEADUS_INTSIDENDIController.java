package main.web;

import org.persistence.PIIRIVALVURI_SEADUS_INTSIDENDI;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvuri_seadus_intsidendis", formBackingObject = PIIRIVALVURI_SEADUS_INTSIDENDI.class)
@RequestMapping("/piirivalvuri_seadus_intsidendis")
@Controller
public class PIIRIVALVURI_SEADUS_INTSIDENDIController {
}
