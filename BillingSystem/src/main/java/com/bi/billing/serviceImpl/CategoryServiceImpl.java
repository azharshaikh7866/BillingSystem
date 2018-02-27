package com.bi.billing.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.billing.model.Category;
import com.bi.billing.repository.CategoryRepository;
import com.bi.billing.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(long categoryId) {
		return categoryRepository.findOne(categoryId);
	}
	

}
