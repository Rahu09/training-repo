package com.hexa.auth.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hexa.auth.dto.ProductDto;
import com.hexa.auth.entity.Product;
import com.hexa.auth.mapper.Mapper;

@Component
public class ProductMapper implements Mapper<Product, ProductDto>{
	
	private ModelMapper modelMapper;
	
	public ProductMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public ProductDto mapTo(Product a) {
		return modelMapper.map(a, ProductDto.class);
	}

	@Override
	public Product mapFrom(ProductDto b) {
		return modelMapper.map(b, Product.class);
	}

}
