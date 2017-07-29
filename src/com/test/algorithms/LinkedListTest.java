package com.test.algorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListTest {

	public LinkedListTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> list = new Vector();
		//remove duplicates from an unsorted linked list.
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("a");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("a");
		removeDups(linkedList);

	}

	private static void removeDups(LinkedList<String> linkedList) {
		
		HashSet<String> hashSet = new HashSet<>();
		List<String> linkedListIter = (List<String>) linkedList.listIterator();
		for (String string : linkedListIter) {
			if (hashSet.contains(string)) {
				
			}
		}
		
	}

}
