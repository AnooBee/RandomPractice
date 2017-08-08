package com.test.basics;

import java.io.IOException;

class Parent {
	
	protected static int count = 0;
	public Parent() {
		count++;
	}
	
	 int getCount() throws IOException {
		return count;
	}
	
	
}
public class DoubleMain extends Parent {

	public DoubleMain ()  {
		count++;
	}
	@Override
	public int getCount() {
		return count;
	}
	public static void main(String[] args) {
		
		//System.out.println(getCount());
		DoubleMain dbl = new DoubleMain();
		
		//System.out.println(getCount());

		/*// TODO Auto-generated method stub
		String f ="test.java";
		File f1 = new File(f);
		
		try {
			InputStream iot = new FileInputStream(f1);
			
			FileOutputStream iots = new FileOutputStream(f1);
			
		   Reader inp = new FileReader(f1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
