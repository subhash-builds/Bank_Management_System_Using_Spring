package com.bank.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.BankUserDAO;
import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.exception.InvalidBankUserDetailsException;
import com.bank.exception.UpdatedUserDetailsException;
import com.bank.exception.UserLoginException;

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
		bankUserDetails.setUserstatus("Pending");
		System.out.println("Details shifted from dto to entity");
		bankUserDAO.insertBankUserDetails(bankUserDetails);

	}

	public List<BankUserDetails> fetchAllUserDetails() {

		return bankUserDAO.getAllBankUserDetails();

	}

	public boolean deleteUserDetailsById(int userId) {
		return bankUserDAO.deletedUserDetailsUsingId(userId);
	}

	public BankUserDetails getUserDetailsById(int userid) {

		BankUserDetails bankUserDetails = bankUserDAO.getBankUserDetailsById(userid);
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

	public List<BankUserDetails> findUserDetailsByName(String username) {

		List<BankUserDetails> sortedListByName = bankUserDAO.getUserDetailsByName(username);

		if (sortedListByName.size() != 0) {
			return sortedListByName;
		}
		return null;

	}

	public BankUserDetails findUserDeatilsByName(long mobilenumber) {

		BankUserDetails bankUserDetails = bankUserDAO.getUserDetailsByMobileNumber(mobilenumber);
		if (bankUserDetails != null) {
			return bankUserDetails;
		}
		return null;
	}

	public List<BankUserDetails> findPendingUserDetails() {

		List<BankUserDetails> pendingUsindList = bankUserDAO.getPendingUserDetailsByUsingStatus();
		if (pendingUsindList.size() != 0) {
			return pendingUsindList;
		}
		return null;

	}

	public BankUserDetails acceptRegRequest(int id) {
		Random random = new Random();
		int accountnumber = random.nextInt(10000000);
		if (accountnumber < 1000000) {
			accountnumber += 1000000;
		}
		int pinnum = random.nextInt(10000);
		if (pinnum < 1000) {
			pinnum += 1000;
		}
		BankUserDetails bankUserDetails = bankUserDAO.getBankUserDetailsById(id);
		bankUserDetails.setAccountnumber(accountnumber);
		bankUserDetails.setPinnum(pinnum);
		bankUserDetails.setUserstatus("Accepted");
		bankUserDAO.updateBankUserDetails(bankUserDetails);
		return bankUserDAO.getBankUserDetailsById(id);

	}

	public BankUserDetails findUserDetailsByPinNumberAndEmailid(long accountNo, long mobileNo, int pinnum) {

		Optional<BankUserDetails> optionalBud = bankUserDAO.getUserDetailsByPinNumber(accountNo, mobileNo);

		BankUserDetails bud = optionalBud.orElseThrow(
				() -> new UserLoginException("Invalid AccountNumber/Invalid Mobile Number/Not Registered"));
		Optional<Integer> optionalEmailid = optionalBud.map(BankUserDetails::getPinnum);

		if (optionalEmailid.get() == pinnum) {
			return bud;
		} else {
			throw new UserLoginException("Invalid Pin");
		}

	}

	public void userAccountClosingRequest(int userid) {

		BankUserDetails user = bankUserDAO.getBankUserDetailsById(userid);

		user.setUserstatus("Closed");
		bankUserDAO.updateBankUserDetails(user);
	}

	public List<BankUserDetails> getClosingUserList() {
		List<BankUserDetails> closingUserList = bankUserDAO.getAllBankUserDetails().stream()
				.filter(user -> user.getUserstatus().equals("Closed")).collect(Collectors.toList());
		return closingUserList;
	}

	public boolean rejectClosingRequest(int userid) {

		BankUserDetails user = bankUserDAO.getBankUserDetailsById(userid);

		user.setUserstatus("Accepted");

		bankUserDAO.updateBankUserDetails(user);
		return true;

	}

}
