package com.bi.billing.service;

import java.util.List;

import com.bi.billing.model.Category;

public interface CategoryService {


	public List<Category> findAll();
	
	public Category findById(long categoryId);
}
