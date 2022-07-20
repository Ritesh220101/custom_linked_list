package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;
import com.aurionpro.model.Node;

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

		c.remove(20);
		c.display();
		

	}

}
