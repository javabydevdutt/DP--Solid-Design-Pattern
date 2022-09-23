package com.solid.dp.Isp;

public class PhonePe implements UPIPayment {

	@Override
	public void payMoney() {
		System.out.println("PhonePe.payMoney() 'Approved'");

	}

	@Override
	public void getScratchCard() {
		System.out.println("PhonePe.getScratchCard() 'Approved'");

	}

	@Override
	public void getCashBackAsCreditBalance() {
		System.out.println("PhonePe.getCashBackAsCreditBalance() 'Not-Approved'");

	}
}
