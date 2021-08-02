package ru.java.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.java.web.service.UserServiceImp;


@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserServiceImp userServiceImp;

    public UsersController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userServiceImp.index());
        return "users/index";
    }


}
