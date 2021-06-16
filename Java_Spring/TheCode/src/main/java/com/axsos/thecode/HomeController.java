package com.axsos.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
	}
	
    @RequestMapping(value="/code", method=RequestMethod.POST)
    public String Guess(@RequestParam(value="password") String password) {
    	if (password.equals("bushido")) {
    		return "index2.jsp";
			
		} else {
			return "redirect:/createError";

		}
		
	}
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You Must Train Harder!");
        return "redirect:/";
    }
	

}
