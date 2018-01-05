package pl.java;

import java.awt.List;
import java.util.ArrayList;

public class CelebrityTest {
	public static void main(String[] args) {
		ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();
			celebrities.add(new Celebrity("Micha³ ¯ebrowski", false, true, true, true));
			celebrities.add(new Celebrity("Ryan Gosling", true, true, true, true));
			celebrities.add(new Celebrity("Filip Szczeœniak", true, false, false, true));
			celebrities.add(new Celebrity("Kuba Grobowski", true, true, false, true));
			
	//		 print(celebrities, new CheckIfSinger());
	}
	//private static void print(List<Celebrity> celebrities, CheckTalent checker)
}
