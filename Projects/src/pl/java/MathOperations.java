package pl.java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import static javax.swing.JOptionPane.*;
import java.util.StringTokenizer;

public class MathOperations {

	public static void main(String[] args) throws FileNotFoundException {
		String normalQuest = "Give first number operation and second number",
				errorQuest = "Flawed data. Try again.\n" + normalQuest,
				quest = normalQuest,
				expr = "";
		while ((expr = showInputDialog(quest, expr)) != null) {
			int res; 
			try {
				StringTokenizer st = new StringTokenizer(expr);
				int num1 = Integer.parseInt(st.nextToken());
				String sop = st.nextToken(); 
				int num2 = Integer.parseInt(st.nextToken());
				
				if(sop.length() != 1 || st.hasMoreTokens())
					throw new  IllegalArgumentException();
				
				switch (sop.charAt(0)) {
				case '+' : res = num1 + num2; break;
				case '-' : res = num1 - num2; break;
				case '*' : res = num1 * num2; break;
				case '/' : res = num1 / num2; break;
				default : throw new IllegalArgumentException();
				}
			} catch (Exception exc) {
				quest = errorQuest;
				continue; 
			}
			showMessageDialog(null, "Result = " + res);
			quest = normalQuest;
			expr = "";
		     
			      PrintWriter zapis = new PrintWriter("file.txt");
			      zapis.println(res);
			      zapis.close();
			      
			      File file = new File("file.txt");
			      Scanner in = new Scanner(file);
			      String zdanie = in.nextLine();
			      
			      
	
		}  
			
	}

}
