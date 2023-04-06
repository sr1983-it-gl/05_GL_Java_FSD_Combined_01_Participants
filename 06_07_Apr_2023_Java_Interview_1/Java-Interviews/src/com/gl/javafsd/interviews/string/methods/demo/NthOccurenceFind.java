package com.gl.javafsd.interviews.string.methods.demo;

public class NthOccurenceFind {

	public static void main(String[] args) {
		
		String str = "Hello, how are you, how are you.";

		char ch = 'e';
//		int index = str.indexOf(ch);
		
		int counter = 0;
		int startIndex = 0;
		while (true) {
			
			
			int index = str.indexOf(ch, startIndex);
			
			if (index != -1) {
				
				counter ++;
				
				startIndex = index + 1;
				
			}
			
			if  (counter == 2) {
				System.out.println("");
			}
		}
	}
}
