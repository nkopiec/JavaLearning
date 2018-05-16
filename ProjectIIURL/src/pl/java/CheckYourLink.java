package pl.java;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalTime;
import java.time.ZonedDateTime;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckYourLink {
	static ZonedDateTime date = ZonedDateTime.now();

	private static String titleWindow = "URL Parser";
	
	private static String windowInsideLabel = "URL to parset";
	private static String parseAgainOpiton = "Input URL";
	private static String parseUrlOption = "Process URL";
	private static String exitOpiton = "Exit";
	
	private static String warning = "User inputed URL: ";
	private static String warning1 = "to parse";
	private static String warning2 = "which io not Valide";
	private String warning3 = "For URL: ";
	private String warning4 = "Received response code";
	private static String warning5 = "For URL: ";
	private static String warning6 = "will be parse again";
	private static String warning7 = "User closed application";
	private static String warning8 = "User started application";
	
	
	public static void main(String[] args) throws IOException {
		URL url = null;
		loger5(url);
	}
	
	public static void choice() throws IOException {
		Object[] options = {parseUrlOption, exitOpiton};
		JLabel label = new JLabel(windowInsideLabel);
		JTextField textField = new JTextField();
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(textField, BorderLayout.SOUTH);
		
		int result = JOptionPane.showOptionDialog(
				null, panel, titleWindow, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		if (result == JOptionPane.YES_OPTION) {
			String url = textField.getText();
			validURL(url);
		} else if (result == JOptionPane.CLOSED_OPTION || result == JOptionPane.NO_OPTION) {
			loger4(null);
		}
	}
	
	public static void validURL(String urlString) throws IOException {
		try {
			URL url = new URL(urlString);
			parseURL(url);
			loger1(url);
		} catch(MalformedURLException exception) {
			String windowInsideLabel = "URL: " + urlString + " is incorrect";
			Object[] options = {parseAgainOpiton, exitOpiton};
			int result = JOptionPane.showOptionDialog(null, windowInsideLabel, titleWindow, JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options, null);
			if (result == JOptionPane.YES_OPTION) {
				choice();
			} else if (result == JOptionPane.CLOSED_OPTION || result == JOptionPane.NO_OPTION) {
				loger4(null);
			}
		}
	}
	
	public static void parseURL(URL url) throws IOException {
		System.out.println(url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		int status = con.getResponseCode();
		System.out.println(status);
		String parse = Integer.toString(status);
		if (parse.length() != 3) {
			loger1(url);
		}
		
		if (parse.startsWith("2")) {
			parse.substring(0, Math.min(parse.length(), 10));
			String path = "saveIP.txt";
			File file = new File(path);
			File dane = new File("saveIP.txt");
			if (file.exists() == false) {
				file.createNewFile();
			}
			if(dane.exists()) {
				System.out.println("istnieje");
			} else {
				System.out.println("nie istnieje");
			}
			PrintWriter zapis = new PrintWriter("saveIP.txt");
			zapis.println(parse.substring(0, Math.min(parse.length(), 10)));
			zapis.close();
			loger(url);
		} else if (parse.startsWith("3")) {
			validURL(url.toString());
		} else if (parse.startsWith("4")) {
			loger3(url);
			
		} else if (parse.startsWith("5")) {
			do {  
				parseURL(url);
			} while (parse.substring(0, Math.min(parse.length(), 10)) != null);
			choice();
		}
	}
	
	public static void loger(URL url) throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("saveIP.txt");
		zapis.println(warning + url + warning1 + date);
		zapis.close();
	}
	public static void loger1(URL url) throws IOException {
		PrintWriter zapis = new PrintWriter("saveIP.txt");
		zapis.println(warning + url + warning2 + date);
		zapis.close();
		
	}
	public void loger2(URL url) throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("saveIP.txt");
		zapis.println(warning3 + url + warning4 + date);
		zapis.close();
	}
	public static void loger3(URL url) throws IOException {
		PrintWriter zapis = new PrintWriter("saveIP.txt");
		zapis.println(warning5 + url + warning6 + date);
		zapis.close();
		parseURL(url);
	}
	public static void loger4(URL url) throws FileNotFoundException {
		PrintWriter zapis = new PrintWriter("saveIP.txt");
		zapis.println(warning7 + date);
		zapis.close();
		System.exit(0);
		
	}
	public static void loger5(URL url) throws IOException {
		PrintWriter zapis = new PrintWriter("saveIP.txt");
		zapis.println(warning8 + date);
		zapis.close();
		CheckYourLink checkYourLink = new CheckYourLink();
		CheckYourLink.choice();
	}
}
