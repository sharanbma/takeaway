package com.khanavali.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.khanavali.persistence.domain.Customer;

@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  Customer save(Customer customer);

  void delete(Long customerId);

  Customer findByCustomerId(long customerId);

  Iterable<Customer> findAll();
  
  Customer findByUserId(String userId);
  
  Customer findByEmailId(String emailId);
}
