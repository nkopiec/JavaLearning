package pl.java;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	private String surname;
	private int age;

	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(name, surname, age);
		System.out.println("Hash: " + hash);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.name != other.name && this.surname != other.surname && this.age != other.age) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		int res = this.name.compareTo(o.name);
		System.out.println("compareTo: " + res);
		if (res == 0) {
			res = this.surname.compareTo(o.surname);
			if (res == 0) {
				res = this.age - o.age;
			}
		}
		return res;
	}
}
