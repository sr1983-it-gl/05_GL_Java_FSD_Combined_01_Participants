package com.gl.javafsd.interviews.array_equals;

import java.util.Arrays;

public class SimpleDataTypesArrayEquals {

	public static void main(String[] args) {
		
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
