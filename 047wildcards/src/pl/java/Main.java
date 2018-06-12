package pl.java;

public class Main {

	public static void main(String[] args) {
		  FruitBox fruitBox = new FruitBox(new Orange());
	        Orange fruit1 = (Orange) fruitBox.getFruit();
	        
	        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<Apple>(new Apple());
	        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<Orange>(new Orange());

	        Orange fruit = orangeBox.getFruit();
	        
	        FancyBox<String> box = new FancyBox<>("something");
	        box.saySomethingFancy();
	}

}
