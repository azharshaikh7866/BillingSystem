package com.bi.billing.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bi.billing.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable>{

}
