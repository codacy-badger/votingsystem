package ru.votingsystem.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserController{

    @GetMapping
    public String test(Model model) {
        model.addAttribute("test", "TEST CONTROLLER");
        return "users";
    }

}
