package pl.java;

import static javax.swing.JOptionPane.showMessageDialog;


import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Operation {
	
	private final History history;

	private String option0 = "HISTORY";
	private String option1 = "MATH OPERATION";
	private String option2 = "EXIT";
	
	private String activity = "Calculator math operations";
	private String select = "What do you do? ";
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
		} while (result == -1);
		if (result == JOptionPane.YES_OPTION) {
			showHistoryDialog();
		}else if (result == JOptionPane.NO_OPTION) {
			showInputMathDialog();
		}else if (result == JOptionPane.CANCEL_OPTION) {
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
			result = JOptionPane.showOptionDialog(null, historyFile, activity,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {option1, option2}, null);
		} while (result == -1);
		
		if (result == JOptionPane.YES_OPTION) {
			showInputMathDialog();
		} else if (result == JOptionPane.NO_OPTION) {
			showInitDialog();
		}
	}
	

	public void showInputMathDialog() throws IOException {
		String mathOperations = JOptionPane.showInputDialog(null, mathActivity, activity, JOptionPane.QUESTION_MESSAGE);
		
		if (mathOperations == null) {
			showInitDialog();
			
		}
		mathOperations = mathOperations.trim();
		String[] mathElements = mathOperations.split("\\s+");
		
		if (mathElements.length != 3) {
			showMathResultDialog(mathOperations, true);
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
			int result1 = 0;
			do {
				result = JOptionPane.showOptionDialog(null, select, activity, 
						JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, new String[] {option0, option1, option2}, null);
			} while (result1 == -1);
			if (result1 == JOptionPane.OK_OPTION) {
				showInitDialog();
			}
		
		} catch (NumberFormatException exception) {
			
		}
	
	}
	private void showMathResultDialog(String mathOperations, boolean isError) throws IOException {
		history.appendToFile(mathOperations, isError);
		
		if(isError) {
			mathOperations = "bad operations: " + mathOperations;
		} else {
			mathOperations = "good operations: " + mathOperations;
		}
		int result;
		do {
			result = JOptionPane.showOptionDialog(null, select, activity, 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, new String[] {option0, option1, option2}, null);
		} while (result == -1);
		if (result == JOptionPane.YES_OPTION) {
			showHistoryDialog();
		}else if (result == JOptionPane.NO_OPTION) {
			showInputMathDialog();
		}else if (result == JOptionPane.CANCEL_OPTION) {
			System.exit(1);
		}
		
	}

	public static void main(String[] args) throws IOException {
		Operation dialogs = new Operation();
		dialogs.showInitDialog();
	}
}