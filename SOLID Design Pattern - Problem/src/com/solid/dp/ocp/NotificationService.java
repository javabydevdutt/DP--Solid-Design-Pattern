package com.solid.dp.ocp;

public class NotificationService {

	public void sendOTP(String medium) {
		if (medium.equalsIgnoreCase("email")) {
			// write Email related logic
			// Using JavaMail Sender API
		} else if (medium.equalsIgnoreCase("mobile")) {
			// using twillio api
		}
	}

	public void sendTransactionReport(String medium) {

	}
}
