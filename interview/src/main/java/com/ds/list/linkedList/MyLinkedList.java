package com.ds.list.linkedList;

public class MyLinkedList {

	/**
	 * Show should starts with head.Head is starting point to beginwith.
	 */
	private Node head;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void insertData(String newdata) {

		Node node = new Node(newdata);

		if (head == null) {
			// node becomes head with data and next node null.
			head = node;
			size++;

		} else {

			// else deal with existing head.

			// swap head and node

			// assign head next node as new node and assign it back to head
			// this will insert in Last In mode
			// node.setNextNode(head);
			// head = node;

			// please copy head info to tmp variable.
			Node tmp = head;
			while (tmp.nextNode != null) {

				tmp = tmp.nextNode;
			}
			tmp.setNextNode(node);
			size++;

		}

	}

	public void printData() {
		Node temp = head;
		while (temp.getNextNode() != null) {
			String data = temp.getData();
			temp = temp.getNextNode();
			System.out.println("Data===>>" + data);
		}
		if (temp.getNextNode() == null) {

			System.out.println("Data===>>" + temp.getData());
		}

	}

	public void addElementBeginning(String new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.nextNode = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
		size++;
	}

	/**
	 * add elements in the last
	 * 
	 * @param new_data
	 */
	public void append(String new_data) {
		/*
		 * 1. Allocate the Node & 2. Put in the data 3. Set next as null
		 */
		Node new_node = new Node(new_data);

		/*
		 * 4. This new node is going to be the last node, so make next of it as null
		 */

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.nextNode != null)
			last = last.nextNode;

		/* 6. Change the next of last node */
		last.nextNode = new_node;
		size++;
	}

	public void addMiddle(String new_data) {
		/*
		 * 1. Allocate the Node & 2. Put in the data 3. Set next as null
		 */
		Node new_node = new Node(new_data);

		int middle = size /2;
		System.out.println("Middle ====>>" + middle);
		int sequence = 1;

		/*
		 * 4. This new node is going to be the last node, so make next of it as null
		 */
		new_node.nextNode = null;

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.nextNode != null) {
			last = last.nextNode;
			sequence++;
			if (sequence == middle) {

				System.out.println("Middle sequence====>>" + last);
				new_node.nextNode = last.nextNode;
				last.nextNode = new_node;
			}

		}

		/* 6. Change the next of last node */
		// last.nextNode = new_node;
		size++;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
