package org.itis.gr404.controller;

import org.itis.gr404.dao.UserRepository;
import org.itis.gr404.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public String all(ModelMap model){
        model.addAttribute("users", userRepository.getUsers());
        return "userTable";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String addUser(ModelMap model){
        model.addAttribute("user", new User());
        return "addUser";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user, BindingResult result){
        if (result.hasErrors()) {
            return "addUser";
        }
        try {
            userRepository.getUser(user.getId());
            userRepository.updateUser(user);
        }catch (Exception e){
            userRepository.createUser(user);
        }
        return "redirect:/user/all";
    }

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable String id){
        userRepository.dropUser(Integer.parseInt(id));
        return "redirect:/user/all";
    }

    @RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
    public String editUser(ModelMap model, @PathVariable String id){
        model.addAttribute("user", userRepository.getUser(Integer.parseInt(id)));
        return "addUser";
    }
}
