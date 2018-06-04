package pl.java;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		AnimalUtil<Animal> animalUtil = new AnimalUtil<Animal>(animal);
		animalUtil.performMove();
		
		animalUtil.setAnimal(dog);
		animalUtil.performMove();
		
		animalUtil.setAnimal(cat);
		animalUtil.performMove();
	}
}
