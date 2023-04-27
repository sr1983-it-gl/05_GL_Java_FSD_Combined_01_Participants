package com.gl.javafsd.interviews.array_equals;

import java.util.Arrays;

public class SimpleDataTypesSingleDimensionArrayEquals {

	public static void main(String[] args) {
		
//		approach1();
	
		approach2();
	}
	
	static void approach2() {
		
		int aArray[] = {5, 10, 15, 20};
		int bArray[] = {5, 10, 14, 20};
		
		boolean outcome = Arrays.equals(aArray, bArray);
		if (outcome) {
			System.out.println("Arrays are equal");			
		}else {
			System.out.println("Arrays NOT Equal");
		}
	}
		

	static void approach1() {
		
		int aArray[] = {5, 10, 15, 20};
		int bArray[] = {5, 10, 15, 21};
		
//		 Arrays.equals()
		
		if (aArray.length != bArray.length) {
			System.out.println("[PRE CHECK] Arrays are not equal");
			return;
		}
					
		
		boolean arrayEquals = true;		
		for (int index = 0; index < aArray.length; index ++) {
		
			int elementFromAArray = aArray[index];
			int elementFromBArray = bArray[index];
			
			// ==
			// !=
			if (elementFromAArray != elementFromBArray) {
				arrayEquals = false;
				break;
			}			
		}
		
		if (arrayEquals) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
}
