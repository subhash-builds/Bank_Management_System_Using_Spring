package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUserDetails;
import com.bank.service.BankUserService;

@Controller
public class BankUserController {

	@Autowired
	BankUserService bankUserService;

	@RequestMapping("/userregistrationpage")
	public String registrationPage() {
		System.out.println("user registration page is opened.");
		return "BankUserRegistrationPage";

	}

	@ResponseBody
	@RequestMapping("/bankaccountregistrationrequest")
	public String registrationRequest(BankUserDTO bankUserDetails) {
		System.out.println(bankUserDetails);
		System.out.println("User details are inserted");
		bankUserService.validateBankUserDetailsAndInsert(bankUserDetails);
		return "Registration Request Send";

	}

	@RequestMapping("/getalluserdetails")
	public String getAllBankUserList(Model model) {

		List<BankUserDetails> userList = bankUserService.fetchAllUserDetails();
		model.addAttribute("allUserList", userList);
		return "AllUserList";
	}

	@RequestMapping("/deletetheuserdetails")
	public String deleteTheDetails(int userid) {
		System.out.println("deleting " + userid);// deleteById() method is used to deleted the data
		bankUserService.deleteUserDetailsById(userid);
		return "redirect:/rbi/bankuserlist";

	}

	@RequestMapping("/updateuserdetails")
	public String updateUserDetails(int userid, Model model) {

		System.out.println(userid);
		BankUserDetails bankUserDetails = bankUserService.getUserDetailsById(userid);
		model.addAttribute("bankUserDetails", bankUserDetails);
		return "UpdateUserDetails";

	}

	@RequestMapping("/updateduserdetailsrequest")
	public String updatedUserDetails(BankUserDTO bankUserDTO) {

		System.out.println("update started");
		bankUserService.updateBankUserDetails(bankUserDTO);
		System.out.println("user details are updated");

		return "redirect:/rbi/bankuserlist";
	}

	@RequestMapping("/fileruserdetails")
	public String filterUserDetailsByUsingName(String username, Model model) {

		System.out.println("sorting by name started");
		List<BankUserDetails> sortedListByName = (List<BankUserDetails>) bankUserService
				.findUserDetailsByName(username);
		System.out.println(sortedListByName);

		model.addAttribute("allUserList", sortedListByName);

		System.out.println("Sort Completed");
		return "AllUserList";
	}

	// @RequestMapping("/fileruserdetails")
	public String filterUserDetailsByMobileNumber(long mobilenumber, Model model) {

		System.out.println("sorting by mobile number started");
		BankUserDetails bankUserDetails = bankUserService.findUserDeatilsByName(mobilenumber);
		System.out.println(bankUserDetails);

		model.addAttribute("allUserList", bankUserDetails);

		System.out.println("Sort Completed");
		return "AllUserList";
	}

	@RequestMapping("/getpendinguserdetails")
	public String fetchPendingUsedDetails(Model model) {

		List<BankUserDetails> regPendingUserList = (List<BankUserDetails>) bankUserService.findPendingUserDetails();
		model.addAttribute("regpendinguserlist", regPendingUserList);
		return "PendingUserList";

	}

	@RequestMapping("/filerpendinguserdetails")
	public String filterPendingUserDetailsByUsingName(String username, Model model) {

		System.out.println("sorting started");
		List<BankUserDetails> sortedPendingUsedList = (List<BankUserDetails>) bankUserService
				.findUserDetailsByName(username);
		System.out.println(sortedPendingUsedList);

		model.addAttribute("regpendinguserlist", sortedPendingUsedList);

		System.out.println("Sort Completed");
		return "PendingUserList";
	}

	// @ResponseBody, it is first then redirect.
	@RequestMapping("/acceptuserdetails")
	public String acceptRegistrationRequestOperation(int userid, Model model) {
		System.out.println("accept process started");

		BankUserDetails bankUserDetails = bankUserService.acceptRegRequest(userid);

		model.addAttribute("acceptedbankuserdetails", bankUserDetails);
		return "AcceptedUserDetailsCheck";

	}

	@RequestMapping("/userloginpage")
	public String loginpage() {
		System.out.println("user login page");
		return "UserLogin";
	}

	@RequestMapping("/userloginreq")
	// @RequestParam("pinnum")
	public String userMainPage(@RequestParam("number") long number, int pinnum, Model model) {
		BankUserDetails bankUserDetails = bankUserService.findUserDetailsByPinNumberAndEmailid(number, number, pinnum);
		model.addAttribute("loginedbankuserdetails", bankUserDetails);
		return "UserMainPage";
	}

	@ResponseBody
	@RequestMapping("/closeaccount")
	public String closeAccount(int userid) {

		System.out.println(userid);
		bankUserService.userAccountClosingRequest(userid);
		return "Requested For Account Closing";

	}

	@RequestMapping("/getclosinguserdetails")
	public String fetchClosingUsedDetails(Model model) {

		List<BankUserDetails> regPendingUserList = bankUserService.getClosingUserList();
		model.addAttribute("closinguserlist", regPendingUserList);
		return "ClosingUserList";

	}

	@RequestMapping("/rejectclosingrequest")
	public String rejectClosingRequest(int userid) {

		System.out.println("rejecting closing request");
		bankUserService.rejectClosingRequest(userid);
		System.out.println("rejected successfully");

		return "redirect:/rbi/getclosinguserdetails";
	}

	@RequestMapping("/depositRequest")
	public String depositRequest(int userid, Model model) {

		BankUserDetails bankUserDetails = bankUserService.getUserDetailsById(userid);

		model.addAttribute("depositinguser", bankUserDetails);

		return "UserDeposit";

	}

	@RequestMapping("/userdepositservlet")
	public void depositAmount(@RequestParam("userid") int userid, @RequestParam("amount") int amount,
			@RequestParam("mode") String mode, @RequestParam("remarks") String remarks,
			@RequestParam("transactiontype") String transactiontype) {
		System.out.println("deposit started");
		bankUserService.depositAmount(userid, amount, mode, remarks, transactiontype);

	}

	@RequestMapping("/withdrawRequest")
	public String withdrawRequest(int userid, Model model) {

		BankUserDetails bankUserDetails = bankUserService.getUserDetailsById(userid);

		model.addAttribute("depositinguser", bankUserDetails);

		return "UserWithdrawal";

	}

	@RequestMapping("/withdrawservlet")
	public void withdrawAmountFromAccount(@RequestParam("userid") int userid, @RequestParam("amount") int amount,
			@RequestParam("mode") String mode, @RequestParam("remarks") String remarks,
			@RequestParam("transactiontype") String transactiontype) {
		System.out.println("withdraw started");
		bankUserService.withdrawAmount(userid, amount, mode, remarks, transactiontype);

	}

}
