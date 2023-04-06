package com.gl.javafsd.interviews.q01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Approch2 {

	public static void main(String[] args) {
		
		String sample = "Using Java language and using node language "
				+ "Using javA again Both using java and node are good";
	
		sample = sample.toUpperCase();
	
		String splittedWords[] = sample.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int index = 0; index < splittedWords.length; index ++) {
			
			String key = splittedWords[index];

			boolean outcome = map.containsKey(key);
			
			if (outcome) {
				
				Integer value = map.get(key);
				value ++;
				
				map.put(key, value);
			}else {
				
				map.put(key, 1);
			}						
		}
		
		printMapContents(map);
	}
	
	static void printMapContents(Map<String, Integer> map) {
		
		Set<String> allKeys = map.keySet();
		
		for (String aKey : allKeys) {
			
			Integer value = map.get(aKey);
			
			if (value > 1) {
			
				System.out.println("Key is " + aKey + " and value is " + value);				
			}			
		}
	}
}
