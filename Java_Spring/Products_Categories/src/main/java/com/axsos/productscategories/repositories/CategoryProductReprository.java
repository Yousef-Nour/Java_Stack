package com.axsos.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axsos.productscategories.models.CategoryProduct;

public interface CategoryProductReprository extends CrudRepository<CategoryProduct, Long>{

}