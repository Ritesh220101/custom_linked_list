package com.aurionpro.model;

import java.util.Iterator;

public class ListIterator implements Iterator<Node> {
	
	private Node current;
	
	public ListIterator(Node head) {
		current = head;
	}

	@Override
	public boolean hasNext() {
		return current!=null;
	}

	@Override
	public Node next() {
		Node temp = current;
		current = current.getNextNode();
		return temp;
		
	}

}
