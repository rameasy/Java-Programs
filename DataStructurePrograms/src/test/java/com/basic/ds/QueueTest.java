package com.basic.ds;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {
	
	@Test
	public void enqueueTest() {
		Queue queue = new Queue(5);
		queue.enqueue(5);
		assertEquals(5, queue.rear());
		assertEquals(5, queue.front());
		queue.enqueue(8);
		assertEquals(8, queue.rear());
		assertEquals(5, queue.front());
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(7);
		assertEquals(5, queue.front());
		assertEquals(7, queue.rear());
		
	}
	
	@Test
	public void dequeueTest() {
		Queue queue = new Queue(5);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(7);
		assertEquals(5, queue.front());
		assertEquals(7, queue.rear());
		assertEquals(5, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(4, queue.peek());
		queue.dequeue();
		System.out.println(queue.peek());
		System.out.println(queue.front());
		System.out.println(queue.rear());
		assertEquals(7, queue.dequeue());
		}
}
