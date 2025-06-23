package com.bank.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_details")
public class TransactionDetails {
	// transaction_id, transaction_amount, transaction_date,
	// transaction_time, transaction_balance, customer_account_number,
	// transaction_type

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionid;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private BankUserDetails user;

	private double transactionamount;
	private LocalDate transactiondate;// 2003-09-23->YYYY-MM-DD
	private LocalTime transactiontime;
	private double transactionbalance;
	private long customeraccountnumber;
	private String transactiontype;
	private String paymenttype;
	private String remarks;

	@PrePersist
	public void onCreate() {
		this.transactiondate = LocalDate.now();
		this.transactiontime = LocalTime.now();
	}

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(int transactionid, BankUserDetails user, double transactionamount,
			LocalDate transactiondate, LocalTime transactiontime, double transactionbalance, long customeraccountnumber,
			String transactiontype, String paymenttype, String remarks) {
		super();
		this.transactionid = transactionid;
		this.user = user;
		this.transactionamount = transactionamount;
		this.transactiondate = transactiondate;
		this.transactiontime = transactiontime;
		this.transactionbalance = transactionbalance;
		this.customeraccountnumber = customeraccountnumber;
		this.transactiontype = transactiontype;
		this.paymenttype = paymenttype;
		this.remarks = remarks;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public BankUserDetails getUser() {
		return user;
	}

	public void setUser(BankUserDetails user) {
		this.user = user;
	}

	public double getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(double transactionamount) {
		this.transactionamount = transactionamount;
	}

	public LocalDate getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(LocalDate transactiondate) {
		this.transactiondate = transactiondate;
	}

	public LocalTime getTransactiontime() {
		return transactiontime;
	}

	public void setTransactiontime(LocalTime transactiontime) {
		this.transactiontime = transactiontime;
	}

	public double getTransactionbalance() {
		return transactionbalance;
	}

	public void setTransactionbalance(double transactionbalance) {
		this.transactionbalance = transactionbalance;
	}

	public long getCustomeraccountnumber() {
		return customeraccountnumber;
	}

	public void setCustomeraccountnumber(long customeraccountnumber) {
		this.customeraccountnumber = customeraccountnumber;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transactionid=" + transactionid + ", user=" + user + ", transactionamount="
				+ transactionamount + ", transactiondate=" + transactiondate + ", transactiontime=" + transactiontime
				+ ", transactionbalance=" + transactionbalance + ", customeraccountnumber=" + customeraccountnumber
				+ ", transactiontype=" + transactiontype + ", paymenttype=" + paymenttype + ", remarks=" + remarks
				+ "]";
	}

}
