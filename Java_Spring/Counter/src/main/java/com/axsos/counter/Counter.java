package com.axsos.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	int counter;
	@RequestMapping("/your_server")
	public  String count1(){
		this.counter++;
		return "index.jsp";
	}
	@RequestMapping("/your_server/counter")
	 public String index(HttpSession session){
        session.setAttribute("count", counter);
        Integer count = (Integer) session.getAttribute("count");
		return "index2.jsp";
    }
}
