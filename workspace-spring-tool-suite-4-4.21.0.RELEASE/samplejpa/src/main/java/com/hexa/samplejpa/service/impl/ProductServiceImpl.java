package com.hexa.samplejpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.internal.objenesis.Objenesis;
import org.springframework.stereotype.Service;

import com.hexa.samplejpa.dto.ProductDto;
import com.hexa.samplejpa.entity.Product;
import com.hexa.samplejpa.exception.NameAlreadyExistsException;
import com.hexa.samplejpa.exception.ResourceNotFoundException;
import com.hexa.samplejpa.mapper.impl.ProductMapper;
import com.hexa.samplejpa.mapper.impl.ProductMapperCustome;
import com.hexa.samplejpa.repository.ProductRepository;
import com.hexa.samplejpa.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	


	private ProductRepository productRepository;
	private ProductMapper productMapper;
	
	public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
		super();
		this.productRepository = productRepository;
		this.productMapper = productMapper;
	}

	@Override
	public List<Product> searchProduct(String query) {
		// TODO Auto-generated method stub
		List<Product> productList=productRepository.searchProducts(query);
		return productList;
	}

	@Override
	public ProductDto createProduct(ProductDto p) throws Exception {
//		Product productEntity = new Product(p);
//		Product savedProduct =
//				productRepository.save(productEntity);
//		ProductDto savedDto = new ProductDto(savedProduct);
		
		
//		Product productEntity = 
//				ProductMapperCustome.mapToProduct(p);
//		Product savedProduct =
//				productRepository.save(productEntity);
//		ProductDto savedDto = 
//				ProductMapperCustome.mapToProductDto(savedProduct);
		
		Product existingProduct = null;
		existingProduct = productRepository.findDistinctByName(p.getName());
		if(existingProduct != null) {
			throw new NameAlreadyExistsException("this name already exists");
		}
		
		Product productEntity = 
				productMapper.mapFrom(p);
		Product savedProduct =
				productRepository.save(productEntity);
		ProductDto savedDto = 
				productMapper.mapTo(savedProduct);	
		
		return savedDto;
	}

	@Override
	public ProductDto getProductById(Long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		Optional<Product> p = productRepository.findById(id);
		if(p.isEmpty()) {
			throw new ResourceNotFoundException("Product", "id", id);
		}		
		Product preEntity = p.get();
		return productMapper.mapTo(preEntity);
	}

	

}
