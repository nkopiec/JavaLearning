package pl.java;

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

	public static void main(String[] args) throws IOException {
		Operation dialogs = new Operation();
		dialogs.showInitDialog();
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
		} else if (result == JOptionPane.NO_OPTION) {
			showInputMathDialog();
		} else if (result == JOptionPane.CANCEL_OPTION) {
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
			System.exit(0);
		}
	}

	public void showInputMathDialog() throws IOException {
		String mathOperations = JOptionPane.showInputDialog(null, mathActivity, activity, JOptionPane.QUESTION_MESSAGE);
		
		try {
			if (mathOperations == null) {
				throw new IllegalArgumentException();
			}

			StringTokenizer st = new StringTokenizer(mathOperations);
			double number1 = Double.parseDouble(st.nextToken());
			String operation = st.nextToken(); 
			double number2 = Double.parseDouble(st.nextToken());
			
			if(operation.length() != 1 || st.hasMoreTokens()) {
				throw new IllegalArgumentException();
			}
			
			double result;
			switch (operation.charAt(0)) {
				case '+' : result = number1 + number2; break;
				case '-' : result = number1 - number2; break;
				case '*' : result = number1 * number2; break;
				case '/' : 
					result = number1 / number2;
					if (Double.isInfinite(result) || Double.isNaN(result)) {
						throw new IllegalArgumentException();
					}
					break;
				default : throw new IllegalArgumentException();
			}
			
			showMathResultDialog(mathOperations + " = " + result, false);
		} catch (Exception exception) {
			showMathResultDialog(mathOperations, true);
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
			result = JOptionPane.showOptionDialog(null, mathOperations, activity, 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, new String[] {option0, option1, option2}, null);
		} while (result == -1);
		if (result == JOptionPane.YES_OPTION) {
			showHistoryDialog();
		} else if (result == JOptionPane.NO_OPTION) {
			showInputMathDialog();
		} else if (result == JOptionPane.CANCEL_OPTION) {
			System.exit(1);
		}
	}
}