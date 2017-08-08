package com.test.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;

public class ikmTest {
	private int data;
	public ikmTest() {
		this(10);
	}
	public ikmTest(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	public void display() {
		
		data--;
		System.out.println("data..."+ data);
	}
	
	public static void main(String args[])
	{
		ikmTest test = new ikmTest();
		test.display();
		
		
		/*Float f = new Float(23.43);
		Integer in = new Integer();
		Character c = new Character("C");
		Boolean b = new Boolean ("false");*/
		
	/*	Double d = 1.0;
		if (d instanceof Number)
			d = d++;
		boolean cond1 = (d==2)? true:false;
		if(cond1)
			System.out.println("one");
		double e = 1.0;
		if((Double) e instanceof Double | d++ ==e++)
			d+=d;
		boolean cond2 = (d>2) ? true: false;
		if (cond2)
			System.out.println("two");
		boolean cond3 = cond1 ^ cond2;
		if (cond3)
			System.out.println("three");*/
		
		
		
	/*	int x=0,y=4,z=5;
		if(x>0)
			if(y<3)
				System.out.println("one");
			else if(y<4)
				System.out.println("two");
			else if(z >5)
				System.out.println("three");
			else
				System.out.println("four");*/
	/*	
		StringBuilder str = new StringBuilder();
		for(String arg: args) {
			if (str.indexOf(arg) <1) {
				str.append(arg+ " ");
			}
		}
		
		System.out.println(str.toString());
		Scanner sc = new Scanner(str.toString());
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				System.out.println(sc.nextInt()+" ");
			} else {
				sc.next();
			}
		}
		*/
		//mathFunctions();
		//shiftFunctions();
		//instantiation();
		//stringComparision();
		//internationalization();
		//public int x = 5;
		
		//stringmatches();
		
		String report = args[0];
		System.out.println(report);
		if (report.equals(Report.EMPRPT.getName())) {
			System.out.println(Report.EMPRPT.getId() + "name"+ Report.EMPRPT.getName());
		}
		if (report.equals(Report.EMPRPT)) {
			System.out.println(Report.EMPRPT.getId() + "name"+ Report.EMPRPT.getName());
		}
		
		if (report.equals(Report.MNGRPT.toString())) {
			System.out.println(Report.MNGRPT.getId() + "name"+ Report.MNGRPT.getName());
		}
		
		if (report.equals(Report.MNGRPT.name())) {
			System.out.println(Report.MNGRPT.getId() + "name"+ Report.MNGRPT.getName());
		} 
	}
	
	public enum Report {
		
		EMPRPT(1, "EMP_REPORT"), MNGRPT(2,"MGR_REP");
		private String name;
		private int id;
		Report(int id, String nm) {
			this.setName(nm);
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
	}
	
	private static void stringmatches() {
		// TODO Auto-generated method stub
		/*String s1 = "My";
		String s2 = new String("My");
		
		System.out.println(s1.matches(s2));
		System.out.println(s1.equals(s2));
		//System.out.println(String.parse(s1) == s2);
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1== s2);*/
		
	/*	Set <String> set = new LinkedHashSet<String>();
		
		set.add("3");
		set.add("1");
		set.add("3");
		set.add("2");
		set.add("3");
		set.add("1");
		
		for (String str:set) {
			System.out.println(str);
		}*/
		
	/*	int x = 5;
		System.out.println(x>>1);
		System.out.println(x +=3);
		//System.out.println(!x);
		System.out.println(~x);
		//System.out.println(x.value());
*/		
		System.out.println("test");
		
	/*	
		int a=9, b=2;
		float f = a/b;
		System.out.println("f "+ f);
		
		f = f/2;
		System.out.println("f "+ f);
		
		f = a+b/f;
		System.out.println("f "+ f);*/
		
/* Long i = new Long(10);
 long j = 10;
 if (i.equals(j)) {
	 System.out.println("eq");
 }else {
	 System.out.println("not eq");

 }*/
		
	/* int r = 0;
	 int y[] ={2,4};
	 do 
		 for (int x: y)
				System.out.println(x+"");
	while( r++ <1);*/
			
	
		
	}
	public static void fileaccess() throws FileNotFoundException
	{
	
		String f= "f.java";
    	File f1 = new File(f);
    	//RandomAccessFile rf = new RandomAccessFile(f1);
    	FileOutputStream fo = new FileOutputStream(f1);
    	InputStream io = new FileInputStream(f1);
    	Reader iout = new FileReader(f1);
    	//InputStream iot = new InputStream(f1);

	}
	public static void runtimeFunctions()
	{
		Runtime.getRuntime();
	}
	public static void mathFunctions()
	{
		System.out.println(Math.nextUp(10.22));
		System.out.println(Math.random());
		//System.out.println(Math.nextAfter(10.22,11.01));
		System.out.println(Math.nextAfter(10.22,0.01));
		System.out.println(Math.floor(10.99));
		System.out.println(Math.round(10.55));


	}
	public static void shiftFunctions()
	{
		int x= -1;
		System.out.println(x>>1);
    	System.out.println(x>>>32);
    	System.out.println(x>>>1);
    	System.out.println(x>>32);
    	System.out.println(x>>>0);

	}
	public static void instantiation()
	{
		Character c = new Character('c');
    	Float fl = new Float(23.45);
    	Double d = new Double("345.4d");
    	Integer b4 = new Integer(25);
    	Integer at = ++b4==26?5:new Integer(10);
    	System.out.println(at.intValue()-b4.intValue());

	}
	
	public static void ifcondition()
	{
		int a =0;
    	if(a>=0);
    	if(a==0);
    	System.out.println("");
    	//else
    		System.out.println("");
	}
	public static void stringComparision()
	{
		String first ="first";
    	String second = new String("first");
    	System.out.println(first.equals(second));
    	System.out.println(first == second);
    	System.out.println("first" == second);
    	System.out.println("first" == first);
    	System.out.println();
    	String a = new String("test");
    	String b = new String("test");
    	String x = "test";
    	String y = "test";
    	// Deliberately using == rather than equals, to check reference equality
    	System.out.println(a == b); // false
    	System.out.println(a == x); // false
    	System.out.println(x == y); // true
    	System.out.println(a.equals(b)); // false
    	System.out.println(a.equals(x)); // false
    	System.out.println(x.equals(y)); // true

	}
	public static void calendarTypes()
	{
		//convert date to String
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date); //15/10/2013
		
		//convert String to Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date1 = null;
		try {
			date1 = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date1);
		
		//Get current date time
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date2 = new Date();
		System.out.println(dateFormat.format(date2)); //2013/10/15 16:16:39
		
		//Convert Calendar to Date
		Calendar calendar = Calendar.getInstance();
        Date date3 =  calendar.getTime();
        
        //https://www.mkyong.com/java/java-date-and-calendar-examples/
	}
	public static void primitiveVsWrapper()
	{
		//List<int> list1 = new ArrayList<int>();
		List<Integer> list1 = new ArrayList<Integer>();
		//List<long> list2 = new ArrayList<long>();
		List<Long> list2 = new ArrayList<Long>();
		//List<double> list3 = new ArrayList<double>();
		List<Double> list3 = new ArrayList<Double>();
		List<String> list4 = new ArrayList<String>();
		String s = "sdfsdf";
		String sObject = new String("sdfsdf");
		list4.add(s);
		list4.add(sObject);
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put(s, sObject);
	}
	public static void internationalization()
	{
		 	//country code in the filename of the properties file is not needed
			//language code in the filename of the properties file is always needed
			String language = "en";
	        String country = "US";

	        Locale currentLocale;
	        ResourceBundle messages;

	        currentLocale = new Locale(language, country);

	        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
	        System.out.println(messages.getString("greetings"));
	        System.out.println(messages.getString("inquiry"));
	        System.out.println(messages.getString("farewell"));
	}
	public static void simpleGenerics()
	{
		List myIntList = new LinkedList(); // 1
		myIntList.add(new Integer(0)); // 2
		Integer x = (Integer) myIntList.iterator().next(); // 3  
		
		List<Integer> 
	    myIntList1 = new LinkedList<Integer>(); // 1'
		myIntList1.add(new Integer(0)); // 2'
		Integer x1 = myIntList1.iterator().next(); // 3'
	}
	
	void printCollectionGenerics(Collection c) {
	    int k=0;
		Iterator i = c.iterator();
	    for (k = 0; k < c.size(); k++) {
	        System.out.println(i.next());
	    }
	}
	
}

