package org.employee;


public class EmployeeDetails {
	
	private void empName() {
		// Business logic
		System.out.println("Employee name: anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void empLocation() {
		System.out.println("OMR");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		
	}
	
	
	

}
