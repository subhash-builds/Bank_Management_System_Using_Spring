package com.bank.DTO;

public class AdminDTO {

//	<input type="text" placeholder="Admin Name" name="adminname">
//	<input type="password" placeholder="Admin Password" name="adminpassword">
//	<input type="text" placeholder="Admin Role" name="adminrole">

	private String adminname;
	private String adminpassword;
	private String adminrole;

	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDTO(String adminname, String adminpassword, String adminrole) {
		super();
		this.adminname = adminname;
		this.adminpassword = adminpassword;
		this.adminrole = adminrole;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public String getAdminrole() {
		return adminrole;
	}

	public void setAdminrole(String adminrole) {
		this.adminrole = adminrole;
	}

	@Override
	public String toString() {
		return "AdminDTO [adminname=" + adminname + ", adminpassword=" + adminpassword + ", adminrole=" + adminrole
				+ "]";
	}

}
