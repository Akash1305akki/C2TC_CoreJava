package com.periit.iterator;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Integer> myArr = new ArrayList<>();
		
		myArr.add(3);
		myArr.add(7);
		myArr.add(30);
		myArr.add(320);
		myArr.add(31);
		myArr.add(98);
		
		System.out.println("myArr values :"+myArr);
		
		var itList = myArr.iterator();
		
		while(itList.hasNext()) {
			var current = itList.next();
			System.out.println(current);
		}
	}
}
