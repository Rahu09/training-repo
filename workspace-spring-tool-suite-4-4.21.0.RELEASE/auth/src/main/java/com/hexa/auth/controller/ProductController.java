package com.hexa.auth.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.auth.dto.ProductDto;
import com.hexa.auth.entity.Product;
import com.hexa.auth.exception.ResourceNotFoundException;
import com.hexa.auth.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/productapp")
public class ProductController {


	private ProductService productService;
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping(path = "/searchProducts")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam String query){
		return new ResponseEntity<List<Product>>(productService.searchProduct(query),HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping(path = "/addProduct")
	public ResponseEntity<ProductDto> addProduct(@RequestBody @Valid ProductDto p) throws Exception{
		return new ResponseEntity<ProductDto>(productService.createProduct(p),HttpStatus.OK);
	}
	
	@GetMapping(path = "/searchProductsById/{id}")
	public ResponseEntity<ProductDto> searchProductsById(@PathVariable("id") Long id) throws ResourceNotFoundException{
		return new ResponseEntity<ProductDto>(productService.getProductById(id),HttpStatus.OK);
	}
}
