package com.gl.javafsd.interviews.palindrome;

public class Approach1UsingBuiltInReverse {

	public static void main(String[] args) {
		
//		String originalStr = "hello";
		String originalStr = "abcba";
		
		StringBuilder reverseSB = new StringBuilder(originalStr);
		reverseSB.reverse();
		
		String reversedStr = reverseSB.toString();
		
		if (originalStr.equals(reversedStr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
				
	}
}
