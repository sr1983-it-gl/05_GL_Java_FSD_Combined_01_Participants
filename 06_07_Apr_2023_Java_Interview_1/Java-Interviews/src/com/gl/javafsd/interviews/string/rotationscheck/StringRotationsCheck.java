package com.gl.javafsd.interviews.string.rotationscheck;

public class StringRotationsCheck {

	public static void main(String[] args) {
		
		String baseStr = "hello";
		
		String reversedStr = "lohee";
		
		String concatenatedStr = 
				baseStr + baseStr;
		
		if (concatenatedStr.contains(reversedStr)) {
			System.out.println("Reversed string");
		}else {
			System.out.println("Not a reversed string");
		}
	}
}
