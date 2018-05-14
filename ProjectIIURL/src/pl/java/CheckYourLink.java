package pl.java;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckYourLink {
	private String titleWindow = "URL Parser";
	
	private String windowInsideLabel = "URL to parset";
	private String parseAgainOpiton = "Input URL";
	private String parseUrlOption = "Process URL";
	private String exitOpiton = "Exit";
	
	public static void main(String[] args) throws IOException {
		CheckYourLink checkYourLink = new CheckYourLink();
		checkYourLink.choice();
	}
	
	public void choice() throws IOException {
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
			System.exit(0);
		}
	}
	
	public void validURL(String urlString) throws IOException {
		try {
			URL url = new URL(urlString);
			parseURL(url);
		} catch(MalformedURLException exception) {
			String windowInsideLabel = "URL: " + urlString + " is incorrect";
			Object[] options = {parseAgainOpiton, exitOpiton};
			int result = JOptionPane.showOptionDialog(null, windowInsideLabel, titleWindow, JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options, null);
			if (result == JOptionPane.YES_OPTION) {
				choice();
			} else if (result == JOptionPane.CLOSED_OPTION || result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}
	}
	
	public void parseURL(URL url) throws IOException {
		System.out.println(url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		int status = con.getResponseCode();
		
		String parse = Integer.toString(status);
		if (parse.length() != 3) {
			choice();
		}
		
		if (parse.startsWith("2")) {
			parse.substring(0, Math.min(parse.length(), 10));
		} else if (parse.startsWith("3")) {
		
		} else if (parse.startsWith("4")) {
			parseURL(url);
		} else if (parse.startsWith("5")) {
			parseURL(url);
			if (status >= 500 || status <= 599 ) {
				choice();
			}
		}
	}

	
}
