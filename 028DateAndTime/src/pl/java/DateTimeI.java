package pl.java;

import java.util.Calendar;

public class DateTimeI {

	private static final int ZONE_OFFSET = 0;
	private static final int MILISECOND = 0;
	private static final int SECOND = 0;
	private static final int MINUTE = 0;
	private static final int HOUR_OF_DAY = 0;
	private static final int AM_PM = 0;
	private static final int HOUR = 0;
	private static final int DAY_OF_WEEK = 0;
	private static final int DAY_OF_YAER = 0;
	private static final int WEEK_OF_MONTH = 0;
	private static final int WEEK_OF_YAER = 0;
	private static final int DATE = 0;
	private static final int DAY_OF_MONTH = 0;
	private static final int MONTH = 0;
	private static final int YEAR = 0;
	private static final int ERA = 0;
	public static void say(String s) { System.out.print(s); }
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		say("ERA....... " + cal.get(ERA) + "(tu: 0=pne, 1=AD) ");
		say("ROK....... " + cal.get(YEAR));
		say("MIESI�C...... " + cal.get(MONTH) + " (0-stycze�, 2-luty...., 11-grudzie�) ");
		say("LICZBA DNI\n" + "W MIESI�CU... " + cal.getActualMaximum(DAY_OF_MONTH));
		say("DZIE� MIESI�CA..." + cal.get(DAY_OF_MONTH));
		say("DZIE� MIESI�CA... " + cal.get(DATE));
		say("TYDZIE� ROKU... " + cal.get(WEEK_OF_YAER));
		say("TYDZIE� MIESI�CA..." + cal.get(WEEK_OF_MONTH));
		say("DZIE� W ROKU... " + cal.get(DAY_OF_YAER));
		
		say("PIERWSZY DZIE�\n" + "TYGODNIA...... " + cal.getFirstDayOfWeek() + " (1-niedziela, 2-poniedzia�ek, ..., 7-sobota)");
		say("DZIEN TYGODNIA... " + cal.get(DAY_OF_WEEK) + "(1-NIEDZIELA, 2-PONIEDZIA�EK, ..., 7-SOBOTA)");
		say("GODZINA........ " + cal.get(HOUR) + " (12 godzinna skala; nast�pnie odwo�anie czy AM czy PM)");
		say("AM/PM.......... " + cal.get(AM_PM) + "(AM=0, PM=1)");
		say("GODZINA...... " + cal.get(HOUR_OF_DAY) + " (24 godzinna skala)");
		say("MINUTA... " + cal.get(MINUTE));
		say("SEKUNDA....." + cal.get(SECOND));
		say("MILISSEKUNDA:      " + cal.get(MILISECOND));
		
		int msh = 3600*1000;
		
		say("RӯNICA CZASU\n" + "WOBEC GTM... " + cal.get(ZONE_OFFSET)/msh);
		
		say("PRZESUNI�CIE\n" + " (W Polsce obowi�zuje w lecie)");
	}
	

	

}
