package com.axsos.gettingfamiliarwithrouts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController


public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo")String track) {
		if(track.equals("dojo")) {
		return "The " + track + " is awesome";
		}
		else if (track.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		else if(track.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		else {
			return "Wrong Rout";
		
				
	}
	
	}
}
