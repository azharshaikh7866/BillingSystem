package com.bi.billing.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bi.billing.model.Tax;

public interface TaxRepository extends JpaRepository<Tax, Serializable>{

}
