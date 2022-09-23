package com.solid.dp.srp;

public class NotificationService {

	public void sendOTP(String medium) {
		if (medium.equalsIgnoreCase("email")) {
			// write Email related logic
			// Using JavaMail Sender API
		} else if (medium.equalsIgnoreCase("mobile")) {
			// write the mobile OTP logic
			// using Twillio API
		}
	}
}
