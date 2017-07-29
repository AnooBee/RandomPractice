package com.test.algorithms;

import java.util.HashMap;

public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		int fibNumMap = fib.calcFibMap(6);
		long fibNumlong = fib.calculate(6);
		
		int fibNumIter = fib.calcFibIter(6);
		
		System.out.println("fibNumMap..."+ fibNumMap);
		System.out.println("fibNumlong..."+ fibNumlong);
		System.out.println("fibNumIter..."+ fibNumIter);
	}

	private int calcFibIter(int n) {
		// O(n)
		if (n==0) return 0;
		if (n==1) return 1;
		
		int a =0;
		int b =1;
		for (int i=2; i<n ; i++) {
			int result = a+b;//1,2,3,
			a = b;//1,1,2
			b = result; //1,2,3			
		}
		return a + b;
		
	}

	private long calculate (int i, long[] cache) {
		
		long fibNum = 0;
		
		if (i ==0) return 0;
		if (i == 1) return 1;
		
		if (cache[i] == 0) {
			cache[i] = calculate(i-1, cache) + calculate(i-2, cache);
		}	
		return cache[i]; 
	}
	public long calculate(int i) {
		
		return calculate(i, new long[i+1]);
		
		
		
//		int fibNum = 0;
//		
//		if (i ==0) return 0;
//		if (i == 1) return 1;
//		
//		if (i > 1) {
//			fibNum = calculate(i-1) + calculate(i-2);
//		}	
//		return fibNum;
	}
	
	public int calcFibMap(int i) {
		
		return calculate(i, new HashMap<Integer, Integer>());
	}

	private int calculate(int i, HashMap<Integer, Integer> hashMap) {
		
		int fibNum = 0;
		
		if (i == 0) return 0;
		if (i == 1) return 1;
		
		if (hashMap.containsKey(i)) {
			return hashMap.get(i);
		} else {
			fibNum = calculate(i-1, hashMap) + calculate(i-2, hashMap);
			hashMap.put(i, fibNum);
		}
		
		return hashMap.get(i);
	}
	

}
