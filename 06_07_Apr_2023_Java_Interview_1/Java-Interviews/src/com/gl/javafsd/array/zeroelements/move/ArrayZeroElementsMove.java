package com.gl.javafsd.array.zeroelements.move;

import java.util.Arrays;

public class ArrayZeroElementsMove {

	public static void main(String[] args) {
		
		// 8 - 3 = 5
		// {3, 0, 9, 5, 0, 1, 0, 11}
		// {3 [0], }
		
		int array[] = {3, 0, 9, 5, 0, 1, 0, 11};		
		int zeroElementCounter = 0;
		
		System.out.printf("Original array %s %n", Arrays.toString(array));
		
		int nonZeroIndex = 0;
		for (int index = 0; index < array.length; index ++) {
			
			int element = array[index];
			if (element != 0) {
				array[nonZeroIndex] = element;	
				nonZeroIndex ++;
			}else {
				zeroElementCounter ++;
			}
		}
		
		System.out.printf("Intermediate array %s %n", Arrays.toString(array));
		
		
		int beginIndex = (array.length - zeroElementCounter);
		for (int index = beginIndex; index < array.length; index ++) {
			
			array[index] = 0;
		}
		
		System.out.printf("Final array %s %n", Arrays.toString(array));
		
		// {3, 9, 5, 1, 11, 1, 0, 11}
		
		// {3, 9, 5, 1, 11, 0 , 0, 0}
	}
}
