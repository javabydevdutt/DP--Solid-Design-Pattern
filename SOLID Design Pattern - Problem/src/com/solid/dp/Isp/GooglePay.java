package com.solid.dp.Isp;

public class GooglePay implements UPIPayment {

	@Override
	public void payMoney() {
		System.out.println("GooglePay.payMoney() 'Approved'");

	}

	@Override
	public void getCashBackAsCreditBalance() {
		System.out.println("GooglePay.getCashBackAsCreditBalance() 'Not- Approved'");

	}

	@Override
	public void getScratchCard() {
		System.out.println("GooglePay.getScratchCard()' Approved'");

	}
}
