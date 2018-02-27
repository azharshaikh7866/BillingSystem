package com.bi.billing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bi.billing.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
    
}