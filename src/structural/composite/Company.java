package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<Employee> mEmployees;

	public Company() {
		mEmployees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		mEmployees.add(employee);
	}
	
	public float getTotalSalary() {
		float totalSalaries = 0;
		for (Employee employee : mEmployees) {
			totalSalaries += employee.getSalary();
		}
		
		return totalSalaries;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (Employee employee : mEmployees) {
			builder.append(employee);
			builder.append("\n");
		}
		
		return builder.toString();
	}
}
