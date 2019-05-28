package com.ds.queue;

/**
 * 
 * @author prashant
 *
 */
public interface QueueIF {

	void enqueue(String data) throws Exception;

	String dequeue();

}
