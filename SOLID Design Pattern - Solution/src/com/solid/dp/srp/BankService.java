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
}
