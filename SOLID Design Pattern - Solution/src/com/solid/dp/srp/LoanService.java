package com.solid.dp.srp;

public class LoanService {

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
}
