package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_userdetails")
public class BankUserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(length = 40, nullable = false)
	private String name;
	@Column(nullable = false, unique = true)
	private String emailid;
	@Column(nullable = false, unique = true)
	private Long aadhaarnumber;
	@Column(nullable = false, unique = true)
	private Long mobilenumber;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private Double amount;
	private long accountnumber;
	private int pinnum;

	public BankUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankUserDetails(int userid, String name, String emailid, Long aadhaarnumber, Long mobilenumber,
			String gender, String address, Double amount, long accountnumber, int pinnum) {
		super();
		this.userid = userid;
		this.name = name;
		this.emailid = emailid;
		this.aadhaarnumber = aadhaarnumber;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
		this.accountnumber = accountnumber;
		this.pinnum = pinnum;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getPinnum() {
		return pinnum;
	}

	public void setPinnum(int pinnum) {
		this.pinnum = pinnum;
	}

	@Override
	public String toString() {
		return "BankUserDetails [userid=" + userid + ", name=" + name + ", emailid=" + emailid + ", aadhaarnumber="
				+ aadhaarnumber + ", mobilenumber=" + mobilenumber + ", gender=" + gender + ", address=" + address
				+ ", amount=" + amount + ", accountnumber=" + accountnumber + ", pinnum=" + pinnum + "]";
	}

}
