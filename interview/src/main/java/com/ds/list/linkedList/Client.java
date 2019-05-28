package com.ds.list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Client {


	public static void main(String[] args) throws Exception {

		// reference test
		List<String> list = new LinkedList<String>();
		list.size();

		MyLinkedList linkedList = new MyLinkedList();
		linkedList.insertData("James");
		linkedList.insertData("Dennies");
		linkedList.insertData("Rod Jhonson");
		linkedList.insertData("PCF");
		linkedList.insertData("Azure");
		System.out.println("Size===>>" + linkedList.getSize());
		System.out.println(linkedList);
		linkedList.addMiddle("Apache");
		linkedList.printData();
		System.out.println("Size===>>" + linkedList.getSize());
		linkedList.addMiddle("AWS");

		linkedList.printData();
		System.out.println("Size===>>" + linkedList.getSize());
	}

}
