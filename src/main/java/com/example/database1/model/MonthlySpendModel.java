package com.example.database1.model;

public class MonthlySpendModel {
	
	String month;
	String credit;
	String debit;
	
	
	public MonthlySpendModel(String month, String credit, String debit) {
		super();
		this.month = month;
		this.credit = credit;
		this.debit = debit;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getDebit() {
		return debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	
	

}
