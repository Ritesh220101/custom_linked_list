package com.aurionpro.model;

import java.util.Iterator;

public class CustomLinkedList implements Iterable{
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

	public void remove(int data) {
		Node temp = head;
		Node current = null;
		if (temp != null && temp.getData() == data) {
			head = head.getNextNode();
		}

		else {
			while (temp != null) {
				current = temp;
				temp = temp.getNextNode();
				if (temp.getData() == data) {
					break;
				}
			}
			current = temp;
//			temp = null;
		}

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

	public Iterator<Node> iterator() {
		return new ListIterator(head);
	}

}
