package com.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India", 150);
		hm.put("China", 140);
		hm.put("US", 50);
		hm.put("UAE", 35);
		
		System.out.println(hm);
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("Indonesia"));
		System.out.println(hm.remove("US"));
		System.out.println(hm);
		System.out.println(hm.get("UAE"));
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
*/
		
		//Iterate on Hashmap
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("US", 50);
		hm.put("Indonesia", 6);
		hm.put("Nepal", 5);
		
		System.out.println(hm);
		//Iterate 
		Set<String> key = hm.keySet();
		for(String k : key) {
			System.out.println("Key = "+k+" , value = "+hm.get(k));
		}
	}

}
