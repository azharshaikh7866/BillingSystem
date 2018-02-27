package com.bi.billing.service;

import java.util.List;

import com.bi.billing.model.Category;
import com.bi.billing.model.Product;

public interface ProductService {
	
	List<Product> findByCategory(Category category);

}
