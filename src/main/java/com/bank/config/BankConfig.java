package com.bank.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.bank")
@EnableJpaRepositories("com.bank.repository")
public class BankConfig {

	@Bean
	public InternalResourceViewResolver getPath() {

		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver("/", ".jsp");
		return internalResourceViewResolver;

	}

	@Bean(name = "entityManagerFactory")
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {

		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("Bank_Management_System_Using_Spring");
		return localEntityManagerFactoryBean;
	}

	// reference variable should not be my method name
	@Bean(name = "transactionManager")
	public JpaTransactionManager jpaTransactionManagerBean(EntityManagerFactory emf) {

		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;

	}

}
