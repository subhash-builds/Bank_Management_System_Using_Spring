package com.bank.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.TransactionDetails;
import com.bank.repository.TransactionRepository;

@Repository
public class TransactionDAO {
	// transactionid, customeraccountnumber, transactionamount, transactionbalance,
	// transactiondate, transactiontime, transactiontype, paymenttype, remarks,
	// user_id

	@Autowired
	TransactionRepository transactionRepository;

	public void insertTransactionDetails(TransactionDetails transactionDetails) {
		transactionRepository.save(transactionDetails);
	}

}
