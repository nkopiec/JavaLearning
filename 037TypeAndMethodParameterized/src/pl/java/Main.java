package pl.java;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		usePara();
		testAnimal();
	}
	
	public static void usePara() {
		Para<String, Date> para = new Para<>();
		para.showFirst();
		para.showLast();
		System.out.println(para);
	}
	
	public static void testAnimal() {
		Dog dog = new Dog();
		AnimalVoice<Speakable> animalVoice = new AnimalVoice<>(dog);
		animalVoice.getVoice();
		
		Cat cat = new Cat();
		animalVoice.setAnimal(cat);
		animalVoice.getVoice();
	}
}
