package pl.java;

public class Main {
	public static void main(String[] args) {
		testAnimal();
	}
	public static void testAnimal() {
		Dog dog = new Dog();
		AnimalMove<Animalable> animalMove = new AnimalMove<>(dog);
		animalMove.getMove();
		
		Cat cat = new Cat();
		animalMove.getMove();
	}

}
