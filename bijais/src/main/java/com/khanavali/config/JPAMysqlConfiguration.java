package com.khanavali.config;

import java.sql.SQLException;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.khanavali.persistence.repository.CustomerRepository;
import com.khanavali.persistence.repository.MenuItemRepository;
import com.khanavali.persistence.repository.OrdersRepository;

@Configuration
@EnableJpaRepositories(basePackages = "com.khanavali.persistence.repository", includeFilters = @ComponentScan.Filter(value = {
		OrdersRepository.class, MenuItemRepository.class,
		CustomerRepository.class }, type = FilterType.ASSIGNABLE_TYPE))
@EnableTransactionManagement
public class JPAMysqlConfiguration {

	@Bean
	public DataSource dataSource() throws SQLException {
		DriverManagerDataSource dmDataSource = new DriverManagerDataSource();
		dmDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dmDataSource
				.setUrl("jdbc:mysql://snpdb.cdzdjmavsv7l.ap-southeast-1.rds.amazonaws.com:3306/snpdb");
		dmDataSource.setUsername("snproot");
		dmDataSource.setPassword("snpr00t123");
		return dmDataSource;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() throws SQLException {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(false);
		vendorAdapter.setShowSql(true);
		vendorAdapter
				.setDatabase(org.springframework.orm.jpa.vendor.Database.MYSQL);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		Properties jpaProperties = new Properties();
		
		jpaProperties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		jpaProperties.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
		jpaProperties.setProperty("hibernate.connection.url","jdbc:mysql://snpdb.cdzdjmavsv7l.ap-southeast-1.rds.amazonaws.com:3306/snpdb");
		jpaProperties.setProperty("hibernate.connection.username","snproot");
		jpaProperties.setProperty("hibernate.connection.password","snpr00t123");
		//jpaProperties.setProperty("hibernate.hbm2ddl.auto", "validate");
		jpaProperties.setProperty("hibernate.connection.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");
		jpaProperties.setProperty("hibernate.c3p0.maxSize", "1");
		jpaProperties.setProperty("hibernate.c3p0.minSize", "1");
		jpaProperties.setProperty("hibernate.c3p0.acquireIncrement", "1");
		jpaProperties.setProperty("hibernate.c3p0.idleTestPeriod", "300");
		jpaProperties.setProperty("hibernate.c3p0.maxStatements", "0");
		jpaProperties.setProperty("hibernate.c3p0.timeout", "1800");
		jpaProperties.setProperty("hibernate.c3p0.checkoutTimeout", "0");
		jpaProperties.setProperty("hibernate.c3p0.preferredTestQuery",
				"SELECT * FROM poolping");
		factory.setJpaProperties(jpaProperties);
		HibernateJpaDialect jpaDialect = new HibernateJpaDialect();
		factory.setJpaDialect(jpaDialect);
		factory.setPackagesToScan("com.khanavali.persistence.domain");
		//factory.setDataSource(dataSource());
		factory.afterPropertiesSet();

		return factory.getObject();
	}

	@Bean
	public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
		return entityManagerFactory.createEntityManager();
		
	}
	@Bean
	public PlatformTransactionManager transactionManager() throws SQLException {

		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		return txManager;
	}

	@Bean
	public HibernateExceptionTranslator hibernateExceptionTranslator() {
		return new HibernateExceptionTranslator();
	}
}
