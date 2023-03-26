package com.periit.queueinterface;

import java.util.ArrayDeque;

public class ArrayDequeDemo {


	public static void main(String[] args) {
		ArrayDeque<String> course = new ArrayDeque<>();
		
		course.add("Java");
		course.addFirst("SQL");
		course.addLast("Angular");
		
		System.out.println("Courses list in Array Deque :"+course);
		
		System.out.println("First element :"+course.getFirst()); //returns first element in array
		System.out.println("Last element :"+course.getLast()); //returns last element in array
		
		System.out.println("Removed element :"+course.pollFirst()); //returns first element and remove it from the array
		System.out.println("Removed element :"+course.pollLast()); //returns last element and remove it from the array
		
		System.out.println("Courses list in Array Deque after poll():"+course);

	}
}
