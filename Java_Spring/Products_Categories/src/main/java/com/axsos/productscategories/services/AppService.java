package com.axsos.productscategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.productscategories.models.Category;
import com.axsos.productscategories.models.CategoryProduct;
import com.axsos.productscategories.models.Product;
import com.axsos.productscategories.repositories.CategoryProductReprository;
import com.axsos.productscategories.repositories.CategoryRepository;
import com.axsos.productscategories.repositories.ProductRepository;

@Service
public class AppService {
	private final ProductRepository productRepo;
	private final CategoryRepository catRepo;
	private final CategoryProductReprository catProRepo;
	public AppService(ProductRepository productRepo, CategoryRepository catRepo, CategoryProductReprository catProRepo) {
		this.productRepo = productRepo;
		this.catRepo = catRepo;
		this.catProRepo = catProRepo;
	}
	public List<Product> findProducts() {
		return this.productRepo.findAll();
	}
	public Product getProduct(Long id) {
		return this.productRepo.findById(id).orElse(null);
	}
	public List<Category> findCategories() {
		return this.catRepo.findAll();
	}
	public Product createProduct(Product p) {
		return this.productRepo.save(p);
	}
	public CategoryProduct createAssociation(CategoryProduct cp) {
		return this.catProRepo.save(cp);
	}
	public List<Category> findCategoriesNotInProduct(Product p) {
		return catRepo.findByProductsNotContains(p);
	}
	public List<Product> findProductsNotInCategory(Category c) {
		return productRepo.findByCategoriesNotContains(c);
	}
}
