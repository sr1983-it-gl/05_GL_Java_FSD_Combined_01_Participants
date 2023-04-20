package com.gl.javafsd.interviews.comparator_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsage {

	public static void main(String[] args) {
		
		
		List<EmployeeV2> employees = new ArrayList<>();
		
		Collections.sort(employees, 
			new EmployeeSortBasedOnRankingComparator());
		
		Collections.sort(employees, 
			new EmployeesSortBasedOnCountriesComparator());
	}
}
