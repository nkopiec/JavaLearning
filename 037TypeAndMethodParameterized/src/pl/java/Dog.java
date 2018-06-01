package pl.java;

public class Dog extends Animal implements Speakable {
	@Override
	public void speak() {
		System.out.println("Hau hau");
	}

	@Override
	public void move() {
		System.out.println("Dog is moving");
	}
}