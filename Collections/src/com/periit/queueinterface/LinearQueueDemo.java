package com.periit.queueinterface;

public class LinearQueueDemo {
	
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear++;
		size = size+1;
	}
	
	public int deQueue() {
		int data = queue[front];
		front++;
		size = size-1;
		rear = rear-1;
		return data;
	}
	
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[front+i]+" ");
		}
	}
	
	public int getSize(){
		return size;
	}
	
	{
		System.out.print("Inside For:");
		for(int n : queue) 
			System.out.print(n+" ");
		System.out.println();
}
}
