package pl.java;

public class AnimalMove<S extends Movable> {
	public S animal;
	
	public AnimalMove(S animal) {
		this.animal = animal;
	}
	
	public void setAnimal(S animal) {
		this.animal = animal;
	}
	
	public void getMove() {
		animal.move();
	}
}
