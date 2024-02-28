package com.hexa.samplejpa.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hexa.samplejpa.dto.ProductDto;
import com.hexa.samplejpa.entity.Product;
import com.hexa.samplejpa.mapper.Mapper;

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
