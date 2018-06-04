package pl.java;

public class AnimalUtil<S extends Animal> {
	private S animal;
	
	public AnimalUtil(S animal) {
		this.animal = animal;
	}
	
	public void setAnimal(S animal) {
		this.animal = animal;
	}
	
	public void performMove() {
		animal.move();
	}
}
