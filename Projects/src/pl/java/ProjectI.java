package pl.java;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Savepoint;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ProjectI {
	public static void main(String[] args) throws FileNotFoundException{
		initWindow();
	}
	
	public static void initWindow() throws FileNotFoundException {
		Object[] options = {"Match operatios", "Story"};
		int n = JOptionPane.showOptionDialog(null,
				"WHAT DO YOU WANT ? ",
				"A Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]);
		if n = YES.
	}
	
	public static void inputCalculationsWindow() throws FileNotFoundException {
		 String normalQuest = "Give first number operation and second number",
				  errorQuest = "Flawed data. Try again.\n" + normalQuest,
				  quest = normalQuest,
				  expr = "";	
		    
		 String regex = "[0-9]+";
		    Pattern pattern = Pattern.compile(regex);
		    String n = null;
			String txt = n;
		    Matcher matcher = pattern.matcher(txt);
		    boolean matches = matcher.matches();
		   
		  showCalculationsResultWindow(0, 0, 0, txt);
		  System.exit(0);
	}
	
	public static void showCalculationsResultWindow(int rest, int quest, int normalQues, String expr ) {  
		while ((expr = showInputDialog(quest, expr)) != null) {
			
			try {
				StringTokenizer st = new StringTokenizer(expr);
				int num1 = Integer.parseInt(st.nextToken());
				String sop = st.nextToken(); 
				int num2 = Integer.parseInt(st.nextToken());
				
				if(sop.length() != 1 || st.hasMoreTokens())
				throw new  IllegalArgumentException();
				
				switch (sop.charAt(0)) {
				case '+' : rest = num1 + num2; break;
				case '-' : rest = num1 - num2; break;
				case '*' : rest = num1 * num2; break;
				case '/' : rest = num1 / num2; break;
				default : throw new IllegalArgumentException();
				}
			} catch (Exception exc) {
				int errorQuest = 0;
				quest = errorQuest;
				continue;
			}
			showMessageDialog(null, "Result = " + rest);
			int normalQuest = 0;
			quest = normalQuest;
			expr = "";
		}
	}
	
	public static void showHistory() throws FileNotFoundException {
	    PrintWriter zapis = new PrintWriter("file.txt");
	      char[] rest = null;
	      zapis.println(rest);
	      zapis.close();
	      
	      File file = new File("file.txt");
	      Scanner in = new Scanner(file);
	      String story = in.nextLine();
	    System.out.println(story);
	}

}