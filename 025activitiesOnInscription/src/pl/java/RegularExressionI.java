//http://www.samouczekprogramisty.pl/wyrazenia-regularne-w-jezyku-java/
package pl.java;


import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExressionI {


	

	public static void main(String[] args) {
		System.out.println("Give floating-point number: ");
		 
		String odczyt1 = "\\d\\p{Punct}\\d";
	    
		Scanner scan = new Scanner(System.in);
	   String odczyt = scan.next();
	   if(odczyt == odczyt1) {
		   
		   System.out.println("rreerrerererrer");
	   }
		   else System.out.println("sssssss");
		   
	   
	 

	}

}
