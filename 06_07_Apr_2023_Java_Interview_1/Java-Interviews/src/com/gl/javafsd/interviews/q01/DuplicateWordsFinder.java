package com.gl.javafsd.interviews.q01;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordsFinder {

	public static void main(String[] args) {
		
		String sample = "Using Java language and using node language "
				+ "Using javA again Both using java and node are good";
	
//		sample = sample.toUpperCase();
	
		List<String> resultList = new ArrayList<>();
		Set<String> resultSet = new LinkedHashSet<>();
		
		String splittedWords[] = sample.split(" ");
		
		for (int iIndex = 0; iIndex < splittedWords.length; iIndex ++) {
			
			String iWord = splittedWords[iIndex];
//			System.out.println(splittedWord);
			
			for (int jIndex = 0; jIndex < splittedWords.length; jIndex ++) {
				
				String jWord = splittedWords[jIndex];
				
				
				if (iIndex != jIndex) {

//					System.out.println(iWord + ", " + jWord);

					if (iWord.equalsIgnoreCase(jWord)) {
						
						// Match found
						
						if (!
							Utils.containsIgnoreCase (
								resultList, iWord)) {
							
							resultList.add(iWord);
						}
						
						
//						if (!resultList.contains(iWord)) {
//							
//							resultList.add(iWord);
//						}
						
//						resultList.add(iWord + "" + iIndex + "" + jIndex);
						resultSet.add(iWord);
					}
				}
			}
		}
		
		System.out.println("Result List " + resultList);
		System.out.println("Result Set " + resultSet);		
	}
			
}
