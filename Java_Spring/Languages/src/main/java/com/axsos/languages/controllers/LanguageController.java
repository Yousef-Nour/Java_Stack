package com.axsos.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.languages.models.Language;
import com.axsos.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService LanguageService;

	public LanguageController(LanguageService languageService) {
		super();
		this.LanguageService = languageService;
	}
	//Retrieve all languages
	@RequestMapping("/languages")
	public String showLanguages(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages= LanguageService.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	//create new language
	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/languages";
		
		} else {
			LanguageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String showLanguage(Model model, @PathVariable("id") Long id) {
		Language language = LanguageService.findLanguage(id);
		model.addAttribute("language", language);
		return ("details.jsp");
	}
	//edit and update language
	@RequestMapping("/languages/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language language = LanguageService.findLanguage(id);
        model.addAttribute("language", language);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            LanguageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    
    //Delete Language
    @RequestMapping(value = "/languages/delete/{id}", method = RequestMethod.GET)
	public String destroy(@PathVariable("id") Long id) {
		LanguageService.deleteLanguage(id);
		return "redirect:/languages";
	}
    
    

}
