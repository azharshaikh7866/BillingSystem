package com.bi.billing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.billing.repository.TaxRepository;
import com.bi.billing.service.TaxService;

@Service
public class TaxServiceImpl implements TaxService {
	
	@Autowired
	TaxRepository TaxRepository;
	

}
