package pl.java;

import java.time.LocalDate;

public class DataTimeI {

	
	static void info(Object ... args) {
		for (Object o : args) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		info(d, 
			"Year has got days: " + d.lengthOfYear(),
			"Month has got days: " + d.lengthOfMonth(),
			"Year: " + d.getYear(),
			"Is year transcendental:" + d.isLeapYear(),
			"Month: " + d.getMonth(),
			"Number Months: " + d.getDayOfMonth(),
			"Months day: " + d.getDayOfMonth(),
			"Weeks day: " + d.getDayOfWeek()
			
			
			);

	}

}
