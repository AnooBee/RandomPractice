package com.test.basics;

/**
 * multi interfaces
 *
 */
interface  A {
	public void add();
}
interface B {
	public void add();
}

class C implements A,B {
//class C extends A { // ,B
	public static void main(String arg[]){
		C objC = new C();
		objC.add();  // problem, compiler gets confused and cant decide to call Class A or B method.
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		
	}
}
