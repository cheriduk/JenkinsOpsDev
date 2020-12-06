package com.gary.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {

    @RequestMapping("/say")
    public String say(Model model) { // 参数中传入Model
        model.addAttribute("name","dukang 2020-12-06--a"); // 指定Model的值
        model.addAttribute("url","https://cheriduk.github.io/"); // 指定Model的值
        return "say";
    }
}

