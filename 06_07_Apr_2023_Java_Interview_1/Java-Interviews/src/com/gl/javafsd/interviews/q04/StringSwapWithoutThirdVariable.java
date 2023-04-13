package com.gl.javafsd.interviews.q04;

public class StringSwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		
		String s1 = "Great";
		String s2 = "Learning";

		System.out.println(s1);
		System.out.println(s2);

//		int s1Length = s1.length();
		s1 = s1 + s2;
		
		// s1 -> 5 + 9
		// s2 -> 9 [Great]
		//s1 - GreatLearning
		s2 = s1.substring(0, (s1.length() - s2.length()));
		System.out.println(s2);

		s1 = s1.substring(s2.length());		
		System.out.println(s1);
	}
}
