package com.axsos.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.relationships.models.License;
import com.axsos.relationships.services.LicenseService;
import com.axsos.relationships.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;

	
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	//create new license
	@RequestMapping("/licenses/new")
    public String newLicense(@ModelAttribute("license") License license,Model model) {
		model.addAttribute("persons", personService.allPersons());
        return "newLicense.jsp";
    }
    @RequestMapping(value="/licenses", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
        if (result.hasErrors()) {
            return "newLicense.jsp";
        } else {
        	
        	licenseService.createLicense(license);
            return "redirect:/persons/"+license.getPerson().getId();
        }
    }
}
