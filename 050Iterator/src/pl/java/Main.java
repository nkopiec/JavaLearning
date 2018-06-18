package pl.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) throws IllegalAccessException {
		FromTo days = new FromTo("2013-08-23", "2013-08-31");
		DateFormat outFmt = new SimpleDateFormat("E yyyy-MM-dd");
		for (Calendar d : days) {
			System.out.println(outFmt.format(d.getTime()));
		}
		
		TestFromTo days1 = new TestFromTo("1991-01-28", "1991-07-13");
		DateFormat outFmt1 = new SimpleDateFormat("yyyy-MM-dd E");
		for (Calendar d : days1) {
			System.out.println(outFmt1.format(d.getTime()));
		}


	}

}
