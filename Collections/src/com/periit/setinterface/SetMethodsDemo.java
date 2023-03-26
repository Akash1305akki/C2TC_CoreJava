package com.periit.setinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetMethodsDemo {

	public static void main(String[] args) {
		
		SortedSet<String> treeSet = new TreeSet<>();
		SortedSet<String> treeIntSet = new TreeSet<>();
		
		treeSet.add("SQL");
		treeSet.add("JAVA");
		treeSet.add("HTML");
		treeSet.add("Angular");
		
		treeIntSet.add("one");
		treeIntSet.add("hundread");
		treeIntSet.add("nine-nine");
		
		//TreeSet will return values inside a set in proper ascending order.
		System.out.println("Our treeSet contains :"+treeSet);
		
		System.out.println("First element in treeSet is :"+treeSet.first());// returns first element
		System.out.println("Last element in treeSet is :"+treeSet.last());// returns last element
		
		System.out.println("Elements before SQL is :"+treeSet.headSet("JAVA"));
		// returns all elements present before the passed value,
		// returns entire set if passed value is not present in the set.
		
		System.out.println("HTML and elements after that :"+treeSet.tailSet("HTML"));
		// returns all elements present after the passed value, starting from the passed value.
		// returns empty set if passed value is not present in the set.
		
	}

}
