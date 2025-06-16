package com.bank.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // used to handle gobal exception.
public class BankExceptionHandler {

//	@ResponseBody
//	@ExceptionHandler(InvalidBankUserDetailsException.class)
//	public String userDetailsExceptionHandling(InvalidBankUserDetailsException ibude) {
//
//		System.out.println("Bank user details exception handler");
//
//		return ibude.getMessage();
//	}

	@ExceptionHandler(InvalidBankUserDetailsException.class)
	public String userDetailsExceptionHandling(InvalidBankUserDetailsException ibude, Model model) {

		System.out.println("Bank user details exception handler");

		model.addAttribute("exceptionmessage", ibude.getMessage());

		return "BankUserRegistrationPage";

	}

	@ExceptionHandler(AdminDetailsException.class)
	public String adminDetailsExceptionHandling(AdminDetailsException ade, Model model) {

		System.out.println("Admin details Exception");
		model.addAttribute("excMessage", ade.getExpMessage());
		return "AdminRegistration";
	}

	@ExceptionHandler(AdminLoginException.class)
	public String adminLoginExceptionHandling(AdminLoginException adminLoginException, Model model) {
		System.out.println("Admin login exception/like invalid id");
		model.addAttribute("idExce", adminLoginException.getExpMessage());
		return "AdminLogin";
	}

	@ExceptionHandler(UpdatedUserDetailsException.class)
	public String updatedUserDetailsExceptionHandling(UpdatedUserDetailsException uude, Model model) {

		System.out.println("Bank updated user details exception handler");

		model.addAttribute("messexce", uude.getExcMessage());

		return "UpdateUserDetails";

	}

}
