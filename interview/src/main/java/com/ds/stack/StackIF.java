package com.ds.stack;

/**
 * @author prashant
 *
 */
public interface StackIF<AnyType> {

	/**
	 * 
	 * @param data
	 */
	void push(AnyType data);

	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	AnyType pop() throws Exception;

	/**
	 * @return
	 */
	int size();

}
