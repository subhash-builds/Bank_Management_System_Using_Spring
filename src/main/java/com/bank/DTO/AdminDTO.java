package com.bank.DTO;

public class AdminDTO {

//	<input type="text" placeholder="Admin Name" name="adminname">
//	<input type="password" placeholder="Admin Password" name="adminpassword">
//	<input type="text" placeholder="Admin Role" name="adminrole">

	private int adminid;
	private String adminname;
	private String adminpassword;
	private String adminrole;
	private long contactno;
	private String emailid;
	private String branch;

	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDTO(int adminid, String adminname, String adminpassword, String adminrole, long contactno,
			String emailid, String branch) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
		this.adminrole = adminrole;
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
		return "AdminDTO [adminid=" + adminid + ", adminname=" + adminname + ", adminpassword=" + adminpassword
				+ ", adminrole=" + adminrole + ", contactno=" + contactno + ", emailid=" + emailid + ", branch="
				+ branch + "]";
	}

}
