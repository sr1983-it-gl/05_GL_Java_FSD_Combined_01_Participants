package com.gl.javafsd.interviews.q25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapSorterBasedOnValues {

	public static void main(String[] args) {
		
		Map<String, Float> moviesRatingMap = new HashMap<>();
		
		moviesRatingMap.put("Test Movie", 7.7F);
		moviesRatingMap.put("Logan", 5.9F);
		moviesRatingMap.put("Inception", 8.5F);
		moviesRatingMap.put("Fast & Furious", 6.8F);
		moviesRatingMap.put("Rebecca", 8.1F);
		moviesRatingMap.put("Shutter Island", 7.8F);
		moviesRatingMap.put("Interstellar", 9.5F);		
		iterationWay1(moviesRatingMap);
		System.out.println("----------------");
		
		sortByValues(moviesRatingMap);
		
//		iterationWay1(moviesRatingMap);
//		iterationWay2(moviesRatingMap);
	}
	
	static void sortByValues(Map<String, Float> moviesRatingMap) {
		
		Set<Map.Entry<String, Float>> setOfEntries 
			= moviesRatingMap.entrySet();
		
		List<Map.Entry<String, Float>> listOfEntries
			= new ArrayList<>();
		listOfEntries.addAll(setOfEntries);
		
//		System.out.println("Before Sorting->");
//		System.out.println(listOfEntries);
		Collections.sort(listOfEntries, new MapValueComparator());
	
//		System.out.println("After Sorting->");
//		System.out.println(listOfEntries);
		
		Map<String, Float> resultsMap = new LinkedHashMap<>();
		
		Iterator<Map.Entry<String, Float>> iterator 
			= listOfEntries.iterator();
		while (iterator.hasNext()) {
			
			Map.Entry<String, Float> mapEntry = iterator.next();		
			
			resultsMap.put(mapEntry.getKey(), mapEntry.getValue());
		}		
		
		iterationWay1(resultsMap);
	}
	
	static void iterationWay1(Map<String, Float> map) {
		
		
		Set<String> allKeys = map.keySet();
		
		Iterator<String> iterator = allKeys.iterator();		
		
		while (iterator.hasNext()) {
			
			String key = iterator.next();
			Float value = map.get(key);						
			System.out.println(key + "," + value);
		}
	}

	static void iterationWay2(Map<String, Float> map) {
		
		Set<Map.Entry<String, Float>> setOfEntries 
		= map.entrySet();
	//	System.out.println(setOfEntries);
		
		Iterator<Map.Entry<String, Float>> iterator 
			= setOfEntries.iterator();
		
		while (iterator.hasNext()) {
			
			Map.Entry<String, Float> mapEntry = iterator.next();
		
			String key = mapEntry.getKey();
			Float value = mapEntry.getValue();
		
			System.out.println(key + "->" + value);
		}
	
			
	}
}
