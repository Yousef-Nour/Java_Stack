package com.axsos.productscategories.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.productscategories.models.Category;
import com.axsos.productscategories.models.CategoryProduct;
import com.axsos.productscategories.models.Product;
import com.axsos.productscategories.services.AppService;

@Controller
public class AppController {
	private final AppService appService;
	public AppController(AppService appService) {
		this.appService = appService;
	}
	@GetMapping("/")
	public String n(Model model) {
		model.addAttribute("products", appService.findProducts());
		return "products/index.jsp";
	}
	@GetMapping("/{id}")
	public String Show(@ModelAttribute("cp") CategoryProduct cp, 
		@PathVariable("id") Long id, Model model) {
		Product thisOne = appService.getProduct(id);
		List<Category> others = appService.findCategoriesNotInProduct(thisOne);
		model.addAttribute("product", thisOne);
		model.addAttribute("notInCategories", others);
		return "products/show.jsp";
	}
	@PostMapping("/associations/{kind}")
	public String Create(@Valid @ModelAttribute("cp") CategoryProduct cp,
			BindingResult result,
			@PathVariable("kind") String kind) {
		if(result.hasErrors())
			return String.format("/%s/show.jsp", kind);
		appService.createAssociation(cp);
		return "redirect:/";
	}
}
