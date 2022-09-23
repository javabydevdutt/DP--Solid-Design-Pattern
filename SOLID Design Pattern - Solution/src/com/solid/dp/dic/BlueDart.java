package com.solid.dp.dic;

import java.util.Date;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}

	public void deliver(int oid) {
		System.out.println(oid + " order is delivered to customer on " + new Date() + " by BlueDart");
	}
}
