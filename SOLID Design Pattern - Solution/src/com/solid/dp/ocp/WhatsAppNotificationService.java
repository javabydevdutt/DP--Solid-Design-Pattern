package com.solid.dp.ocp;

public class WhatsAppNotificationService implements NotificationService {

	@Override
	public void sendOTP(String medium) {
		System.out.println("WhatsAppNotificationService.sendOTP()");

	}

	@Override
	public void sendTransactionReport(String medium) {
		System.out.println("WhatsAppNotificationService.sendTransactionReport()");

	}
}
