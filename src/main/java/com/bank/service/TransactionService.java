package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.TransactionDAO;
import com.bank.entity.BankUserDetails;
import com.bank.entity.TransactionDetails;

@Service
public class TransactionService {

	// transactionid, customeraccountnumber, transactionamount, transactionbalance,
	// transactiondate, transactiontime, transactiontype, paymenttype, remarks,
	// user_id

	@Autowired
	TransactionDAO transactionDAO;

	public void insertTransactionDetails(BankUserDetails bankUserDetails, double amount, String mode, String remarks,
			String transactiontype) {

		TransactionDetails transactionDetails = new TransactionDetails();
		transactionDetails.setCustomeraccountnumber(bankUserDetails.getAccountnumber());

		transactionDetails.setTransactionamount(amount);

		transactionDetails.setTransactionbalance(bankUserDetails.getAmount());

		transactionDetails.setTransactiontype(transactiontype);

		transactionDetails.setPaymenttype(mode);

		transactionDetails.setUser(bankUserDetails);

		transactionDetails.setRemarks(remarks);

		transactionDAO.insertTransactionDetails(transactionDetails);

	}

}
