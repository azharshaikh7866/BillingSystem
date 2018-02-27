package com.bi.billing.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bi.billing.model.Invoice;
import com.bi.billing.repository.InvoiceRepository;
import com.bi.billing.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	InvoiceRepository invoiceRepository;
	
	public Invoice findById(int Id) {
		return invoiceRepository.findById(Id);
	}
	
	public List<Invoice> all(){
		return invoiceRepository.all();
	}
	

}
