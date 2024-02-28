package com.hexa.samplejpa.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexa.samplejpa.entity.Product;
import com.hexa.samplejpa.repository.ProductRepository;

@SpringBootTest
public class GeneratedQueryMethods {
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(JPAQueriesTest.class);
	
	@Autowired
	ProductRepository productRepository;
	
//	@Test
//	@Disabled
//	void findDistinctByNameTest() {
//		Product p = productRepository.findDistinctByName("mouse");
//		LOG.info("record: "+p.toString());
//	}
//	
//	@Test
//	@Disabled
//	void findByNameContainingTest() {
//		List<Product> resObj = productRepository.findByNameContaining("mouse");
//		
//		LOG.info("record list: "+ resObj);
//	}

//	@Test
//	void findByPriceGreaterThanMethod() {
//		Optional<List<Product>> opt = productRepository.findByPriceGreaterThan(new BigDecimal(9999));
//		if(opt.isEmpty()) {
//			LOG.info("no records found");
//		}else {
//			List<Product> prodList = opt.get();
//			LOG.info("\n\nno of records: "+prodList.size()+"\nrecord list: "+prodList+"\n");
//		}
//	}
	
//	@Test
//	void findByDateCreatedBetweenMethod() {
//		Optional<List<Product>> opt = productRepository.findByDateCreatedBetween(LocalDateTime.);
//		if(opt.isEmpty()) {
//			LOG.info("no records found");
//		}else {
//			List<Product> prodList = opt.get();
//			LOG.info("\n\nno of records: "+prodList.size()+"\nrecord list: "+prodList+"\n");
//		}
//	}
}
