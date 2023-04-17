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
	private void empId() {
		System.out.println("employee id: 1122");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 62c414fb1a5153545a42fccf5c77ccd951a96f35
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		
	}
	
	
	

}
