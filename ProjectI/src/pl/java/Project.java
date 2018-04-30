package pl.java;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Project {
	
	private final History history;

	private String option0 = "ADD TO FILE";
	private String option1 = "SHOW FILE";
	private String option2 = "EXIT";
	        
	private String title = "Activities on File";
	private String select = "What do you do? ";
	private String question = "Write do you want save";
	
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
		String operations = JOptionPane.showInputDialog(null, question, title, JOptionPane.QUESTION_MESSAGE);
		
		if (operations == null) {
			throw new IllegalArgumentException();
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
