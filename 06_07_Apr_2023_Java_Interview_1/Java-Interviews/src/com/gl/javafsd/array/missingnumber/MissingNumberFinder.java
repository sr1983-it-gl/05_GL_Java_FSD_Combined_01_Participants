package com.gl.javafsd.array.missingnumber;

import java.util.Arrays;

public class MissingNumberFinder {

	public static void main(String[] args) {
		
		int array[] = {5, 6, 4, 2 , 1, 7};
		
		int n = array.length + 1;
		
		int totalSum = (n * (n + 1)) / 2;
		
		// Calculate sum from array
		int sumFromArray = 0;
		for (int index = 0; index < array.length; index ++) {
			
			sumFromArray = sumFromArray + array[index];
		}
		
		int missingNo = (totalSum - sumFromArray);
		
		String arrayAsString = Arrays.toString(array);
		System.out.printf("For the array %s, the missing number is %d %n", 
				arrayAsString, missingNo);
		
		String lineSeparator = System.getProperty("line.separator");
		System.out.println(lineSeparator);
		
		//  Windows - \n
		// Mac / Unix / Linux - \r\n
		
//		System.out.println("test 1");
//		System.out.println("test 2");
	}
}
