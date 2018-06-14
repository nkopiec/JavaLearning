package pl.java;

import java.util.Arrays;
import java.util.List;

public class Person {
	private String name;
	private String surname;
	
	Person person = new Person();
	List<Person> list1 = Arrays.asList( new Person(), new Person());	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
