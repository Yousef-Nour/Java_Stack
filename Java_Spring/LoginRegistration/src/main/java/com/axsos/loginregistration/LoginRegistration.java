package com.axsos.loginregistration;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginRegistration {

    @RequestMapping("")
    public String start(HttpSession session) {
        if(session.getAttribute("email")==null) 
            return "login.jsp";
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpSession session ,@RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {
        if(email.equals("admin@email.com")&&password.equals("admin")) {
                if(session.getAttribute("email")==null) {
                    session.setAttribute("email", email);
                }
                return "redirect:/welcome";

        }
        return "redirect:/";
    }
    @RequestMapping("/welcome")
    public String welcome(HttpSession session){
        if(session.getAttribute("email")==null) 
            return "redirect:/";
        return "welcome.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {

        if (session.getAttribute("email")!=null)
            session.invalidate();

        return "redirect:/";

    }
}
