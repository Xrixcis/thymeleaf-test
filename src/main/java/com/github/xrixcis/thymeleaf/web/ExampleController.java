package com.github.xrixcis.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by xrixcis on 28.12.16.
 */
@Controller
@RequestMapping("/example")
public class ExampleController {

    @RequestMapping("/jsp")
    public String jsp(Model model) {
        model.addAttribute("now", new Date());
        return "example";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("now", new Date());
        return "th/example";
    }
}
