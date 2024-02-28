package com.hexa.samplejpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexa.samplejpa.repository.ProductRepository;

@SpringBootTest
public class CustomQueryMethodsTest {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	void searchProductTest() {
		productRepository.searchProducts("mouse");
	}
	
	@Test
	void searchProductTest1() {
		productRepository.searchProducts1("keyboard");
	}
}
