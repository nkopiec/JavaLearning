package pl.java;

public class AnimalVoice<S extends Speakable> {
	public S animal;
	
	public AnimalVoice(S animal) {
		this.animal = animal;
	}
	
	public void setAnimal(S animal) {
		this.animal = animal;
	}
	
	public void getVoice() {
		animal.speak();
	}
}
