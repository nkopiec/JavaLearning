package pl.java;

import java.util.HashSet;

public class Employee {
	private String lastName;
	private String firstName;
	private int salary;
	
	public Employee(String ln, String fn, int sal) {
		lastName = ln;
		firstName = fn;
		salary = sal;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null) return false; 
		} else if (!lastName.equals(other.firstName)) return false;
		if (lastName == null) {
			if (other.lastName != null) return false;
		} else if (!lastName.equals(other.lastName)) return false;
		return true;
		}
	public String toString() {
		return firstName + " " + lastName + " " + salary;
	}
	
	Employee[] etab = { new Employee("Jan", "Kowalski", 1000),
						new Employee("Jan", "Stefanowski", 22190),
						new Employee("Stefan", "Frycz", 32400)
						};
	HashSet<Employee> set = new HashSet<>(); {
	for (Employee e : etab) set.add(e);
	System.out.println(set);
	}

}
