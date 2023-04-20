package com.gl.javafsd.interviews.array_equals;

public class Employee1 {

	private String name;
	private int age;
	private Float salary;
	
	public Employee1(String name, int age, Float salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	// e1.equals(e2)
	// obj -> e2
    public boolean equals(Object object2) {

    	System.out.println(name);
    	// this.name
    	// e1
    	// e1 -> first object
    	
    	if (object2 instanceof Employee1) {
    		    		
//    		Employee firstObj = this;
    		Employee1 secondObj = (Employee1)object2;
    		
    		boolean outcome = name.equals(secondObj.name)
    			&& age == secondObj.age
    				&& salary.equals(secondObj.salary);
    		
    		return outcome;    		
    	}
    	return false;
    }
	
}
