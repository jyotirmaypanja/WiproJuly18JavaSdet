package LabSession25thJuly;
/*
 * Employee Salary Validation
Create a Employee class with private fields: name, id, salary
Salary must be positive — implement validation inside the setter
Add a method to displayDetails() showing all info
Create multiple employee objects and test with different salary values.
 
 */

public class Employee {
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("My name is "+ name );
		System.out.println("My id is "+ id);
		System.out.println("My salary is "+ salary);
		
		
	}
	

}
