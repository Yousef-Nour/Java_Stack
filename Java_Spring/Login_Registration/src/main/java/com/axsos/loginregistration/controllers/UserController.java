package com.axsos.loginregistration.controllers;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.loginregistration.models.User;
import com.axsos.loginregistration.services.UserService;
import com.axsos.loginregistration.validation.UserValidator;

@Controller
public class UserController {
    private final UserService userService;
    private final UserValidator userValidator;
        
    

    public UserController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }

    @RequestMapping("/login")
    public String login(HttpSession session) {
    	if (session.getAttribute("userID") !=null)
    		return "redirect:/home";
        return "loginPage.jsp";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user,Model model, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about
        // validations just now)
         userValidator.validate(user, result);
        
        if(result.hasErrors())
            return "registrationPage.jsp";
        // else, save the user in the database, save the user id in session, and
        // redirect them to the /home route
        if(userService.findByEmail(user.getEmail()) != null) {
        	model.addAttribute("error", "This email already exist!!");
        	return "registrationPage.jsp";
        }
        userService.registerUser(user);
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
            HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
        if(userService.authenticateUser(email, password)) {
            session.setAttribute("userId", userService.findByEmail(email).getId());
            return "redirect:/home";
        }
        else {
            model.addAttribute("error","Invalid User name or Password");
            return "loginPage.jsp";
        }
    }

    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
        if(session.getAttribute("userId")==null)
            return "redirect:/registration";
        Long Id=(Long) session.getAttribute("userId");
        User u= userService.findUserById(Id);
        model.addAttribute("user",u);
        return "homePage.jsp";
        
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
        session.invalidate();
        return "redirect:/login"; 
    }
}