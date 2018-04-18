package pl.java;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class Project {

	public static void main(String[] args) {

	}
	public static void Choose() throws FileNotFoundException {
		final History history;
		Object[] options = {"Match operatios", "Story","Exit"};
			 this.history = new History();
		 
	}
	
	public static void initWindow() throws FileNotFoundException {
		String options = null;
		int n = JOptionPane.showOptionDialog(null,
				"WHAT DO YOU WANT ? ",
				"A Question",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				new String[] {
				options,
				options,
				options}, null);

	
	if (n == JOptionPane.YES_OPTION ) {
	
	}else if (n == JOptionPane.NO_OPTION) {
		
	}else if (n == JOptionPane.CANCEL_OPTION) {
		System.exit(0);
	}
	}	
	
	public void showHistory() {
		String history = history.getHistory();
		
	}
}
