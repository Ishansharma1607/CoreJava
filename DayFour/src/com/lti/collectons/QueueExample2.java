package com.lti.collectons;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample2 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		//Using the add method to add items.
		//Should anything go wrong an exception will be thrown.
		queue.add("16");
		queue.add("3");
		queue.add("7");
		//Using the offer method to add items.
		//Should anything go wrong it will just return false
		queue.offer("Item2");
		queue.offer("8");
		queue.offer("19");
		queue.offer("5");
		queue.offer("17");
		Iterator i=queue.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
		//Removing the first item from the queue.
		//If the queue is empty a java.util.NoSuchElementException will be thrown.
		System.out.println("remove: " + queue.remove());
		System.out.println(queue);
		//Checking what item is first in line without removing it
		//If the queue is empty a java.util.NoSuchElementException will be thrown.
		System.out.println("element: " + queue.element());
		System.out.println(queue);

		//Removing the first item from the queue.

		//If the queue is empty the method just returns false.
		System.out.println("poll: " + queue.poll());
		//Checking what item is first in line without removing it
		//If the queue is empty a null value will be returned.
		System.out.println("peek: " + queue.peek());
	}

}
