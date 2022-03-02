package com.github.manimovassagh.springdata.product.repos;

import org.springframework.data.repository.CrudRepository;

import com.github.manimovassagh.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
