package pl.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Day {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		GregorianCalendar today1 = new GregorianCalendar();
		GregorianCalendar birthday = new GregorianCalendar(2017, Calendar.DECEMBER, 24);
		if(today.before(today)) {
			System.out.println("It's time to buy gifts.");
		}
		System.out.println(today1);
	}
}
