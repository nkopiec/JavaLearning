package pl.java;

public class Employee {
	String name;
	String surname;
	int age;
	double salary;

	public Employee(String name, String surname, int age, double salary) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
	}

	public int getSalary() {
		
		return (int) salary;
	}

	public int getAge() {
		return age;
	}
}
