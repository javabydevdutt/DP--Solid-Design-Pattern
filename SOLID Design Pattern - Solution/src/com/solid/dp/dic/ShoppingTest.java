package com.solid.dp.dic;

public class ShoppingTest {

	public static void main(String[] args) {
		// Courier courier = new DTDC();
		Courier courier = new BlueDart();
		FlipKart fpkt = new FlipKart(courier);
		fpkt.shopping(new String[] { "long kurta", "dandiya sticks", "rold gold ", "kolhapuri" });
	}
}
