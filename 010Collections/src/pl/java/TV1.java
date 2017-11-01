package pl.java;

public abstract class TV1 implements ChangeChannel {

	public abstract void onTV1(boolean b);
	
	@Override
	public String toString() {
		return "Metoda toString ";
	}
	
	
	public static void changeVolume() {
		System.out.println("Zmiana glosnosci.");
	}
}
