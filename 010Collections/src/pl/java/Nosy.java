package pl.java;

public class Nosy extends TV1 implements ChangeChannel {

	
	static int a = 56;
	@Override
	public void onTV1(boolean b) {
		if(b) {
			System.out.println("TV1 is on");
	} else {
			
		}
			System.out.println("TV1 is off"); }
	
			@Override
			public String toString() {
				return "metoda toString"; 
			}
			
			@Override
			public void changeChannel() {
				System.out.println("Zmiana kana³u ");
			
			
		}
}
