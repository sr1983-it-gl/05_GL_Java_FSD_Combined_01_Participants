package com.gl.javafsd.interviews.string.methods.demo;

public class TrimDemo {

	public static void main(String[] args) {
		
		
		String ide = "    Eclipse";
		
		String result = ide.trim();
		
		System.out.println(ide);
		System.out.println(result);
		
		ide = "Eclipse Software          ";
		result = ide.trim();
		
		System.out.println(ide + "$");
		System.out.println(result);
		
	}
}
