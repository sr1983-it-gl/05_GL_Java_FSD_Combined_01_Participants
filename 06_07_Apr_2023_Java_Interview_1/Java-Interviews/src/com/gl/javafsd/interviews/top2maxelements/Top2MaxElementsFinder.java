package com.gl.javafsd.interviews.top2maxelements;

import java.util.Arrays;

public class Top2MaxElementsFinder {

	public static void main(String[] args) {
		
		int []array = {3, 94, 10, 119, 120, 84, 98, 6, 97, 118, 72};
		
		int maxElement = array[0];
		int secondMaxElement = array[0];
		
		for (int index = 0; index < array.length; index ++) {
			
			int visitingElement = array[index];
			
			if (visitingElement > maxElement) {
				secondMaxElement = maxElement;
				
				maxElement = visitingElement;
			}else if (secondMaxElement < visitingElement) {
				
				secondMaxElement = visitingElement;
			}
		}
		
		System.out.printf("For the array %s, the max element is %d, "
				+ "the 2nd max element is %d %n",
				Arrays.toString(array), maxElement, secondMaxElement);
	}
}
