package com.axsos.hellohuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/your_server")
public class HumanController {
    @RequestMapping("")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
    	
    	if (searchQuery == null ) {
    		searchQuery="Human";
		}
        return "<h1> Hello  " + searchQuery+ "</h1><p>Welcome to spring boot</p>";
    }
  
}
