package com.bank.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.AdminDetails;
import com.bank.repository.AdminRepository;

@Repository
public class AdminDAO {

	@Autowired
	private AdminRepository adminRepository;

	public AdminDetails insertAdminDetails(AdminDetails adminDetails) {

		AdminDetails save = adminRepository.save(adminDetails);// 🔄 Actual database INSERT/UPDATE happens here.

		System.out.println(adminRepository.getClass());
		return save;

	}

	public boolean getAdminDetailsBasedOnAdminId(int id) {

		Optional<AdminDetails> ad = adminRepository.findById(id);
		ad.map(AdminDetails::getName).orElse("Anonymous");
		return ad.isPresent();

	}

}
