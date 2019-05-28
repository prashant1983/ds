package com.ds.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author prashant
 *
 * @param <AnyType>
 */
public class StackImpl<AnyType> implements StackIF<AnyType> {

	private List<AnyType> arrayList = new ArrayList<AnyType>();
	private int size;

	
	@Override
	public String toString() {
		return "StackImpl [arrayList=" + arrayList + ", size=" + size + "]";
	}


	public void push(AnyType data) {
		arrayList.add(data);
		size++;

	}

	
	public AnyType pop() {
		// get element and delete from list
		AnyType anyType2 = null;
		for (int i = arrayList.size() - 1; i >= 0;) {
			anyType2 = arrayList.get(i);
			arrayList.remove(i);
			break;

		}
		size--;
		return anyType2;
	}

	
	public int size() {
		return size;
	}

}
