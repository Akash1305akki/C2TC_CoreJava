package com.periit.stackinterface;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		 Stack<String> stack = new Stack<String>();
	      stack.push("apple");
	      stack.push("orange");
	      stack.push("banana");
	      stack.push("grapes");
	      stack.push("dragon");
	      stack.push("litchi");
	      stack.push("banana");

	      System.out.println(stack); // Output: [apple, banana, orange]

	      String topElement = stack.peek();
	      System.out.println(topElement); // Output: orange

	      stack.pop();
	      System.out.println("After pop() :"+stack);

	      System.out.println(stack.search("orange"));
	      //returns the position of the passed element counting from last to first manner.
	      // in case of giving a element which is not present in stack, it returns a negative 1.
	      

	}

}
