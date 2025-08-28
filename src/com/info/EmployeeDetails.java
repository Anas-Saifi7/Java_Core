package com.info;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	
	List<String> empId = new ArrayList<>();
	List<String> empName = new ArrayList<>();
	List<Double> empSalary = new ArrayList<>();
	
	public void addEmployee(String data) {
		String [] details = data.split(",");
		empId.add(details[0]);
		empName.add(details[1]);
		empSalary.add(Double.parseDouble(details[2]));
	}
	public String displayId() {
		return String.join("," , empId);
	}
	
	public String displayName() {
		return String.join("," , empName);
	}
	public String displaySalary() {
		List<String> Salaries = new ArrayList<>();
		for(double salary: empSalary) {
			 Salaries.add(String.format("%.2f", salary));
		}
	
		return String.join(",", Salaries);	
	}
	

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    EmployeeDetails employeeDetails = new EmployeeDetails();
    
    System.out.println("Enter no emp data u wanted to insert :");
    int numberOfEmployee = sc.nextInt();
    sc.nextLine();
    
    for(int i= 0;i<numberOfEmployee;i++) {
    	System.out.println("Enter Emp id,name,salary:");
    	String employeData = sc.nextLine();
    	employeeDetails.addEmployee(employeData);
    	
    }
    System.out.println("Displaying SAP IDS");
    System.out.println(employeeDetails.displayId());
    System.out.println("Displaying Emp names");
    System.out.println(employeeDetails.displayName());
    System.out.println("Displaying Emp salary");
    System.out.println(employeeDetails.displaySalary());
    
    


	}

}
