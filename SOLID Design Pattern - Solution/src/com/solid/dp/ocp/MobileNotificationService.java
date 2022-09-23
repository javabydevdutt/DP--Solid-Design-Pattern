package com.solid.dp.ocp;

public class MobileNotificationService implements NotificationService {

	@Override
	public void sendOTP(String medium) {
		System.out.println("MobileNotificationService.sendOTP()");

	}

	@Override
	public void sendTransactionReport(String medium) {
		System.out.println("MobileNotificationService.sendTransactionReport()");

	}
}
