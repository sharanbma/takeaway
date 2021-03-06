package com.khanavali.model.persistence;

import java.util.List;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.khanavali.model.persistence.Dish;
import com.khanavali.model.persistence.DishRepository;

/**
 * @author melkotek Created on 15 Oct 2013 at 23:10:54 Eclipse IDE
 * 
 */

@Configuration
@EnableJpaRepositories
public class DishAccessor {

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/khanavali");
		source.setUsername("root");
		source.setPassword("khanavali123");

		return source;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource);
		lef.setJpaVendorAdapter(jpaVendorAdapter);
		lef.setPackagesToScan("com.khanavali.model.persistence");
		return lef;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setShowSql(true);
		hibernateJpaVendorAdapter.setGenerateDdl(false);
		hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
		return hibernateJpaVendorAdapter;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager();
	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				DishAccessor.class);
		DishRepository repository = context.getBean(DishRepository.class);

		// save a couple of dishes

		/**
		repository.save(new Dish("Kesari bath", "Sweet sooji halwa",
				"Roasted rava and sweetened",
				"http://localhost:8080/images/001.png", 1.0d, 20.0d, 1.0d, 1,
				true));
		repository.save(new Dish("Idli", "Steamed rice cakes",
				"Steamed rice cakes", "http://localhost:8080/images/002.png",
				1.0d, 20.0d, 1.0d, 1, true));
		repository.save(new Dish("Vada", "Fied lentil cakes",
				"Fried lentil cakes", "http://localhost:8080/images/003.png",
				1.0d, 20.0d, 1.0d, 1, true));
		repository.save(new Dish("Khara bath", "Savoury sooji halwa",
				"Roasted rava and spiced",
				"http://localhost:8080/images/004.png", 1.0d, 20.0d, 1.0d, 1,
				true));
		**/

		// fetch all dishes
		Iterable<Dish> dishes = repository.findAll();
		System.out.println("Dishes found with findAll():");
		System.out.println("-------------------------------");
		for (Dish dish : dishes) {
			System.out.println(dish);
		}
		System.out.println();

		// fetch an individual dish by ID
		Dish dish = repository.findOne(10L);
		System.out.println("Dish found with findOne(10L):");
		System.out.println("--------------------------------");
		System.out.println(dish);
		System.out.println();

		
		// fetch customers by last name
		List<Dish> dishs = repository.findByName("Idli");
		System.out.println("Dish found with findByName('Idli'):");
		System.out.println("--------------------------------------------");
		for (Dish dishe : dishs) {
			System.out.println(dishe);
		}


		context.close();
	}

}
