package pl.java;

public class Cat extends Animal implements Speakable {
	@Override
	public void speak() {
		System.out.println("Miau miau");
	}

	@Override
	public void move() {
		System.out.println("Cat is moving");
	}
}
