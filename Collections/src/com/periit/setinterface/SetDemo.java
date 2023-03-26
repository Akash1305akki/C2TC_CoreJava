package com.periit.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> stringSet = new HashSet<>();
		Set<String> linkedStringSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();// we can also give SortedSet class name instead of Set
		
		stringSet.add("SQL");
		stringSet.add("JAVA");
		stringSet.add("HTML");
		stringSet.add("Angular");
		stringSet.add("HTML"); //The run's smoothly but duplicates element cannot be present in a set
		
		//HashSet will return values inside a set of its own order, the values will not be added in the order of entry.
		System.out.println("Our stringSet contains :"+stringSet);		
		
		linkedStringSet.add("SQL");
		linkedStringSet.add("JAVA");
		linkedStringSet.add("HTML");
		linkedStringSet.add("Angular");
		
		//LinkedHashSet will return values inside a set in proper order of entry.
		System.out.println("Our linkedStringSet contains :"+linkedStringSet);
		
		treeSet.add("SQL");
		treeSet.add("JAVA");
		treeSet.add("HTML");
		treeSet.add("Angular");
		
		//TreeSet will return values inside a set in proper ascending order.
		System.out.println("Our treeSet contains :"+treeSet);

	}

}
