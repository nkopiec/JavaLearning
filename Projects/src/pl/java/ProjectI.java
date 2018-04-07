package pl.java;

import java.io.IOException;
import java.sql.Savepoint;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ProjectI {
	

	public static void main(String[] args){
		  // display the showOptionDialog
		Object[] options = {"Match operatios",
                "Story"};
			int n = JOptionPane.showOptionDialog(null,//parent container of JOptionPane
			"WHAT DO YOU WANT ? ",
			"A Question",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[1]);
		  // interpret the user's choice
		  if (n == JOptionPane.YES_OPTION) // uzywamy jako math 
		  {
		    String n1 = JOptionPane.showInputDialog("Give first number");
		    Scanner N1 = new Scanner(System.in);
		    String ms = JOptionPane.showInputDialog("Give mathematical symbol ");
		    Scanner mts = new Scanner(System.in);
		    String n2 = JOptionPane.showInputDialog("Give second number");
		    Scanner N2 = new Scanner(System.in);
		    System.out.printf("Result: " + n1 + ms + n2);
		    //Savepoint.class.equals(n2);
		  //System.out.println(Savepoint.class);
		    String regex = "[0-9]+";
		    Pattern pattern = Pattern.compile(regex);
		    String txt = n1;
		    Matcher matcher = pattern.matcher(txt);
		    boolean match = matcher.matches();
		    System.out.println();
		    System.exit(0);
		  
		  }
		}


}
