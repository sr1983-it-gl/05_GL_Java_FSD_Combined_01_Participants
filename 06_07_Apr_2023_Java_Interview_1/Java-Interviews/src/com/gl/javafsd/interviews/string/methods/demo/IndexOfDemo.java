package com.gl.javafsd.interviews.string.methods.demo;

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "Hello, how are you, Hey, how are you, Its been long";
		System.out.println(str.length());
		
		char ch = 'h';
		int index = str.indexOf(ch);
		
		System.out.println("Character " + ch + " is present in the index " + index);

		ch = 'H';
		index = str.indexOf(ch);
		System.out.println("Character " + ch + " is present in the index " + index);

		ch = 'H';
		index = str.indexOf(ch, 11);
		System.out.println("Character " + ch + " is present in the index " + index);
		
		ch = 'e';
		index = str.lastIndexOf(ch);
		System.out.println("Last Index/Occurence of Character " 
				+ ch + " is " + index);		
		
	}
}
