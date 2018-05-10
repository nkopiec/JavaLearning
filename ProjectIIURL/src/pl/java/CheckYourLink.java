package pl.java;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckYourLink {

	private static String titleWindow = "URL Parser";
	private static String statement1 = "URL to parset";
	private static String statement2 = "URL...is incorrect";
	private static String choice1 = "Process URL";
	private static String choice2 = "Input URL";
	private static String exit = "Exit";
	
	
	
	public static void main(String[] args) throws IOException {
		choice();
	}
	public static void choice() throws IOException {
		Object[] options = {choice1, exit};
		JLabel label = new JLabel(statement1);
		JTextField textField = new JTextField();
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(textField, BorderLayout.SOUTH);
		
		int result = JOptionPane.showOptionDialog(
				null, panel, titleWindow, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, choice1);
		if (result == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		} else if (result == JOptionPane.YES_OPTION) {
			checkURL();
		} else if (result == JOptionPane.NO_OPTION) {
			System.exit(0);
		}	
	}
	public static void checkURL() throws IOException {
		JTextField textField = new JTextField();
		String URL = textField.getText();
		System.out.println(URL);
		 Scanner scan = new Scanner(System.in);
		if (URL != null) {
		String regex =  "/href=\".*?\"/.";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(URL);
		boolean match = matcher.matches();
		//jesli jest b³edny oraz jesli jest dobry (do while )
		int information1 = JOptionPane.showOptionDialog(null, statement2, titleWindow, 
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] {choice2, exit}, null);
		if (information1 == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		} else if (information1 == JOptionPane.YES_OPTION) {
			choice();
		} else if (information1 == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
		// jesli URL jest nullem 
		}
	}

}
