package com.hexa.auth.mapper.impl;

import org.springframework.stereotype.Component;

import com.hexa.auth.dto.ProductDto;
import com.hexa.auth.entity.Product;

@Component
public class ProductMapperCustome {
	public static ProductDto mapToProductDto(Product p) {
		return new ProductDto(p);
	}
	
	public static Product mapToProduct(ProductDto p) {
		return new Product(p);
	}

}
