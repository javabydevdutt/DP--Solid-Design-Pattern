package com.solid.dp.Isp;

public class Patym implements UPIPayment {

	@Override
	public void payMoney() {
		System.out.println("Patym.payMoney() 'Approved'");

	}

	@Override
	public void getCashBackAsCreditBalance() {
		System.out.println("Patym.getCashBackAsCreditBalance() 'Approved'");

	}

	@Override
	public void getScratchCard() {
		System.out.println("Patym.getScratchCard() 'Approved'");

	}
}
