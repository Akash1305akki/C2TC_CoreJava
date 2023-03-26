package com.periit.mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> myMap = new 	LinkedHashMap<>();
		
		myMap.put("myName", "Akash");
		myMap.put("favActor", "Andy Samberg");
		myMap.put("favActress", "Melissa Flumero");
		
		System.out.println(myMap);
		
		System.out.println(myMap.get("myName"));
		// get() returns the value for the passed key.
		// in case of passed key not present in the set it returns "null".
		
		System.out.println("myMap keys are :"+myMap.keySet());
		System.out.println("myMap values are :"+myMap.values());
	}

}
