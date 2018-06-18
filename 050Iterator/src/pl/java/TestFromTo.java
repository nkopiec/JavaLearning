package pl.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestFromTo implements Iterable<Calendar> {
	private Calendar from = Calendar.getInstance(),
					to = Calendar.getInstance();
		
	public TestFromTo(String fromString, String toString) throws IllegalAccessException {
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			from.setTime(df1.parse(fromString));
			to.setTime(df1.parse(toString));
		} catch (ParseException exc) {
			throw new IllegalAccessException(exc.getMessage());
		}
	}
	public Iterator<Calendar> iterator() {
		return new Iterator<Calendar>() {
			Calendar current = Calendar.getInstance(),
					next = Calendar.getInstance();
			{
				current.setTime(from.getTime());
				current.add(Calendar.DATE, -1);
			}
				
			public boolean hasNext() {
				next.setTime(current.getTime());
				next.add(Calendar.DATE, 1);
				return next.compareTo(to) <= 0;
			}
				
			public Calendar next() {
				if (!hasNext()) throw new NoSuchElementException();
				current.add(Calendar.DATE, 1);
				return current;
			}
				
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
