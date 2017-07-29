package com.test.algorithms;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer> {

	Stack<Integer> s2;

	public StackWithMin2() {

		s2 = new Stack<Integer>();

	}

	public static void main(String[] args) {

		StackWithMin2 stackWithMin = new StackWithMin2();

		stackWithMin.add(5);
		stackWithMin.add(2);

	}

	public void push(int value) {

		if (value <= min()) {

			s2.push(value);

		}

		super.push(value);

	}

	public Integer pop() {

		int value = super.pop();

		if (value == min()) {

			s2.pop();

		}

		return value;

	}

	public int min() {

		if (s2.isEmpty()) {

			return Integer.MAX_VALUE;

		} else {

			return s2.peek();

		}

	}

}
