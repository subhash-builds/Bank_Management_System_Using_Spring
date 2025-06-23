package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.TransactionDetails;

public interface TransactionRepository extends JpaRepository<TransactionDetails, Integer> {

}
