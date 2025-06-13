package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.BankUserDetails;

//we are creating our custom repository interface which extends JpaRepository(user to perform crud operation in sping mvc)
public interface BankUserRepository extends JpaRepository<BankUserDetails, Integer> {

}
