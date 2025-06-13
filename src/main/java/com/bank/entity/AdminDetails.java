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
	private int id;
	@Column(name = "admin_name", nullable = false)
	private String name;
	@Column(name = "admin_password", nullable = false)
	private String password;
	@Column(name = "admin_role", nullable = false)
	private String role;

	public AdminDetails(String name, String password, String role) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "AdminDetails [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}

}
