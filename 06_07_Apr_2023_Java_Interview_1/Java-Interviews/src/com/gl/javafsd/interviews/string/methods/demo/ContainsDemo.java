package com.gl.javafsd.interviews.string.methods.demo;

public class ContainsDemo {

	public static void main(String[] args) {
		
		String str = "Google chrome is a browser";
		
		String word = "google";
		
		boolean outcome = str.contains(word);
	
		System.out.println("String [" + str + "] contains the word [" 
				+ word + "] -> " + outcome);
	}
}
