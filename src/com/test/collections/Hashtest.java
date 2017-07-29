package com.test.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashtest {

	private String name;
	
	public Hashtest() {
		super();
	}
	public Hashtest(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {

		Hashtest test = new Hashtest();
		//test.testPersonHashMap();
		
		//test.testHashMap();
		
		//test.testChar();
		test.testHashSet();
		
		//System.out.println("equals..."+ ("1"== "1"));
	}
	
	private void testHashSet() {
		Emp emp1 = new Emp(23);
		Emp emp2 = new Emp(24);
		Emp emp3 = new Emp(25);
		Emp emp4 = new Emp(26);
		Emp emp5 = new Emp(27);
		HashSet<Emp> hs = new HashSet<Emp>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		hs.add(new Emp(27));
		
		System.out.println("HashSet "+hs);
		System.out.println("HashSet Size--->>>"+hs.size());
		System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp(25)));
		System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove( new Emp(24)));
		System.out.println("Now HashSet Size--->>>"+hs.size());
		
		ArrayList ist = new ArrayList();
		
	}
	private void testChar() {
		// TODO Auto-generated method stub
		
		String test = "Alive   is awesome";
		
		if (null == test || test.trim().length() == 0) {
			System.out.println("nothing to test");
			return;
		}
		//# of words
		String[] wordArray = test.trim().split("\\s+");
		System.out.println("# of words: "+ wordArray.length);
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for (int i=0; i< test.length(); i++) {
			if (charMap.containsKey(test.charAt(i))) {
				charMap.put(test.charAt(i), charMap.get(test.charAt(i)) +1);
			} else {
				charMap.put(test.charAt(i), 1);
			}
		}
		System.out.println("charMap...{}"+ charMap);
		
		for (int i=0; i<test.length(); i++) {
			
			if (charMap.get(test.charAt(i)) == 1) {
				System.out.println("First nonrepeating char> "+ test.charAt(i));
				break;
			}
		}
		
	}
	private void testHashMap() {
		// TODO Auto-generated method stub
		Hashtest hashTest = new Hashtest("first");
		
		Hashtest hashTest2 = new Hashtest("first");
		
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Hashtest)) {
			return false;
		}
		Hashtest other = (Hashtest) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	private void testPersonHashMap() {
		
		HashMap <String, Person> map = new HashMap<>();
		
		Person person1 = new Person("anup", 124);
		Person person2 = new Person("anup2", 111);
		
		map.put("anup", person1);
		map.put("anup2", person2);

		System.out.println("output...{}"+ map);
		
		System.out.println(" anup.."+ map.get("anup").getSsn());
	}

}
