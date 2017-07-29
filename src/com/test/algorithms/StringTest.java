package com.test.algorithms;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class StringTest {

	static String[] palindromeStr = new String[] {"ABBA", "ABCBA", "ABD", "A", "", null};
	
	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest test = new StringTest();
		
		//Unique characters
		//test.isUniqueChars("Aabced");
		//test.isUniqueCharsNoDataStr("abcedff");
		//Palindrome
		/*test.testPalindromeLoop(palindromeStr);
		test.testPalindromeStack(palindromeStr);*/
		
		//Permutation
		//test.testPermutation("god", "dog");
		
		//Palindrome Permutation
		//test.testPalindromePermutation("Tact Coa");
		
		//URLify
		//test.urlify("Mr John Smith   ", 13);
		//test matching braces
		test.matchBraces("(()(())))");
		
		test.matchBracesStack("(()(())))");
		//String compress
	    //test.compress("aabccccdeeggg");
		
		//test.reverse("Hello");
		
		//test.reverseSentence("Hello World");
		int[] intArray = new int[] {1,3,4,2,3};
		//test.sumOfThree(intArray, 6);
	}
	
	private boolean matchBracesStack(String string) {

		boolean result = false;
		Stack braceStack = new Stack();
		
		for (int i=0;i<string.length(); i++) {			
			if (string.charAt(i) == '(') {
				braceStack.push(string.charAt(i));
			} else if (string.charAt(i)== ')') {
				try {
					braceStack.pop();
				} catch (EmptyStackException e) {
					System.out.println("Not matched...");
					result = false;
					return result;
				}
			}			
		}
		
		if (braceStack.isEmpty()) {
			System.out.println("Matched!!");
			result = true;
		} else {
			System.out.println("Not matched...");
			result = false;
		}
		
		return result;
	}

	private void matchBraces(String string) {
		// TODO Auto-generated method stub
		
		if (string.length() <2) {
			System.out.println("not matched.");
		}
		int openCtr=0; 
		int closeCtr = 0;
		for (int i=0;i<string.length(); i++) {
			
			if (string.charAt(i) == '(') {
				openCtr ++;
			} else if (string.charAt(i)== ')') {
				closeCtr++;
			}			
		}
		
		if (openCtr != closeCtr) {
			System.out.println("Not matched...");
		} else {
			System.out.println("Matched!!");
		}
		
	}

	private void sumOfThree(int[] intArray, int sum) {
		
		//Sort O(n log n)
		Arrays.sort(intArray);
		//O(nsquared)
		for (int i=0; i< intArray.length -2; i++) {
			
			for (int j = 0; j < intArray.length -1; j++) {
				
				int z = sum - intArray[i] - intArray[j];
				
				if (z > 0) {
					System.out.println("found ...x = "+ intArray[i]+ " y = "+ intArray[j] + " z = "+ z);
				}
			}
		}
		
		
	}

	private void reverseSentence(String string) {

		//get each word and reverse it
		String reverseSentence = reverse(string);
		
		String[] words = reverseSentence.split("\\s");
		StringBuffer resultSent = new StringBuffer();
	
		for (String word: words) {
			resultSent.append(reverse(word));
			resultSent.append(" ");
		}
		System.out.println("Result sentence ..."+ resultSent.toString());
	}

	private String reverse(String string) {
		//Or Use a stack
		String result = "";
		System.out.println("String to be reversed..."+ string);
		
		char[] charArray = string.toCharArray();
		
		for (int i=0; i<string.length()/2; i++ ) { //only halfway loop; otherwise will get original string
			
			char temp = charArray[i];
			charArray[i] = charArray[string.length()-1 -i];
			charArray[string.length()-1-i] = temp;

		}
		
		result = new String (charArray);
		System.out.println("result..."+ result);
		return result;
	}

	private void compress(String string) {
		
		StringBuffer result = new StringBuffer();
		
		int count =1;
		for (int i=0; i<string.length(); i++) {
			
			if ((i+1) < string.length() && string.charAt(i) == string.charAt(i+1)) {
				count ++;
			} else {
				result.append(string.charAt(i));
				result.append(count);
				count =1;
			}
		
		}
		
		System.out.println("result..."+ result.toString());
		
	}

	private void testPalindromePermutation(String string) {
		//failure
		if (string == null || string.length()<2) {
			System.out.println("Not a palindrome permutation");
			return;
		}
		HashMap<Character, Integer> charMap = new HashMap<>();
		string = string.toLowerCase();
		
		for (int i=0; i<string.length(); i++) {
			if (string.charAt(i)== ' ') {
				continue;
			}
			if(charMap.containsKey(string.charAt(i))) {
				charMap.put(string.charAt(i), charMap.get(string.charAt(i)) +1);
			} else {
				charMap.put(string.charAt(i), 1);
			}
		}
		
		int oddCounter =0;
		
		System.out.println("charMap...."+ charMap.toString());
		
		for (Character c: charMap.keySet()) {
			if (charMap.get(c) %2 == 0) {
				System.out.println("charMap.."+c +" is even");
			} else {
				System.out.println("charMap.."+c +" is odd");
				oddCounter++;
				if (oddCounter > 1) {
					System.out.println("String is not a valid palindrome permutation");
					break;
				}
			}
		}
		if (oddCounter <2) {
			System.out.println("String is  a valid palindrome permutation");
		}
		
	}

	// also can be done by reading string backwards
	private void urlify(String string, int trueLength) {
		
		int spaceCounter =0;
		//O(n)
		for (int i=0; i< trueLength; i++) {
			if (string.charAt(i)== ' ') {
				spaceCounter++;
			}
		}
		
		System.out.println("Count of spaces..."+ spaceCounter);
		
		int newSize = trueLength + spaceCounter *2;
		
		char[] newCharArray = new char[newSize];
		int j =0;
		
		//O(n)
		for (int i=0; i<trueLength; i++) {
			
			if (string.charAt(i)!= ' ') {
				newCharArray[j] = string.charAt(i);
				j++;
			} else {
				newCharArray[j]='%';
				newCharArray[j+1]='2';
				newCharArray[j+2]='0';
				
				j=j+3;				
			}
			
		}
		System.out.println("Urlified String..."+ new String(newCharArray));
		
	}

	private  void testPermutation(String string, String string2) {
		
		if (string.length() != string2.length()) {
			System.out.println("not a permutation");
		}

		if (sort(string).equals(sort(string2))) {
			System.out.println("Is a permutation");
		}
		
	}

	private String sort(String str) {
		
		char[] strArray = str.toCharArray();
		Arrays.sort(strArray); //O(n log n)
		
		return new String(strArray);
	}
	private void testPalindromeLoop(String[] palindromeStr2) {

		if (palindromeStr2 == null || palindromeStr2.length == 0) {
			System.out.println("Not a palindrome!");
			return;
		}
		
		for (int i=0; i< palindromeStr2.length; i++) {
			
			String testStr = palindromeStr2[i];
			System.out.println("Testing: "+ testStr);
			
			if (null == testStr || testStr.length() <2) {
				System.out.println("Not a palindrome!");
				return;
			}
			//compare first with last, second with last -1 ...
			for (int j=0; j< testStr.length()/2; j++) {
				
				if (testStr.charAt(j) != testStr.charAt(testStr.length() -1 -j)) {
					System.out.println("Not a palindrome!");
					break;
				}
				
			}
			System.out.println("This is a palindrome!");
		}
	
	}
	
	private void testPalindromeStack(String[] palindromeStr2) {
		
		if (palindromeStr2 == null || palindromeStr2.length == 0) {
			System.out.println("Not a palindrome!");
			return;
		}
		Stack<Character> strStack = new Stack<>();
		
		for (int i=0; i< palindromeStr2.length; i++) {
			
			String testStr = palindromeStr2[i];
			System.out.println("Testing: "+ testStr);
			
			if (null == testStr || testStr.length() <2) {
				System.out.println("Not a palindrome!");
				return;
			}
			//push to stack
			for (int j=0; j<testStr.length(); j++) {
				strStack.push(testStr.charAt(j));
			}
			
			StringBuffer reverseStr = new StringBuffer();
			while (! strStack.isEmpty()) {
				
				reverseStr.append(strStack.pop());
			}
			
			if (testStr.equals(reverseStr.toString())) {
				System.out.println(" this is a palindrome");
			} else {
				System.out.println(" This is NOT a palindrome");
			}
		}
	
	}

	
	boolean isUniqueChars(String str) {

		if (str.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];

		for (int i = 0; i < str.length(); i++) {

			char val = str.charAt(i);

			if (char_set[val]) {// Already found this char in string
				System.out.println("Not unique");
				return false;

			}

			char_set[val] = true;

		}

		return true;

	}
	
	boolean isUniqueCharsNoDataStr(String str) {
		System.out.println("str being checked,,,"+ str);
		if (str.length() > 128)
			return false;

		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			System.out.println("char being checked,,,"+ s);
			for (int j=i+1; j<str.length(); j++) {
				if (s == str.charAt(j)) {
					System.out.println("dup found... "+s);
					return false;
				}
			}
		}

		return true;

	}

}
