package com.bi.billing.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bi.billing.model.Category;
import com.bi.billing.model.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable>{
	
	List<Product> findByCategory(Category category);

}
