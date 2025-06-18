package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.DAO.AdminDAO;
import com.bank.DTO.AdminDTO;
import com.bank.entity.AdminDetails;
import com.bank.exception.AdminDetailsException;
import com.bank.exception.AdminLoginException;

@Component
public class AdminService {

	@Autowired
	AdminDAO adminDAO;

	public void validateAndRegisterAdminDetails(AdminDTO adminDTO) {

		if (adminDTO.getAdminpassword().length() > 6) {

		} else {

			throw new AdminDetailsException("Invalid  Password");
		}

		AdminDetails adminDetails = new AdminDetails();
		adminDetails.setName(adminDTO.getAdminname());
		adminDetails.setPassword(adminDTO.getAdminpassword());
		adminDetails.setRole(adminDTO.getAdminrole());
		adminDetails.setContactno(adminDTO.getContactno());

		adminDetails.setBranch(adminDTO.getBranch());
		adminDetails.setEmailid(adminDTO.getEmailid());
		System.out.println("Before" + adminDetails);
		AdminDetails adminDetails2 = adminDAO.insertAdminDetails(adminDetails);
		System.out.println("After" + adminDetails2);
		System.out.println("Data Inserted.");
	}

	public boolean checkingAdminId(int id) {

		if (adminDAO.getAdminDetailsBasedOnAdminId(id)) {
			return true;
		} else {
			throw new AdminLoginException("Invalid id");
		}
	}

}
