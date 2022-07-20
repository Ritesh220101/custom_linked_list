package com.aurionpro.model;

import java.util.Iterator;

public class CustomLinkedList implements Iterable {
	private Node head;

	public CustomLinkedList() {

	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void remove(int index) {
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.getNextNode();
		}
		node.setNextNode(node.getNextNode().getNextNode());
	}

	

	public void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNextNode();
			}
		}
	}

	public Iterator<Integer> iterator() {
		return new ListIterator(head);
	}

	public class ListIterator implements Iterator<Integer> {

		private Node current;

		public ListIterator(Node head) {
			current = head;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Integer next() {
			Node temp = current;
			current = current.getNextNode();
			return temp.getData();

		}

	}

}
