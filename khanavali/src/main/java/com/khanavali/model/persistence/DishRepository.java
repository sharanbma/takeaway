package com.khanavali.model.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author melkotek
 * Created on 15 Oct 2013 at 23:06:14
 * Eclipse IDE
 *
 */

public interface DishRepository extends CrudRepository<Dish, Long>{
	
	List<Dish> findById(long id);
	
	List<Dish> findByName(String name);
	
	List<Dish> findByShortDescription(String shortDescription);

}
