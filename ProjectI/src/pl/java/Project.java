package pl.java;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Project {
	private final History history;
	private String option0 = "ADD TO FILE";
	private String option1 = "SHOW FILE";
	private String option2 = "EXIT";
	
	private String title = "Activities on File";
	private String select = "What do you do? ";
	private String question = "Write do you want save";
	private String question1 = "Want you see history ?";
	private StringTokenizer st;
	public Project() {
		this.history = new History();
	}
	public static void main(String[] args) throws IOException {
		Project project = new Project();
		project.showWindow();
	}
	public void showWindow() throws IOException {
		int choose;
		do {
			choose = JOptionPane.showOptionDialog(null, select, title, 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] {option0, option1, option2}, null);
		} while (choose == -1);
		if (choose == JOptionPane.YES_OPTION) {
			showInputDialog();
		} else if (choose == JOptionPane.NO_OPTION) {
			showHistoryDialog();
		} else if (choose == JOptionPane.CANCEL_OPTION) {
			System.exit(1);
		}
	}
	public void showInputDialog() throws IOException {
		String saving = JOptionPane.showInputDialog(null, question, title, JOptionPane.QUESTION_MESSAGE);
		if (saving == null) {
			throw new IllegalArgumentException();
		}
		try {
			String operation = st.nextToken(); 
			if(operation.length() != 1 || st.hasMoreTokens()) {		
				throw new IllegalArgumentException();
			}
		} catch (Exception exception) {
			showMathResultDialog(saving);
		}
		int operation1;
		do {
			operation1 = JOptionPane.showOptionDialog(null, question1, title,
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {option0, option1, option2}, null);
		} while (operation1 == -1);
		if (operation1 == JOptionPane.YES_OPTION) {
			showInputDialog();
		} else if (operation1 == JOptionPane.NO_OPTION) {
			showHistoryDialog();
		} else if (operation1 == JOptionPane.CANCEL_OPTION) {
			System.exit(0);	
		}
		}
	private void showMathResultDialog(String operation) throws IOException {
		history.appendToFile(operation, false);
		int operation1;
		do {
			operation1 = JOptionPane.showOptionDialog(null, question, title, 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, new String[] {option0, option1, option2}, null);
		} while (operation1 == -1);
		if (operation1 == JOptionPane.YES_OPTION) {
			showInputDialog();
		} else if (operation1 == JOptionPane.NO_OPTION) {
			showHistoryDialog();
		} else if (operation1 == JOptionPane.CANCEL_OPTION) {
			System.exit(1);
		}
	}
	public void showHistoryDialog() throws IOException {
		String historyFile = history.getHistory();
		historyFile = historyFile.trim();
		
		if(historyFile.isEmpty()) {
			historyFile = "lack history";
		}
		int result;
		do {
			result = JOptionPane.showOptionDialog(null, historyFile, title,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {option0, option2}, null);
		} while (result == -1);
		
		if (result == JOptionPane.YES_OPTION) {
			showInputDialog();
		} else if (result == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
	}
}
