package pl.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPI {

	

	static void show(Object o) {
	System.out.println(o.getClass().getSimpleName() + " -> " + o);
	}
	public static void main(String[] args) {
		LocalDate date;
		LocalTime time;
		LocalDateTime dati;
		ZonedDateTime zdt;
		show(date = LocalDate.of(2017, Month.FEBRUARY, 26));
		show(time = LocalTime.of(10, 55));
		show(LocalDateTime.of(date, time));
		show(dati = LocalDateTime.of(date, time));
		show(ZonedDateTime.now());
		show(zdt = ZonedDateTime.of(dati, ZoneId.of("Asia/Nicosia")));
		show(LocalDate.from(zdt));
		show(LocalTime.from(zdt));
		show(dati.toLocalDate());
		show(dati.toLocalTime());
		show(date.withDayOfMonth(10));
		show(date.withMonth(3));
		show(date.withYear(2018));
	    
	}

}
