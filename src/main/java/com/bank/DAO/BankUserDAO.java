package com.bank.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.BankUserDetails;
import com.bank.repository.BankUserRepository;

@Repository // Used to specify the class is using repository to perform
public class BankUserDAO {

	@Autowired
	private BankUserRepository bankUserRepository;// internally using proxy implementation class

	public BankUserDetails insertBankUserDetails(BankUserDetails bankUserDetails) {
		BankUserDetails save = bankUserRepository.save(bankUserDetails);
		System.out.println(bankUserRepository.getClass());
		System.out.println(save);
		return save;
	}

	public List<BankUserDetails> getAllBankUserDetails() {

		List<BankUserDetails> allUsers = bankUserRepository.findAll();

		return allUsers;

	}

	public boolean deletedUserDetailsUsingId(int userId) {

		bankUserRepository.deleteById(userId);
		return true;
	}

	public BankUserDetails updateBankUserDetails(int userId) {
		Optional<BankUserDetails> bankUserDetails = bankUserRepository.findById(userId);
		return bankUserDetails.get();
	}

	public List<BankUserDetails> getUserDetailsByName(String name) {

		return bankUserRepository.findByName(name);

	}

}
