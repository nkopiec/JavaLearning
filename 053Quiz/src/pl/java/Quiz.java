package pl.java;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Quiz {
	public static void main(String args[]) {
		Set<String> cap = new HashSet<>(
				Arrays.asList("Praga", "Bratyslawa", "Moskwa", "Berlin", "Kijów", "Wilno", "Miñsk"));
		Set<String> entered = new HashSet<>();
		showMessageDialog(null, "Podaj stolice: ");
		
		int count = 0;
		for(int n = cap.size(); count < n;) {
			String in = showInputDialog("Odpowiedz: " + count + "/" + n + '\n' + "wpisz nastepn¹ stolicê: ");
			
			if (in == null) break;
			in = in.toLowerCase();
			if (!entered.contains(in) && cap.contains(in)) {
				count++;
				entered.add(in);
			}
		}
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String showInputDialog(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
