package com.gl.javafsd.interviews.array_equals;

public class ComplexDataTypesArrayEquals {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Rajesh", 35, 12345.00F);
		Employee1 e2 = new Employee1(
			"Shankar", 36, 23456.00F);
		Employee1 e3 = new Employee1(
				"Shankar", 36, 23456.00F);		

		Employee1 e4 = new Employee1("Rajesh", 35, 12345.00F);
		Employee1 e5 = new Employee1(
			"Shankar", 36, 23456.00F);
		Employee1 e6 = new Employee1(
				"Shankar", 37, 23456.00F);		
		
//		boolean outcome = e1.equals(e2);
		// e1.equals(i1) -> i1 -> Integer
		// e1.equals(s1) -> s1 -> String
		
		Employee1 aArray[] = new Employee1[] {e1, e2, e3};
		Employee1 bArray[] = new Employee1[] {e4, e5, e6};
		
		
		if (aArray.length != bArray.length) {
			System.out.println("[PRE CHECK] Arrays are not equal");
			return;
		}
		
		boolean arrayEquals = true;		
		for (int index = 0; index < aArray.length; index ++) {
		
			Employee1 elementFromAArray = aArray[index];
			Employee1 elementFromBArray = bArray[index];
			
			// ==
			// !=
			
			
			// e1.equals(e4)
			if (!elementFromAArray.equals(elementFromBArray)) {
				arrayEquals = false;
				break;
			}			
		}
		
		if (arrayEquals) {
			System.out.println("Employee Arrays are equal");
		}else {
			System.out.println("Employee Arrays are not equal");
		}		
		
	}
}
