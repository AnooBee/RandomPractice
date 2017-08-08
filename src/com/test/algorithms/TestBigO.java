package com.test.algorithms;

public class TestBigO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestBigO testBigO = new TestBigO();
		int [] array = new int[] {0,1,2,3,4,5,6,7};
		testBigO.printUnorderedPairs(array);
	}

	void printUnorderedPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}

}
