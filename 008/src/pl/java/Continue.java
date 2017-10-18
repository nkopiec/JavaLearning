package pl.java;

import javax.swing.*;


public class Continue {
	public static void main(String[] args) {
		new Continue();
	}
	
	public Continue() {
		
		String header = null;
		int i = 0;
		
		outerLoop:
			while ((header = ask("Nag³ówek?")) !=null) {
				i++;
				if (header.equals("")) continue;
				int j = 0;
				while (true) {
					String txt = ask("Tekst?");
					if (txt == null) break outerLoop;
					j++;
					if (txt.equals("")) continue;
					if (txt.equals("nh")) continue outerLoop;
					System.out.println(i + " " + header + " : " + j + " " + txt);
				}
			}
		System.out.println("Koniec");
		System.exit(0);
	}
	
	private String ask(String txt) {
		String s = JOptionPane.showInputDialog(txt);
		return s;
	}

}
