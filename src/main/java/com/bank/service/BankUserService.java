package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.BankUserDAO;
import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.exception.InvalidBankUserDetailsException;
import com.bank.exception.UpdatedUserDetailsException;

@Service
public class BankUserService {

	@Autowired
	BankUserDAO bankUserDAO;

	public void validateBankUserDetailsAndInsert(BankUserDTO bankUserDTO) {

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
		System.out.println("Details shifted from dto to entity");
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

	public void updateBankUserDetails(BankUserDTO bankUserDTO) {

		if (bankUserDTO.getEmailid().contains("@gmail.com")) {

		} else {
			throw new UpdatedUserDetailsException("Invalid Email Id");
		}

		if ((bankUserDTO.getAadhaarnumber() + "").matches("^[0-9]{12}")) {

		} else {
			throw new UpdatedUserDetailsException("Invalid Aadhaar Number");
		}

		if ((bankUserDTO.getMobilenumber() + "").matches("^[6-9]{1}[0-9]{9}$")) {

		} else {
			throw new UpdatedUserDetailsException("Invalid Mobile Number");

		}

		BankUserDetails bankUserDetails = new BankUserDetails();
		// Auto-increment happening from every new entity class object.

		bankUserDetails.setUserid(bankUserDTO.getId());
		bankUserDetails.setName(bankUserDTO.getName());
		bankUserDetails.setEmailid(bankUserDTO.getEmailid());
		bankUserDetails.setAadhaarnumber(bankUserDTO.getAadhaarnumber());
		bankUserDetails.setMobilenumber(bankUserDTO.getMobilenumber());
		bankUserDetails.setAddress(bankUserDTO.getAddress());
		bankUserDetails.setGender(bankUserDTO.getGender());
		bankUserDetails.setAmount(bankUserDTO.getAmount());
		bankUserDAO.insertBankUserDetails(bankUserDetails);

	}

	public List<BankUserDetails> findUsingDetailsByName(String username) {

		List<BankUserDetails> sortedListByName = bankUserDAO.getUserDetailsByName(username);

		if (sortedListByName.size() != 0) {
			return sortedListByName;
		}
		return null;

	}

}
