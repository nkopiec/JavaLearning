package pl.java;

public class Main {

	public static void main(String[] args) {
		FruidBox fruidBox = new FruidBox(new Peach());
		Peach fruit = (Peach) fruidBox.getFruit();
		
		BoxOnSteroids<Peach> peachBox = new BoxOnSteroids<Peach>(new Peach());
		BoxOnSteroids<Lemon> lemonBox = new BoxOnSteroids<Lemon>(new Lemon());
		
		Peach fruit1 = peachBox.getFruit();
		
		SpecjalBox<String> box = new SpecjalBox<>(" Something "
				+ "");
		box.saySomethingSpecjal();

	}

}
