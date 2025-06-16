package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.BankUserDetails;

//we are creating our custom repository interface which extends JpaRepository(user to perform crud operation in sping mvc)
public interface BankUserRepository extends JpaRepository<BankUserDetails, Integer> {

	// Spring will automatically generate sql query and implement given adstract
	// method.
	/*
	 * Spring Data JPA parses findByName and generates SQL like:
	 * 
	 * sql: SELECT * FROM bank_user_details WHERE name = ?
	 */
	// internally using equal().IgnoreCasting
	List<BankUserDetails> findByName(String name);// chances of getting property not found exception in case of camel
													// casing in entity class for variables.

}
