package com.khanavali.persistence.repository;

import com.khanavali.persistence.domain.MenuItem;

public interface MenuItemRepository {

  MenuItem save(MenuItem item);

  void delete(String key);

  MenuItem findById(String key);

  Iterable<MenuItem> findAll();
}
