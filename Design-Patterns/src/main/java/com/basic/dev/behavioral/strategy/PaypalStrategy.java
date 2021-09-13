package com.basic.dev.behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;

	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
