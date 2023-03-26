package com.periit.queueinterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> ipq = new PriorityQueue<>();
		
		ipq.add(5);
		ipq.add(3);
		ipq.add(111);
		ipq.add(7);
		ipq.add(99);
		
		System.out.println("Integer queue :"+ipq);
		
		//peek()- returns the head of the queue
		System.out.println("head :"+ipq.peek());
		System.out.println("Integer queue :"+ipq);
		
		//poll()- returns and removes the head of the queue and assigns a new order
		System.out.println("removed head :"+ipq.poll());
		System.out.println("New Integer queue :"+ipq);
		
		//remove()-removes a element in a standard order or even by value
//		System.out.println("Integer removed from queue :"+ipq.remove());
//		System.out.println("After Remove :"+ipq);
//		System.out.println("Integer removed from queue :"+ipq.remove());
//		System.out.println("After Remove :"+ipq);
		
		
		Iterator<Integer> iterator = ipq.iterator();
		System.out.println("Inside Iterator");
		while(iterator.hasNext()) {
			System.out.print(ipq.poll()+" ");
		}

	}

}
