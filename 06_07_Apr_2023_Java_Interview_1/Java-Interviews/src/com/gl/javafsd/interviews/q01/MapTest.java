package com.gl.javafsd.interviews.q01;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Java", 2);
		map.put("Node", 3);
		map.put("Language", 4);
		
		System.out.println(map.get("Node"));

		// Node -> 4
		// Check if the key is present
		// if the key is present, then take the value
		// Increment the value [4]
		// Update the map for the key 'Node' with the value as 4
	
		String key = "Node";
		boolean outcome = map.containsKey(key);
		
		if (outcome) {
			
			Integer value = map.get(key);
			value ++;
			
			map.put(key, value);
		}
		
		System.out.println(map.get("Node"));
	}
}
