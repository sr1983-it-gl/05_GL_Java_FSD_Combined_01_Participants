package com.gl.javafsd.interviews.comparator_usage;

public class EmployeeV2 implements Comparable<EmployeeV2>{

	private String name;
	private int age;
	private String department;
	
	public EmployeeV2(String name, int age, String department) {
		
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	// COmparison - e1, e2
	@Override
	public int compareTo(EmployeeV2 employee2) {
		
		// 0, -1 & +1
		
		int age1 = age;
		int age2 = employee2.age;
		
		if (age1 == age2) {
			
			
			String name1 = name;
			String name2  = employee2.name;
			
			int result2 = name1.compareTo(name2);			
			return result2;
		}else if (age1 < age2) {
			return -1;
		}else {
			return +1;
		}
	}
	
	public String toString() {
		
		return "{" + name + ", " + age + ", " + department + "}";
	}
	
//	// e1.equals(e2)
//	// obj -> e2
//    public boolean equals(Object object2) {
//
//    	System.out.println(name);
//    	// this.name
//    	// e1
//    	// e1 -> first object
//    	
//    	if (object2 instanceof Employee2) {
//    		    		
////    		Employee firstObj = this;
//    		Employee2 secondObj = (Employee2)object2;
//    		
//    		boolean outcome = name.equals(secondObj.name)
//    			&& age == secondObj.age
//    				&& department.equals(secondObj.department);
//    		
//    		return outcome;    		
//    	}
//    	return false;
//    }	
}
