package com.periit.queueinterface;

public class mainRunner {

	public static void main(String[] args) {
		
		System.out.println("Linear Queue Example");
		LinearQueueDemo lq = new LinearQueueDemo();
		lq.enQueue(5);
		lq.enQueue(2);
		lq.enQueue(1);
		lq.enQueue(90);
		lq.enQueue(7);
		
		lq.deQueue();
		lq.deQueue();
		
//		lq.enQueue(78); Once performing dequeue the size is reduced and can't be set to initial size again.
		
		lq.show();		
		System.out.println();
		System.out.println("Size :"+lq.getSize());
	
		
		System.out.println();
		System.out.println("Circular Queue Example");
		CircularQueueDemo cq = new CircularQueueDemo();
		cq.enQueue(5);
		cq.enQueue(2);
		cq.enQueue(1);
		cq.enQueue(90);
		cq.enQueue(7);
		
		
		
		cq.deQueue();
		cq.deQueue();
		
		cq.enQueue(107);
		cq.enQueue(153);
		cq.enQueue(3333);
		
		cq.show();
		

	}

}
