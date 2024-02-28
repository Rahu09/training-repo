package com.hexa.samplejpa.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hexa.samplejpa.dto.ProductDto;
import com.hexa.samplejpa.entity.Product;
import com.hexa.samplejpa.repository.ProductRepository;
import com.hexa.samplejpa.service.ProductService;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 

@SpringBootTest
public class JPAQueriesTest {
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(JPAQueriesTest.class);
	
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Test
	public void saveServiceTest() throws Exception {
		
		ProductDto product = 
				new ProductDto((long)321, "available","apple mouse", "desktop essentials",new BigDecimal(12000), true, "AMouse.png", LocalDateTime.now(), LocalDateTime.now());
		
		ProductDto savedProduct = null;
		try {
			savedProduct = productService.createProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOG.info(savedProduct.toString());
	}

	
	
	@Test
	@Disabled
	public void saveMethodTest() {
		Product p = new Product((long)300, "available","nvdia graphic", "laptop graphic",new BigDecimal(999), true, "nvdia.png",LocalDateTime.now(),LocalDateTime.now());
		Product savedProduct = productRepository.save(p);

        LOG.info(savedProduct.toString());
	}
	
	@Test
	@Disabled
	public void saveMethodUpdateTest() {
		Long id=25L;
		Optional<Product> exixtingProd =productRepository.findById(id);
		if(exixtingProd.isPresent()) {
			Product o = exixtingProd.get();
			LOG.info("exixting product in jpa save" + o.toString());
			
			o.setName("Hp Vision pro");
			o.setDescription("computer essentials");
			productRepository.save(o);
	        LOG.info(o.toString());
			
		}else {
	        LOG.info("Record is not Present");
		}
	}
	
	@Test
	@Disabled
	public void saveAll() {
		
		Product p1 = new Product((long)300, "available","nvdia graphic", "laptop graphic",new BigDecimal(25999), true, "nvdia.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p2 = new Product((long)300, "available","amd graphic", "laptop graphic",new BigDecimal(7777), true, "amd.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p3 = new Product((long)300, "available","intel graphic", "laptop graphic",new BigDecimal(6666), true, "intel.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p4 = new Product((long)300, "available","mouse", "laptop essentials",new BigDecimal(1500), true, "mouse.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p5 = new Product((long)300, "available","keyboard", "keyboard and mouse essentials",new BigDecimal(2500), true, "keyboard.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p6 = new Product((long)300, "available","apple graphic", "laptop graphic",new BigDecimal(35000), true, "AGraphic.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p7 = new Product((long)300, "available","hp monitor", "desktop essentials",new BigDecimal(10000), true, "monitor.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p8 = new Product((long)300, "available","hp speakers", "desktop essentials",new BigDecimal(5000), true, "speakers.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p9 = new Product((long)300, "available","apple mouse", "desktop essentials",new BigDecimal(12000), true, "AMouse.png",LocalDateTime.now(),LocalDateTime.now());
		
		Product p10 = new Product((long)300, "available","macbook pro", "apple product",new BigDecimal(98999), true, "macbook.png",LocalDateTime.now(),LocalDateTime.now());
		
		List<Product> savedProduct = productRepository.saveAll(List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));

        LOG.info("saved product list: \n"+savedProduct.toString());
	}
	
	@Test
	@Disabled
	public void findAllMethodTest() {
		 List<Product> productList = productRepository.findAll();
		 productList.forEach((p)->{
			 LOG.info("found record"+p.toString());
		 });
	}
	
	@Test
	@Disabled
	public void deleteByIdMethodTest() {
		Long id= 12L;
		productRepository.deleteById(id);
		Optional<Product> opt=productRepository.findById(id);
		if(opt.isEmpty()) {
			LOG.info("product deleted");
		}
	}
	
	@Test
	@Disabled
	public void deleteMethodTest() {
		Long id= 13L;
		Optional<Product> opt=productRepository.findById(id);
		Product p = opt.get();
		productRepository.delete(p);
		opt = productRepository.findById(id);
		if(opt.isEmpty()) {
			LOG.info("product deleted");
		}
	}
	
	@Test
	@Disabled
	public void deleteAllTest() {
		productRepository.deleteAll();
	}
	
	@Test
	@Disabled
	public void deleteAllWithSelectTest() {
		Long id1 = 20L;
		Long id2 = 21L;
		Optional<Product> opt1 = productRepository.findById(id1);
		Optional<Product> opt2 = productRepository.findById(id2);
		Product p1 = opt1.get();
		Product p2 = opt2.get();
		productRepository.deleteAll(List.of(p1,p2));
		if(productRepository.findById(id1).isEmpty() && productRepository.findById(id2).isEmpty())
		{
			LOG.info("Records deleted.");
		}	
	}
	
	@Test
	@Disabled
	public void existByIdMethod() {
		boolean existStatus = productRepository.existsById(20L);
		LOG.info("record exists: "+ existStatus);
	}
	
	@Test
	@Disabled
	public void countMethod() {
		Long count = productRepository.count();
		LOG.info("Number of recouds: "+ count);
	}
	

}
