package pl.java;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class DateTimeII {

	static void say(String s) { System.out.println(s); }
	
	static void show(String oper, String what, int field, int value) {
		Calendar c = Calendar.getInstance();
		say("Teraz jest: " + c.getTime());
		say("Operacja: " + oper + "(Calendar." + what + ", " + value + ")");
		switch(oper) {
			case "set": c.set(field, value); break;
			case "add": c.add(field, value); break;
			case "roll": c.roll(field, value); break;
			default: say("B³êdna operacja"); break;
			
		}
		say("Aktualne ustawienia kalendarza: " + c.get(Calendar.YEAR) + '-' + (c.get(Calendar.MONTH) + 1) + '-' +c.get(Calendar.DATE));
		say("------------------------------------------------");
	}
	
	public static void main(String[] args) {
		String in;
		int d = 0;
		while ((in = JOptionPane.showInputDialog("DATE:")) != null) {
			d = Integer.parseInt(in);
			show("set", "DATE", Calendar.DATE, d);
			show("add", "DATE", Calendar.DATE, d);
			show("roll", "DATE", Calendar.DATE, d);
		}
	}

	

}
