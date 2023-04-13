package com.gl.javafsd.interviews.palindrome;

public class Approach2 {

	public static void main(String[] args) {
		
		String str = "abcdcba";
		
		int length = str.length();
		
		int forwardTraversalPointer = 0;
		int backwardTraversalPointer = 
				str.length() - 1;
		
		boolean isPalindrome = true;
		
		while (forwardTraversalPointer <= (length - 1)
			|| (backwardTraversalPointer >= 0)) {
			
			char chFTP = str.charAt(forwardTraversalPointer);
			char chBTP = 
				str.charAt(backwardTraversalPointer);
			
			if (chFTP == chBTP) {
				
				System.out.println(
						String.format("%c %d, %c, %d" , 
					chFTP, forwardTraversalPointer, 
					chBTP, backwardTraversalPointer));
				
				// Go ahead with the next iteration
			}else {
				isPalindrome = false;
				break;
			}
			
			forwardTraversalPointer ++;
			backwardTraversalPointer --;
		}
		
		if (isPalindrome) {
			System.out.println("Palindrome..");
		}else {
			System.out.println("Not a Palindrome.");
		}
	}
}
