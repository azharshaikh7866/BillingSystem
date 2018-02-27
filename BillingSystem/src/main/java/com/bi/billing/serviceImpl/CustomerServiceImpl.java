package com.bi.billing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.billing.repository.CustomerRepository;
import com.bi.billing.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository CustomerRepository;
	

}
