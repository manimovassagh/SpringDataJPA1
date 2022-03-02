package com.github.manimovassagh.springdata.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.github.manimovassagh.springdata.product.entities.Product;
import com.github.manimovassagh.springdata.product.repos.ProductRepository;

@SpringBootTest
class ProductdataApplicationTests {
	

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
		System.out.println("Check the test");
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone 13");
		product.setDesc("This is a brand new Iphone 13");
		product.setPrice(1220.58);
		productRepository.save(product);

	}

	@Test
	public void testRead() {
		Product product = productRepository.findById(1).get();
		Assertions.assertNotNull(product);
		Assertions.assertEquals("Iphone 13", product.getName());
		System.out.println("Product Description is " + product.getDesc());
	
	}
	
	@Test
	public void testUpdate() {
		Product product = productRepository.findById(1).get();
		product.setPrice(950.45);
		productRepository.save(product);
		Assertions.assertNotNull(product);
		Assertions.assertEquals(950.45, product.getPrice());
	}
	
	
	
//		@Test
//		@DirtiesContext
//		public void testDelete() {
//		productRepository.deleteById(1);
//		
//	}

}
