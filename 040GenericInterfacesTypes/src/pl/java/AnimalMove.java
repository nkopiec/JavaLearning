package pl.java;

public class AnimalMove<S extends Animalable> {
		public S animal;
		
		public AnimalMove(S animal) {
			this.animal = animal;
		}
		public void getMove() {
			animal.move();
		}
}
