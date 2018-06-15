package pl.java;

public class SchoolClass implements Comparable<SchoolClass> {
	private String name;
	private String surname;
	private double mark;
	private int number;
	
	public SchoolClass() {}
	public SchoolClass(String name, String surname, double mark, int number) {
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public double getMark() {
		return mark;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return "Student: " + number + ". "+ name + " " + surname + " " + mark + " \n";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int compareTo(SchoolClass other) {
		int res = surname.compareTo(surname);
		if (res == 0) res = name.compareTo(other.name);
		return res;
	}
}
