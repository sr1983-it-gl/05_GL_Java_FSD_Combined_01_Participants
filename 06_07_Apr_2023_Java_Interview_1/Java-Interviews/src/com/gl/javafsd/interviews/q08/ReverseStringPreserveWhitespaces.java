package com.gl.javafsd.interviews.q08;

public class ReverseStringPreserveWhitespaces {

	public static void main(String[] args) {
		
//		String source = "Hello Good Morning";
		String source = "Hey where are from";
		System.out.println(source);
		
		char sourceArray[] = source.toCharArray();
		char targetArray[] = new char[source.length()];
		
		for (int index = 0; index < sourceArray.length; index ++) {
			
			if (sourceArray[index] == ' ') {
			
				targetArray[index] = ' ';
			}			
		}
		
		int backwardIndex = sourceArray.length - 1;
		for (int forwardIndex = 0; forwardIndex < sourceArray.length; forwardIndex ++ ) {
			
			char sourceCh = sourceArray[forwardIndex];
			
			if (sourceCh != ' ') {
				
				char ch2 = sourceArray[backwardIndex];
			
				if (ch2 == ' ') {
					
					backwardIndex --;		
					forwardIndex --;
				}else {
					
					targetArray[forwardIndex] = ch2;
					backwardIndex --;
				}				
			}			
		}
		
		String target = String.valueOf(targetArray);
		System.out.println(target);
		
	}
}
