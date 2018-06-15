package pl.java;


public class Employee implements Comparable<Employee> {
	private String company;
	private String lastName;
	private String firstName;
	private int salary;
	
	
	public Employee() {}
	
	public Employee(String lastName, String firstName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getSalary() {
		return salary;
	}

	public String toString() {
		return firstName + " " + lastName + " " + salary;
	}

	@Override
	public int compareTo(Employee o) {
		return 0;
	}
	

}
