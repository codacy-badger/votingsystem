package ru.votingsystem.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.votingsystem.service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class AdminRestController extends AbstractUserController{

    @Autowired
    private UserServiceImpl service;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("users", service.getAll());
        return "users";
    }


}