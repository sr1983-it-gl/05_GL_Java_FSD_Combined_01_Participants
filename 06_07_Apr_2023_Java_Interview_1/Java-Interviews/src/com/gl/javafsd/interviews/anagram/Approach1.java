package com.gl.javafsd.interviews.anagram;

public class Approach1 {

	public static void main(String[] args) {
		
		String str1 = "Race";
		str1 = "Earth";
//		str1 = "Ton";
//		str1 = "Hello";
		
		String str2 = "care";
		str2 = "heart";
//		str2 = "Not";
//		str2 = "oellh";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		if (str1.length() != str2.length()) {
			
			System.out.println("Not an anagram");		
			return;
		}
	
		boolean anagramCheck = true;
		
		for (int index = 0; index < str1.length(); index ++) {
			
			char ch1 = str1.charAt(index);
		
//			boolean outcome = str2.contains(ch1 + "");
			int foundIndex = str2.indexOf(ch1);
			
			if (foundIndex != -1) {
				
				// Character is present in the string
				
				String part1 = str2.substring(0, foundIndex);
//				String part2 = str2.substring((foundIndex + 1),
//						str2.length());
				
				String part2 = str2.substring((foundIndex + 1));
				
				str2 = part1 + part2;
			}else {
				
				// Character not present				
				anagramCheck = false;
				break;				
			}
		}
		
		if (anagramCheck) {
			System.out.println("Anagram");
		}else {
			System.out.println("not Anagram");
		}
	}
}
