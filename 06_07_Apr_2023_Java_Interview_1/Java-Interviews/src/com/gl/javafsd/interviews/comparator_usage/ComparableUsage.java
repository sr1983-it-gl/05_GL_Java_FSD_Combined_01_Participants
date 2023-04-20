package com.gl.javafsd.interviews.comparator_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUsage {

	public static void main(String[] args) {
		
		EmployeeV2 e1 = new EmployeeV2("Manoj", 55, "VP");
		EmployeeV2 e2 = new EmployeeV2("Krish", 40, "Manager");		
		EmployeeV2 e3 = new EmployeeV2("Harini", 35, "Engineering-Developer");
		EmployeeV2 e3_1 = new EmployeeV2("Kaushik", 35, "Engineering-Developer");
		EmployeeV2 e3_2 = new EmployeeV2("Anusha", 35, "Engineering-Developer");
		EmployeeV2 e3_3 = new EmployeeV2("Mujeeb", 35, "Engineering-Developer");
		EmployeeV2 e3_4 = new EmployeeV2("anusha", 35, "Engineering-Developer");
		EmployeeV2 e4 = new EmployeeV2("Raghu", 32, "Engineering-Tester");
		
		List<EmployeeV2> employees = new ArrayList<>();
		employees.add(e1);	employees.add(e2);
		employees.add(e3);	
		employees.add(e3_1);	
		employees.add(e3_2);	
		employees.add(e3_3);	
		employees.add(e3_4);			
		employees.add(e4);

		System.out.println("Before Sorting ->" + employees);
		Collections.sort(employees);
		
		System.out.println("After Sorting ->" + employees);
	}
}
