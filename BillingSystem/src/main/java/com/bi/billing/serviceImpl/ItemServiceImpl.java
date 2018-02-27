package com.bi.billing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.billing.repository.ItemRepository;
import com.bi.billing.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository ItemRepository;
	

}
