package com.gl.javafsd.interviews.string.methods.demo;

public class SplitDemo {

	public static void main(String[] args) {
		
		int a,b,c;
		
		String sample = "Using Java language and using node language "
				+ "Using javA again Both using java and node are good";
		sample = sample.toLowerCase();
		
		String[] splittedWords = sample.split(" ");
		for (String word : splittedWords) {
//			System.out.println(word);
		}
		
		// 10;20;30;
		System.out.println(sample);
		System.out.println("--------------");
	    String splittedWords2[] = sample.split("java");
		for (String word : splittedWords2) {
			System.out.println(word);
		}
		
	}
}
