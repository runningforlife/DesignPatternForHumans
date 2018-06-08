package structural.composite;

/**
 * Composite pattern lets clients treat the individual objects in a uniform manner
 * 
 * the composite pattern is a partitioning design pattern. The composite pattern describes
 * that a group of objects is to be treated in the same way as a single instance of an object.
 * The intent of a composite is to "compose" objects into tree structures to represent part-whole
 * hierarchies.
 * 
 * @author Jason
 *
 */

public class CompanyTest {
	
	public static void main(String args[]) {
		Company company = new Company();
		
		Employee designer = new Designer("Bob Dylan", 15000, "D4");
		Employee developer = new Developer("John Lennon", 2000, "D5");
		Employee hr = new HumanResource("Brack Obama", 24000, "D6");
		
		company.addEmployee(designer);
		company.addEmployee(developer);
		company.addEmployee(hr);
		
		System.out.println(company);
		System.out.println("total salaries=" + company.getTotalSalary());
	}

}
