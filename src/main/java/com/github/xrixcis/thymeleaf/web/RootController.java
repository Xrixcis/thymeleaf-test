package com.github.xrixcis.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xrixcis on 4.1.17.
 */
@Controller
public class RootController {

    @RequestMapping("/")
    public String index() {
        return "th/index";
    }
}
