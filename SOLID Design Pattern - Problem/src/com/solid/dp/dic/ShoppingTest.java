package com.solid.dp.dic;

public class ShoppingTest {

	public static void main(String[] args) {

		// DTDC dtdc = new DTDC();
		BlueDart dart = new BlueDart();
		FlipKart cart = new FlipKart(dart);
		cart.shopping(new String[] { "long kurta", "dandiya sticks", "rold gold ", "kolhapuri" });
	}
}
