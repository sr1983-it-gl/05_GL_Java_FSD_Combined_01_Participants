package com.gl.javafsd.interviews.array_equals;

import java.util.Arrays;

public class SimpleDataTypesMultiDimensionArrayEquals {


		
	public static void main(String[] args) {
		

//		approachWontApproach();
//		approach2();
		approach3();
	}
	
	
	static void approachWontApproach() {
		
		boolean outcome = Arrays.equals(aArray, bArray);
		if (outcome) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays NOT Equal");
		}
	}

	static void approach2() {
		
		boolean outcome = Arrays.deepEquals(aArray, cArray);
		if (outcome) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays NOT Equal");
		}
	}

	static int aArray[][] = {				
			{1, 2, 3},
			{4, 5, 6},
			{7, 9, 9, 10},
			{11, 12},
			{13},
			{14}
			
	};
	
	static int bArray[][] = {				
			{1, 2, 3},
			{4, 5, 6, 11},
			{7, 9, 9, 10},
			{11, 12},
			{13}
	};

	static int cArray[][] = {				
			{1, 2, 3},
			{4, 5, 6},
			{7, 9, 9, 10},
			{11, 12},
			{13, 14}
	};
	
	
	static void approach3() {
		
		if (aArray.length != bArray.length) {
			System.out.println("Arrays not equal");
			return;
		}
		
		for (int iIndex = 0; iIndex < aArray.length; iIndex ++) {
			
			int[] aInnerArray = aArray[iIndex];
			System.out.println("Size of Inner Array is " + aInnerArray.length);
			
			int[] bInnerArray = bArray[iIndex];
			
			if (aInnerArray.length != bInnerArray.length) {
				System.out.println("Arrays not equal");
				return;
			}
			
			for (int jIndex = 0; jIndex < aInnerArray.length; jIndex ++) {
				
				int element1 = aInnerArray[jIndex];
				int element2 = bInnerArray[jIndex];
				
				if (element1 != element2) {
					System.out.println("Arrays not equal");
					return;					
				}
			}
		}
		
		System.out.println("Arrays are EQUAL");
	}
	
}
