package com.bank.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private double transactionamount;
	private Date transactiondate;// 2003-09-23->YYYY-MM-DD
	private Time transactiontime;
	private double transactionbalance;
	private long customeraccountnumber;
	private String transactiontype;
	private String reason;

	@PrePersist
	public void onCreate() {
		this.transactiondate = new java.sql.Date(System.currentTimeMillis());
		this.transactiontime = new java.sql.Time(System.currentTimeMillis());
	}

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(int transactionid, double transactionamount, Date transactiondate, Time transactiontime,
			double transactionbalance, long customeraccountnumber, String transactiontype) {
		super();
		this.transactionid = transactionid;
		this.transactionamount = transactionamount;
		this.transactiondate = transactiondate;
		this.transactiontime = transactiontime;
		this.transactionbalance = transactionbalance;
		this.customeraccountnumber = customeraccountnumber;
		this.transactiontype = transactiontype;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public double getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(double transactionamount) {
		this.transactionamount = transactionamount;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public Time getTransactiontime() {
		return transactiontime;
	}

	public void setTransactiontime(Time transactiontime) {
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

	@Override
	public String toString() {
		return "TransactionDetails [transactionid=" + transactionid + ", transactionamount=" + transactionamount
				+ ", transactiondate=" + transactiondate + ", transactiontime=" + transactiontime
				+ ", transactionbalance=" + transactionbalance + ", customeraccountnumber=" + customeraccountnumber
				+ ", transactiontype=" + transactiontype + "]";
	}

}
