package structural.composite;

public abstract class Employee {
	protected String name;
	protected float salary;
	protected String jobGrade;
	
	public Employee(String name, float salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.jobGrade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setJobGrade(String grade) {
		this.jobGrade = grade;
	}
	
	public String getJobGrade() {
		return this.jobGrade;
	}
	
	@Override
	public String toString() {
		return "name=" + name + 
				",salary=" + salary +
				",job grade=" + jobGrade;
	}
}
