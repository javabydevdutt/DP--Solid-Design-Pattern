package com.solid.dp.dic;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {

	private DTDC dtdc;
	private BlueDart blueDart;

	/*
	 * public FlipKart(DTDC dtdc) { this.dtdc = dtdc; }
	 */
	public FlipKart(BlueDart blueDart) {
		this.blueDart = blueDart;
	}

	public String shopping(String[] items) {
		float billAmt = 0.0f;
		int oid = 0;
		// calculate the billAmount
		billAmt = items.length * 1000;
		// Generate the OrderId
		oid = new Random().nextInt(10000);

		// call the DTDC method
		// dtdc.deliver(oid);

		blueDart.deliver(oid);
		return Arrays.toString(items) + " Bill Amount::" + billAmt;
	}
}
