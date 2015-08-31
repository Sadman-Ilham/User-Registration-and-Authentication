package com.sadman.controller;

import com.sadman.service.UserService;
import com.sadman.model.User;
import com.sadman.model.UserLoginHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Sadman on 8/18/2015.
 */
@Controller
@RequestMapping ("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping (method = RequestMethod.GET)
    public String viewLogin (ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping (method = RequestMethod.POST)
    public String varifyLogin (@RequestParam String email, @RequestParam String password, ModelMap modelMap) {
        List<User> users = userService.getUsers();
        for(User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
                DateFormat dateFormat = new SimpleDateFormat();
                Date date = new Date();
                UserLoginHistory userLoginHistory = new UserLoginHistory();
                userLoginHistory.setLoginTime(dateFormat.format(date));
                user.getHistory().add(userLoginHistory);
                userService.updateUser(user);
                modelMap.addAttribute("resultMessage", "Congratulations " + user.getFullName() + "! You are Successfully Logged in.");
                return "result";
            }
        }
        modelMap.addAttribute("resultMessage", "Incorrect Username or Password! Please try again.");
        return "result";
    }

}
