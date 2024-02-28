package com.hexa.samplejpa.service;

import java.util.List;

import com.hexa.samplejpa.dto.ProductDto;
import com.hexa.samplejpa.entity.Product;
import com.hexa.samplejpa.exception.ResourceNotFoundException;


public interface ProductService {
	List<Product> searchProduct(String query);
	
	ProductDto createProduct(ProductDto p) throws Exception;

	ProductDto getProductById(Long id) throws ResourceNotFoundException;


}
