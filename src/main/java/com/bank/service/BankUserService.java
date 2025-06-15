package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.BankUserDAO;
import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.exception.InvalidBankUserDetailsException;

@Service
public class BankUserService {

	@Autowired
	BankUserDAO bankUserDAO;

	public void validateBankUsedDetails(BankUserDTO bankUserDTO) {

		if (bankUserDTO.getEmailid().contains("@gmail.com")) {

		} else {
			throw new InvalidBankUserDetailsException("Invalid Email Id");
		}

		if ((bankUserDTO.getAadhaarnumber() + "").matches("^[0-9]{12}")) {

		} else {
			throw new InvalidBankUserDetailsException("Invalid Aadhaar Number");
		}

		if ((bankUserDTO.getMobilenumber() + "").matches("^[6-9]{1}[0-9]{9}$")) {

		} else {
			throw new InvalidBankUserDetailsException("Invalid Mobile Number");

		}

		BankUserDetails bankUserDetails = new BankUserDetails();
		bankUserDetails.setName(bankUserDTO.getName());
		bankUserDetails.setEmailid(bankUserDTO.getEmailid());
		bankUserDetails.setAadhaarnumber(bankUserDTO.getAadhaarnumber());
		bankUserDetails.setMobilenumber(bankUserDTO.getMobilenumber());
		bankUserDetails.setAddress(bankUserDTO.getAddress());
		bankUserDetails.setGender(bankUserDTO.getGender());
		bankUserDetails.setAmount(bankUserDTO.getAmount());
		bankUserDAO.insertBankUserDetails(bankUserDetails);

	}

	public List<BankUserDetails> fetchAllUserDetails() {

		return bankUserDAO.getAllBankUserDetails();

	}

	public boolean deleteUserDetailsById(int userId) {
		return bankUserDAO.deletedUserDetailsUsingId(userId);
	}

	public BankUserDetails updateUserDetails(int userid) {

		BankUserDetails bankUserDetails = bankUserDAO.updateBankUserDetails(userid);
		return bankUserDetails;

	}

}
