package com.bi.billing.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.billing.model.Category;
import com.bi.billing.model.Product;
import com.bi.billing.repository.ProductRepository;
import com.bi.billing.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findByCategory(Category category) {
		return productRepository.findByCategory(category);
	}
	

}
