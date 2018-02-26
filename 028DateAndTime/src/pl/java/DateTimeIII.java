package pl.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class DateTimeIII {

	public static void main(String[] args) {
		String orgMsg = "Podaj datê: ";
		for(String msg = orgMsg, inp = "2018-01-03", s;
				(s = showInputDialog(msg, inp)) != null;) {
			LocalDate d;
			try {
				d = LocalDate.parse(s);
				msg = orgMsg;
				inp = "";
				}catch(DateTimeParseException exc) {
					msg = exc.getMessage() + "\n" + orgMsg;
					inp = s;
					continue;
				}
			LocalDateTime dt = d.atTime(16, 49);
			System.out.println(dt.toLocalDate() + " h. " + dt.toLocalTime());
		}  
	}

	private static String showInputDialog(String msg, String inp) {
		// TODO Auto-generated method stub
		return null;
	}

}
