package pl.java;

public class Home {
	public static void main(String[] args) {
		 TV nosy = new TV(56, "nosy67"); 
		 TV sama = new TV(32, "sama345");
		 System.out.println(sama.getName() + " " + sama.getSize());
		 System.out.println(nosy.getName() + " " + nosy.getSize());
	
		 sama.getOnOff();
		 sama.setOnOff(true);
		 sama.getOnOff();
		 
		 Dog rex = new Dog();
		 rex.Speak();
		 rex.setSize(15);
		 rex.getClass();
		 System.out.println(rex.getSize());
	}

}
