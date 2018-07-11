package pl.java;

public class Main {
	private static void printAgeMoreThan20(Person person, IAgeChecker checker) {
		System.out.println("Result: " + checker.cheakAge(person));
	}
	public static void main(String[] args) {
		Person person = new Person("Jan", 21);
		printAgeMoreThan20(person, p -> p .getAge() > 20);
	}
}
