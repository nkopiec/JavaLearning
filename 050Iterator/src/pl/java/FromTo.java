package pl.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FromTo {

	public static void main(String[] args) {
		FromTo days = new FromTo();
		DateFormat outFmt = new SimpleDateFormat("E yyyy-MM-dd");
		for (Calendar d : days) {
			System.out.println(outFmt.format(d.getTime()));
		}

	}

}
