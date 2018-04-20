package pl.java;

import static javax.swing.JOptionPane.showMessageDialog;


import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;



public class Operation {
	public static void main(String[] args) throws IOException {
		Operation dialogs = new Operation();
		dialogs.showInitDialog();
	}
	private final History history;

	private String option0 = "HISTORY";
	private String option1 = "MATH OPERATION";
	private String option2 = "EXIT";
	
	private String activity = "eazy operation";
	private String select = "Select one";
	private String mathActivity = "Enter mathemical activity";
	
	public Operation() {
		this.history = new History() ;
	}
	
	public void showInitDialog() throws IOException {
		int result;
		do {
			result = JOptionPane.showOptionDialog(null, select, activity, 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, new String[] {option0, option1, option2}, null);
		}while (result == -1);
		if (result == JOptionPane.YES_OPTION) {
			showHistoryDialog();
		}else if (result == JOptionPane.NO_OPTION) {
			showInputDialog();
		}else if (result == JOptionPane.CANCEL_OPTION) {
			System.exit(1);
		}
	}
	public void showHistoryDialog() throws IOException {
		String historyFile = history.getHistory();
		historyFile = historyFile.trim();
		
		int result;
		do {
			result = JOptionPane.showOptionDialog(null, historyFile, activity,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {option1, option2}, null);
		} while (result == -1);
		
		if (result == JOptionPane.YES_OPTION) {
			showInitDialog();
		} else if (result == JOptionPane.NO_OPTION){
			System.exit(1);
		}
	}
	public void showInputDialog() throws IOException {
		String mathOperations = JOptionPane.showInputDialog(null, mathActivity, activity, JOptionPane.QUESTION_MESSAGE);
		
		if (mathOperations == null) {
			showInitDialog();
			
		}
		mathOperations = mathOperations.trim();
		String[] mathElements = mathOperations.split("\\s+");
		
		if (mathElements.length != 3) {
			
		}
		
		try {
			StringTokenizer st = new StringTokenizer(mathOperations);
			int num1 = Integer.parseInt(st.nextToken());
			String sop = st.nextToken(); 
			int num2 = Integer.parseInt(st.nextToken());
			
			if(sop.length() != 1 || st.hasMoreTokens())
			throw new  IllegalArgumentException();
			int result;
			switch (sop.charAt(0)) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			default : throw new IllegalArgumentException();
			}
			showMessageDialog(null, "Result = " + result);
		
	} catch (NumberFormatException exception) {
		
	}
	
}

}