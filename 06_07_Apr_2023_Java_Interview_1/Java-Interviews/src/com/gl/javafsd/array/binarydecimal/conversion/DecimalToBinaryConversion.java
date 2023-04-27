package com.gl.javafsd.array.binarydecimal.conversion;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		
//		approach1();
		approach2();
	}
	
	static void approach1() {
		int decimal = 7;
		
		String binary = Integer.toBinaryString(decimal);
	
		System.out.printf("the binary form for the decimal %d is %s", 
				decimal, binary);
	}
	
	static void approach2() {
		
//		int decimal = 7;
		int decimal = 110;
		
		StringBuilder results = new StringBuilder();
		
		int tempDecimal = decimal;
		
		while (true) {
			
			if (tempDecimal <= 0) {
				break;
			}
			
			int quotient = tempDecimal / 2;
			int remainder = tempDecimal %2 ;
			
			tempDecimal = quotient;
			
			results.append(remainder);
		}
		
		String binary = results.reverse().toString();
		
		System.out.printf("The binary form for the decimal %d is %s %n",
				decimal, binary);
	}
}
