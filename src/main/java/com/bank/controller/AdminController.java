
package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.DTO.AdminDTO;
import com.bank.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping("/adminregiserpage")
	public String adminRegistrationPage() {

		System.out.println("page opened");
		return "AdminRegistration";
	}

	@RequestMapping("/adminregrequest")
	public void adminRegistrationRequest(AdminDTO admindto) {
		System.out.println("request received");

		System.out.println(admindto);
		adminService.validateAndRegisterAdminDetails(admindto);

	}

	@RequestMapping("/adminloginpage")
	public String loginpage() {
		System.out.println("admin login");
		return "AdminLogin";
	}

	@RequestMapping("/adminloginreq")
	public String adminloginreq(int adminid) {

		adminService.checkingAdminId(adminid);
		return "redirect:/rbi/adminoperation";// This shift request from one controller to another.
		// It is handled not by InternalResourceViewResolver, but by Spring’s built-in
		// ViewResolver mechanism that detects
		// special view prefixes — specifically, RedirectView.

	}

	@RequestMapping("/adminoperation")
	public String adminOperations() {
		return "AdminOperation";
	}

}
