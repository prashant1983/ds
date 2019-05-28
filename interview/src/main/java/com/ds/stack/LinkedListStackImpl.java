package com.ds.stack;

/**
 * 
 * @author prashant
 *
 * @param <T>
 */
public class LinkedListStackImpl<T> implements StackIF<T> {

	// will hold size
	// will hold starting element of node
	int size;
	Node head;

	@Override
	public String toString() {
		return "LinkedListStackImpl [size=" + size + ", head=" + head + "]";
	}

	
	public void push(T data) {
		// check header for null value. if its null that means header needs to
		// formed.

		Node node = new Node(data);
		if (head == null) {
			// create header
			head = node;

		}
		// if already link exists
		// show starts from header :)
		else {
			node.nextNode = head;
			head = node;
		}
		size++;

	}

	
	public T pop() throws Exception {
		// what we can think of going through the linked list.
		// start from header :) as we know that if header is null list is empty.
		// if header exists look for next node till reaches to null. sounds
		// good.
		T returnData = null;
		if (head == null) {

			throw new Exception("Stack is empty");
		}
		if (head.nextNode != null) {
			Node node = head;
			returnData = head.data;
			head = node.nextNode;
			size--;
			return returnData;

		} else {

			returnData = head.data;
			size--;
			head = null;
			return returnData;
		}

	}

	public T peek() {

		return head.data;
	}

	
	public int size() {
		return this.size;
	}

	/**
	 * 
	 * @author prashant
	 *
	 */
	class Node {
		// node will holds data
		// will have a reference for next Node

		T data;
		Node nextNode;

		Node(T inputData) {
			this.data = inputData;
			nextNode = null;

		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", nextNode=" + nextNode + "]";
		}

	}

	public static void main(String args[]) throws Exception {

		LinkedListStackImpl<String> stack = new LinkedListStackImpl<String>();
		stack.push("prashant");
		stack.push("Sushmita");
		stack.push("Sushant");
		stack.push("Aaradhya");
		System.out.println("Peek Value===>>" + stack.peek());
		System.out.println("====>>>>" + stack.toString());
		System.out.println("Popped Value===>>" + stack.pop());
		System.out.println("Popped Value===>>" + stack.pop());
		/*System.out.println("Popped Value===>>" + stack.pop());
		System.out.println("Popped Value===>>" + stack.pop());*/
		
		System.out.println("====>>>>After POP" + stack.toString());

	}

}
