package com.axsos.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(){
		return "index.jsp";
	}
	@RequestMapping(value="/result", method=RequestMethod.POST)
    public String result(HttpSession session,@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language,@RequestParam(value="comment") String comment, Model model) {
		session.setAttribute("name",name);
		session.setAttribute("language",language);
		session.setAttribute("location",location);
		session.setAttribute("comment",comment);
//		return "result.jsp";
		return "redirect:/result"; 
	
	}
	@RequestMapping("/result")
	public String method() {
		return "result.jsp";
		

}
}
