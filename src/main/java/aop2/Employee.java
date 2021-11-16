package aop2;

public class Employee {
public void displayEmployeeDetails(int empId) {
	System.out.println("\n\nprint employee data..");
	if(empId==10)
	{
		System.out.println("ID:48415");
		System.out.println("NAME:MOHAN");
		System.out.println("DESIGNATION:PAT");
		System.out.println("DEPARTMENT:ADM");

	}
}
public void displayAllEmployees() {
	System.out.println("displaying details for all employees...");
}
}
