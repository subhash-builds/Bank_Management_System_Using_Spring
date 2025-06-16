package com.bank.DTO;

import org.springframework.stereotype.Component;

@Component
public class BankUserDTO {
//	
//	/h1>
//	<input type="text" name="name" placeholder="UserName">
//	<input type="email" name="emailid" placeholder="EmailId">
//	<input type="number" name="aadhaarnumber" placeholder="AadhaarNumber">
//	<input type="tel" name="mobilenumber" placeholder="MobileNumber">
//	<input type="text" name="gender" placeholder="Gender">
//	<textarea rows="3" cols="" type="text" name="address" placeholder="Address"></textarea> 
//	<input type="number" name="amount" placeholder="Amount">
//

	private Integer id;
	private String name;
	private String emailid;
	private Long aadhaarnumber;
	private Long mobilenumber;
	private String gender;
	private String address;
	private Double amount;

	public BankUserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankUserDTO(int id, String name, String emailid, Long aadhaarnumber, Long mobilenumber, String gender,
			String address, Double amount) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.aadhaarnumber = aadhaarnumber;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getAadhaarnumber() {
		return aadhaarnumber;
	}

	public void setAadhaarnumber(Long aadhaarnumber) {
		this.aadhaarnumber = aadhaarnumber;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankUserDTO [id=" + id + ", name=" + name + ", emailid=" + emailid + ", aadhaarnumber=" + aadhaarnumber
				+ ", mobilenumber=" + mobilenumber + ", gender=" + gender + ", address=" + address + ", amount="
				+ amount + "]";
	}

}
