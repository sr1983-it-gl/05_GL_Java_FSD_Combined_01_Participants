package com.gl.javafsd.array.binarydecimal.conversion;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		
//		approach1();
		approach2();
	}
	
	static void approach1() {
		String binary = "1101110";
		int decimal = Integer.parseInt(binary, 2);
	
		System.out.printf("the binary form of %s is %d", binary, decimal);
	}
	
	static void approach2() {
		
		long binary = 1101110;

		long tempBinary = binary;
		long powerCounter = 0;
		
		long decimalValue = 0;
		
		while (true) {
			
			if (tempBinary == 0) {
				break;
			}
			
			long lastDigit = tempBinary % 10;
			
			long powerValue = (long)Math.pow(2, powerCounter);
			
			long componentValue = lastDigit * powerValue;
			
			System.out.printf("Digit is %d, Power value is %d, Component Value %d %n", 
					lastDigit, powerValue, componentValue);

			decimalValue = decimalValue + componentValue;
			
			tempBinary = tempBinary / 10;
			powerCounter ++;
		}
		
		System.out.println("Final Decimal value is " + decimalValue);
	}
}
