package com.test.algorithms;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		//Sort Stack using another stack
		StackTest stackTest = new StackTest();
		
		Stack<Integer> s = new Stack<>();
		s.push(3);
		s.push(2);
		s.push(5);
		s.push(1);
		s.push(6);
		System.out.println("original stack..."+ s.toString());
		stackTest.sort(s);
				
	}
	
	
	void sort(Stack<Integer> s) {

		Stack<Integer> r = new Stack<Integer>();

		while (!s.isEmpty()) {

			/* Insert each element in s in sorted order into r. */

			int tmp = s.pop();

			while (!r.isEmpty() && r.peek() > tmp) {

				s.push(r.pop());

			}

			r.push(tmp);

		}

		/* Copy the elements from r back into s. */
		System.out.println("sorted r..."+ r.toString());
		while (!r.isEmpty()) {

			s.push(r.pop());

		}
		
		System.out.println("sorted..."+ s.toString());

	}

}
