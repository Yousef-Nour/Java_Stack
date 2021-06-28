package com.axsos.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.relationships.models.Person;
import com.axsos.relationships.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	// create new person
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}

	@RequestMapping(value = "/persons", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "newPerson.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:/persons/new";
		}
	}
	//show
	@RequestMapping("/persons/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("personInfo", personService.findPerson(id));
		return "show.jsp";

	}

}
