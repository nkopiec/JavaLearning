package pl.java;

import java.util.Calendar;

public class SimpleSigleton {
	 
	 private static final VehState STOPPED = null;
	private static final VehState MOVING = null;
	private VehState state;
	private int currNr;
	 
	 {
		 int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		 switch (dayOfWeek) {
		 case Calendar.SUNDAY : state = STOPPED; break;
		 case Calendar.MONDAY : state = (currNr % 2 == 0 ? MOVING : STOPPED);
		 						break;
		 					default : state = MOVING; break;
		 }
	 }

	 public void Vehicle() {
		 
	 }
}
