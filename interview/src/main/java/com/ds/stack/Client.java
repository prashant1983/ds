/**
 * 
 */
package com.ds.stack;

/**
 * @author prashant
 *
 */
public class Client {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		StackIF<String> stack = new StackImpl<String>();
		stack.push("Prashant");
		stack.push("Sushant");
		stack.push("Sushmita");
		stack.push("Aaradhya");
		System.out.println("=====>Size====>>>" + stack.size());
		System.out.println("=====>Element====>>>" + stack.pop());
		System.out.println("=====>Element====>>>" + stack.pop());
		System.out.println("=====>Element====>>>" + stack.pop());
		System.out.println("=====>Element====>>>" + stack.pop());
		System.out.println("=====>Element====>>>" + stack);

	}

}
