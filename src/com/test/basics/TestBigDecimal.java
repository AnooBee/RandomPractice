package com.test.basics;

import java.math.BigDecimal;

public class TestBigDecimal {
	
	public static void main (String args[]) {
				
		BigDecimal firstBD = new BigDecimal("12");
		
		BigDecimal secondBD = new BigDecimal("10");
		
		System.out.println("FirstBD..."+ firstBD.toString());
		System.out.println("SecondBD..."+ secondBD.toString());
		
		secondBD.add(firstBD);
		
		System.out.println("SecondBD..."+ secondBD.toString());
		
		
		String plan = "10.10";
		
		System.out.println(new BigDecimal(plan).multiply(new BigDecimal("12")).toPlainString());

	}
	public static String hello() {
		
		return "hello";
		
	}

}
