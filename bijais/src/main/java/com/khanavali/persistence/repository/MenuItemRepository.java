package com.khanavali.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.khanavali.persistence.domain.MenuItem;

@Transactional
public interface MenuItemRepository extends CrudRepository<MenuItem, String> {

  MenuItem save(MenuItem item);

  void delete(String key);

  MenuItem findById(String key);

  Iterable<MenuItem> findAll();
}
