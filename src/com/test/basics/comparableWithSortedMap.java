package com.test.basics;

import java.util.SortedSet;
import java.util.TreeSet;


public class comparableWithSortedMap {

	
	public static void main(String a[]) {
		SortedSet<Fruit> smp = new TreeSet<Fruit>();
		Fruit apple = new Fruit("Apple","red",5);
		Fruit orange = new Fruit("Orange","orange",7);
		Fruit kiwi = new Fruit("Kiwi","green",4);
		smp.add(apple);
		smp.add(orange);
		smp.add(kiwi);
		System.out.println(smp.first().getFruitName());
	}
	public static class Fruit implements Comparable<Fruit>{

		private String fruitName;
		private String fruitDesc;
		private int quantity;

		public Fruit(String fruitName, String fruitDesc, int quantity) {
			super();
			this.fruitName = fruitName;
			this.fruitDesc = fruitDesc;
			this.quantity = quantity;
		}

		public String getFruitName() {
			return fruitName;
		}
		public void setFruitName(String fruitName) {
			this.fruitName = fruitName;
		}
		public String getFruitDesc() {
			return fruitDesc;
		}
		public void setFruitDesc(String fruitDesc) {
			this.fruitDesc = fruitDesc;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int compareTo(Fruit compareFruit) {

			int compareQuantity = ((Fruit) compareFruit).getQuantity();

			//ascending order
			//return this.quantity - compareQuantity;

			//descending order
			return compareQuantity - this.quantity;

		}		
	}
}
