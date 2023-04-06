package com.gl.javafsd.interviews.string.methods.demo;

public class CharAtDemo {

	public static void main(String[] args) {
		
		
		String str = "Hello, how are you";

		int index = 11;
		char ch = str.charAt(index);
		
		System.out.println("At the index " + index + ", the character " 
		+ ch + " is present");
		
		index = 17;
		ch = str.charAt(index);
		System.out.println("At the index " + index + ", the character " 
		+ ch + " is present");
		
	}
}
