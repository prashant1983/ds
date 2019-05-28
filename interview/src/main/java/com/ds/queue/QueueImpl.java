package com.ds.queue;

/**
 * 
 * @author prashant
 *
 */
public class QueueImpl implements QueueIF {

	// have a an container to hold the data of your choice.
	String nameArray[] = new String[5];
	int front;
	int rear;
	int size;

	public void enqueue(String data) throws Exception {
		if (size > 4) {
			throw new Exception("Queue size exceeds !!");
		}
		nameArray[rear] = data;
		rear++;
		size++;

	}

	public String dequeue() {

		String tempArray[] = new String[nameArray.length];
		String data = nameArray[front];
		int i = 0;
		int j = 0;
		for (String string : nameArray) {

			if (i > 0) {
				tempArray[j] = string;
				j++;
			}

			i++;

		}
		rear--;
		size--;
		nameArray = tempArray;
		return data;
	}

	public void show() {

		for (String string : nameArray) {
			System.out.println("Elements==>>" + string);
		}

	}

	public int size() {

		return size;
	}

}
