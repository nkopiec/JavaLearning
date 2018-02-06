
		package pl.java;

		import java.util.Scanner;
import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class RegularExressionIII {

			public static void main(String[] args) {
				Scanner imput = new Scanner(System.in);
				System.out.println("Give floating-point number: ");
				CharSequence txt = imput.next();
				String regex = "[0-9]+";
			
				
				Pattern pattern = Pattern.compile(regex);
			
				Matcher matcher = pattern.matcher(txt);
				boolean match = matcher.matches();
				System.out.println("Tekst: " + txt + '\n' + (match ? " " : " NIE ") + "pasuje do wzorca: " + regex);
				
				
				matcher.reset();
				match = matcher.matches();
				System.out.println("Tekst: " + txt + '\n' + (match ? " " : " NIE ") + "pasuje do wzorca: " + regex);
			}

		}


	