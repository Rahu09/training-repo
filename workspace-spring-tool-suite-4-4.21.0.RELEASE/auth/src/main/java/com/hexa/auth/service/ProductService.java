package com.hexa.auth.service;

import java.util.List;

import com.hexa.auth.dto.ProductDto;
import com.hexa.auth.entity.Product;
import com.hexa.auth.exception.ResourceNotFoundException;


public interface ProductService {
	List<Product> searchProduct(String query);
	
	ProductDto createProduct(ProductDto p) throws Exception;

	ProductDto getProductById(Long id) throws ResourceNotFoundException;


}
