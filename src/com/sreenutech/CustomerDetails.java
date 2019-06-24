package com.sreenutech;

public class CustomerDetails {
	private String customerID;
	private String name;
	private String dob;
	private String mailID;
	private String cardNO;
	private String balance;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	public String getCardNO() {
		return cardNO;
	}
	public void setCardNO(String cardNO) {
		this.cardNO = cardNO;
	}
	public String getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "CardDetails [customerID=" + customerID + ", name=" + name + ", dob=" + dob + ", mailID=" + mailID
				+ ", cardNO=" + cardNO + ", balance=" + balance + "]";
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}


}
