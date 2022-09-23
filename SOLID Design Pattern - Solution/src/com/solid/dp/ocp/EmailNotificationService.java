package com.solid.dp.ocp;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendOTP(String medium) {
		System.out.println("EmailNotificationService.sendOTP()");

	}

	@Override
	public void sendTransactionReport(String medium) {
		System.out.println("EmailNotificationService.sendTransactionReport()");

	}
}
