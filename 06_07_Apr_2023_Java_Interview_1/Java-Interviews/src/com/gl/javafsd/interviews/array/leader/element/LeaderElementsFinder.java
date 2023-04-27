package com.gl.javafsd.interviews.array.leader.element;

public class LeaderElementsFinder {

	public static void main(String[] args) {
		
//		int[] array = {20, 31, 8, 7, 9, 6};
		int[] array = {22, 59, 43, 14, 51, 37, 24};
		
		for (int index = 0; index < array.length; index ++) {
			
			int potentialLeaderElement = array[index];			
			boolean leaderElement = true;
			
			for (int jIndex = (index + 1); jIndex < array.length; jIndex ++) {
				
				int element = array[jIndex];
				
				if (potentialLeaderElement < element) {
					leaderElement = false;
					break;
				}
			}
			
			if (leaderElement) {
				System.out.printf("Element %d is a Leader Element %n", potentialLeaderElement);
			}else {
				System.out.printf("Element %d is NOT a Leader Element %n", potentialLeaderElement);
			}
		}
	}
}
