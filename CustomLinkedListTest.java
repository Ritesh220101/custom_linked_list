package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;
import com.aurionpro.model.Node;

import java.util.Iterator;
import java.util.LinkedList;

import com.aurionpro.model.*;

public class CustomLinkedListTest {

	public static void main(String[] args) {
		CustomLinkedList c = new CustomLinkedList();
		c.add(10);
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);

		c.remove(3);
		c.remove(1);
		c.display();
		System.out.println("----------------------");
		Iterator<Integer> itr = c.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
