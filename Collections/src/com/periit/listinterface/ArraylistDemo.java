package com.periit.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<Integer> val1 = new ArrayList<>();
		List<Integer> val2 = new ArrayList<>();
		
		System.out.println("Before add value 1: "+val1);
		System.out.println("Before add value 2: "+val2);
		
		//add() method
		//In val1
		System.out.println("add() METHOD");
		val1.add(1);
		val1.add(23);
		val1.add(45);
		val1.add(67);
		val1.add(89);
		val1.add(23);
		//In val2
		val2.add(10);
		val2.add(90);
		val2.add(20);
		val2.add(60);
		val2.add(30);
		val2.add(100);
		
		System.out.println("value 1: "+val1);
		System.out.println("value 2: "+val2);
		
		//remove() method by index of value
		System.out.println("remove() METHOD");
		val1.remove(3);
		val1.remove(1);
		
		System.out.println("after remove block value 1: "+val1);
		
		//addAll() method by object name
		System.out.println("addAll() METHOD");
		val1.addAll(val2);
		
		System.out.println("val1 + val2 :"+val1);
		val1.addAll(val1);
		
		System.out.println("val1 + val2 + updated_val1 :"+val1);
		
		//clear() method
		System.out.println("clear() METHOD");
		System.out.println("before clear :" +val1);
		val1.clear();
		System.out.println("after clear :" +val1);
		
		//contains() method to find values inside object
		System.out.println("contains() METHOD");
		boolean res= val2.contains(100);
		System.out.println("Is 100 present in the list: " + res);
		
		//remove() method to perform sub one object values from another
		System.out.println("removeAll() METHOD");
		val1.add(2222);
		val1.add(10);
		val1.add(90);
		System.out.println(val1);
		
		val1.removeAll(val2);
		System.out.println("After remove all :"+val1);
		
		//size() method to compute array size
		System.out.println("size() METHOD");
		int size = val2.size();
		System.out.println("size of val2 array is: "+size);
		
		//rotate() method by number of rotations should take place
		System.out.println("rotate() METHOD");
		System.out.println("Orginal val2 : "+val2);
		Collections.rotate(val2, 2);
		System.out.println("After rotate() :"+val2);
		
		// Shuffle() method  shuffles the values in different order everytime
		System.out.println("shffle() METHOD");
		Collections.shuffle(val2);
		System.out.println("after 1 shuffle :"+val2);
		Collections.shuffle(val2);
		System.out.println("after 2 shuffle :"+val2);
		
		// Sort() and reverseOrder() method
		System.out.println("sort()-reverseOrder() METHOD");
		Collections.sort(val2);
		System.out.println("After sort : "+val2);
		Collections.sort(val2, Collections.reverseOrder());
		System.out.println("After reverse order: "+val2);
		
		//Some methods to access and alter values by index
		//indexOf() and lastIndexOf() methods
		System.out.println("indexOf()-lastIndexOf() METHOD");
		System.out.println(val2.indexOf(100));
		val2.add(20);
		System.out.println(val2.lastIndexOf(20));
		
		//get() method
		System.out.println("get() METHOD");
		System.out.println(val2.get(3));
		
		//set() method
		System.out.println("set() METHOD");
		val2.set(3, 90);
		System.out.println(val2);
		
		//isEmpty() method
		System.out.println("isEmpty() METHOD");
		System.out.println(val2.isEmpty());
		
		//clone() method
		System.out.println("clone() METHOD");
		Object cloneList;
		cloneList = ((LinkedList) val2).clone();
		System.out.println("val2 :"+val2);
		System.out.println("cloneList :"+cloneList);
		// fill() method to fill with same values
		System.out.println("fill() METHOD");
		Collections.fill(val2, 5);
		System.out.println("After fill : "+val2);

	}
}