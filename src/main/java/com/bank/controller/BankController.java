package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.service.BankUserService;

@Controller
public class BankController {

	@Autowired
	BankUserService bankUserService;

	@RequestMapping("/registrationpage")
	public String registrationPage() {

		return "BankUserRegistrationPage";

	}

	@RequestMapping("/bankaccountregistrationrequest")
	public void registrationRequest(BankUserDTO bankUserDetails) {

		System.out.println(bankUserDetails);
		bankUserService.validateBankUsedDetails(bankUserDetails);

	}

	@RequestMapping("/bankuserlist")
	public String getAllBankUserList(Model model) {

		List<BankUserDetails> userList = bankUserService.fetchAllUserDetails();
		model.addAttribute("allUserList", userList);
		return "AllUserList";
	}

	@RequestMapping("/deletethedetails")
	public String deleteTheDetails(int userid) {
		System.out.println(userid);// deleteById() method is used to deleted the data
		bankUserService.deleteUserDetailsById(userid);
		return "redirect:/rbi/bankuserlist";

	}

	@RequestMapping("updateuserdetails")
	public String updateUserDetails(int userid, Model model) {

		System.out.println(userid);
		BankUserDetails bankUserDetails = bankUserService.updateUserDetails(userid);
		model.addAttribute("bankUserDetails", bankUserDetails);
		return "UpdateUserDetails";

	}

}
