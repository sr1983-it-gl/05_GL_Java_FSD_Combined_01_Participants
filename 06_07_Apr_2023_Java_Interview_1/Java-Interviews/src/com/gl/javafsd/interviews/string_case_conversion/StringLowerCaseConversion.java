package com.gl.javafsd.interviews.string_case_conversion;

public class StringLowerCaseConversion {

	public static void main(String[] args) {
		
		
		String inputStr = "wELCOME eVERYONE";
		System.out.println(inputStr);
		
		char result[] = new char[inputStr.length()];
		
		for (int index = 0; index < inputStr.length(); index ++) {
			
			char ch = inputStr.charAt(index);
			int chCode = (int)ch;
			
			if (chCode >= 65 && chCode <=90) {
				
				// This means that the char is upper-case character
				
				int newChCode = chCode + 32;
				char newCh = (char)newChCode;
				
				result[index] = newCh;
			}else {
			
				System.out.println("No conversion for " + ch);
				result[index] = ch;				
			}
		}
		
		String resultStr = String.valueOf(result);
		System.out.println(resultStr);
	}
}
