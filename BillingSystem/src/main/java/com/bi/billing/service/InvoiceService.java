package com.bi.billing.service;

import java.util.List;

import com.bi.billing.model.Invoice;

public interface InvoiceService {
	
	public Invoice findById(int Id);
	
	public List<Invoice> all();

}
