package com.solid.dp.srp;

public class BankService {

	public String deposit(Long accNumber, Long amount) {
		String msg = amount + " is creadited to the Account Number:- " + accNumber;
		return msg;
	}// deposit

	public String withDraw(Long accNumber, Long amount) {
		String msg = amount + " is debited from the Account Number:- " + accNumber;
		return msg;
	}// withDraw

	public void printPassBook(Long accNumber) {
		System.out.println("Account Number [ " + accNumber + " ] PassBook Printed successfully..!");
	}// printPassBook

	public String applyForLoan(String loanType) {
		String msg = "";
		double interestRate = 0.0;
		if (loanType.equalsIgnoreCase("HomeLoan")) {
			interestRate = 7.5;
			msg = "HomeLoan is Approved with Interest Rate:- " + interestRate;
		} else if (loanType.equalsIgnoreCase("CarLoan")) {
			interestRate = 5.0;
			msg = "Car Loan is Approved with Interest Rate:- " + interestRate;
		} else if (loanType.equalsIgnoreCase("Personal Loan")) {
			interestRate = 14.0;
			msg = "Personal Loan is Approved with Inerest Rate:- " + interestRate;
		} else {
			msg = "Please check the Loan Type..!";
		}
		return msg;
	}// applyForLoan

	public void sendOTP(String medium) {
		if (medium.equalsIgnoreCase("email")) {
			// write Email related logic
			// Using JavaMail Sender API
		}
	}
}// class
