package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_details")
public class AdminDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private int adminid;
	@Column(name = "admin_name", nullable = false)
	private String name;
	@Column(name = "admin_password", nullable = false)
	private String password;
	@Column(name = "admin_role", nullable = false)
	private String role;
	@Column(name = "admin_contact", nullable = false)
	private long contactno;
	@Column(name = "admin_emailid")
	private String emailid;
	@Column(name = "admin_branch")
	private String branch;

	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDetails(int adminid, String name, String password, String role, long contactno, String emailid,
			String branch) {
		super();
		this.adminid = adminid;
		this.name = name;
		this.password = password;
		this.role = role;
		this.contactno = contactno;
		this.emailid = emailid;
		this.branch = branch;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "AdminDetails [adminid=" + adminid + ", name=" + name + ", password=" + password + ", role=" + role
				+ ", contactno=" + contactno + ", emailid=" + emailid + ", branch=" + branch + "]";
	}

}
