package com.gl.javafsd.interviews.string_case_conversion;

public class StringUpperCaseConversion {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		int charCode = (int)ch1;
		System.out.println(charCode);
		
		ch1 = 'q';
		charCode = (int)ch1;
		System.out.println(charCode);
		
		String inputStr = "Hello Good Morning";		
		System.out.println(inputStr);
		
		char result[] = new char[inputStr.length()];
		
		for (int index = 0; index < inputStr.length(); index ++) {
			
			char ch = inputStr.charAt(index);
			int chCode = (int)ch;
			
			// Check whether the characger is a lower-case 
			// character
			// 97 - 122 [a - z]
			if (chCode >= 97 && charCode <= 122) {
				
				// Conversion is needed only for this
				
				int newChCode = chCode - 32;
				char newChar = (char)newChCode;
				
				result[index] = newChar;
			}else {
				
				// No need for a conversion
				result[index] = ch;
				
				System.out.println(" Conversion hasn't happened for " + ch);
			}			
		}
		
		String resultStr = String.valueOf(result);
		
		System.out.println(resultStr);
	}
}
