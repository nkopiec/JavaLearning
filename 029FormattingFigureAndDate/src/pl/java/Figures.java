package pl.java;

import java.util.Calendar;
import java.util.Formatter;

public class Figures {

	public static void main(String[] args) {
		double width = 123.5;
		double lenght = 234.89;
		double field = width * lenght;
		System.out.println("Field equals: " + field);
		Calendar c = Calendar.getInstance();
		System.out.println("Data: " + c.getTime());
		
	}

}
