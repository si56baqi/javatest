package com.si56baqi.Aop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController {

    public String printHello(ModelMap model) {

        model.addAttribute("message", "Hello Spring MVC Framework!");

        return "hello";

    }
}
