package com.aeroparker.aeroparkerapp.controller;

import com.aeroparker.aeroparkerapp.model.User;
import com.aeroparker.aeroparkerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    UserService userService;

    // Show Registration
    @RequestMapping("")
    public String showRegistration(){
        return "registration";
    }
    //Add user
    @PostMapping(value="/users/addUser")
    public String addUser(User user, Model model) {
        if (userService.checkEmail(user.getEmail_address()))
        {
            model.addAttribute("error_message", "Email already in use, please try another");
            return "registration";
        }
        else {
            userService.addUser(user);
            return "redirect:/registration/users/addUser";
        }
    }
    // User added
    @RequestMapping("/users/addUser")
    public String userAdded(Model model){
        String first_name = userService.getAll().get(userService.getAll().size()-1).getFirst_name();// Most recent person to register, could be done better
        model.addAttribute("first_name", first_name);
        return "userAdded";
    }

    // All Users
    @RequestMapping("/users")
    public String users(Model model){
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return "users";
    }
    // Single User
    @RequestMapping("/users/getSingle") //?id=X
    @ResponseBody
    public Optional<User> getSingle(Integer id){
        return userService.getSingle(id);
    }


}
