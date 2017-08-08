package com.test.basics;


 class TestBigDecimalChildD  {

	public static void main(String[] args) {
		
		
		
		TestBigDecimal test= new TestBigDecimal();
		// TODO Auto-generated method stub
//System.out.println((TestBigDecimal) TestBigDecimal.hello());
		
		/*SuperCl newsuperCl = new SuperCl () {
			public void onSelection() {
				//
			}
		};*/
		System.out.println("one");
	}

	
	
}
 
 class SuperCl {
		public static void main (String[] args) {
			System.out.println("two");
			TestBigDecimalChildD.main(args);
		}
		
	}
