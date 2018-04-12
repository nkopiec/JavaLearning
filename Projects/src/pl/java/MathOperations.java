package pl.java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import static javax.swing.JOptionPane.*;
import java.util.StringTokenizer;

public class MathOperations {

	public static void main(String[] args) {
		String normalQuest = "Give first number operation and second number",
				errorQuest = "Flawed data. Try again.\n" + normalQuest,
				quest = normalQuest,
				expr = "";
		while ((expr = showInputDialog(quest, expr)) != null) {
			int res; 
			try {
				StringTokenizer st = new StringTokenizer(expr);
				int num1 = Integer.parseInt(st.nextToken());
				String sop = st.nextToken(); 
				int num2 = Integer.parseInt(st.nextToken());
				
				if(sop.length() != 1 || st.hasMoreTokens())
					throw new  IllegalArgumentException();
				
				switch (sop.charAt(0)) {
				case '+' : res = num1 + num2; break;
				case '-' : res = num1 - num2; break;
				case '*' : res = num1 * num2; break;
				case '/' : res = num1 / num2; break;
				default : throw new IllegalArgumentException();
				}
			} catch (Exception exc) {
				quest = errorQuest;
				continue; 
			}
			showMessageDialog(null, "Result = " + res);
			quest = normalQuest;
			expr = "";
			
			
		}
		//new BufferedReader(new FileReader(new File("C:/Andrzej/file.txt")));
		//File file = new File(C:/Andrzej/file.txt);
		//Scanner odczyt = new Scanner(new File("file0.txt"));
		//String text = odczyt.nextLine();
		
		//zapis danych do pliku
		String filePath = "C:/Andrzej/file.txt";
				FileWriter fileWriter = null;
				try {
				    fileWriter = new FileWriter(filePath);
				    fileWriter.write(Integer.toString(res));
				} finally {
				    if (fileWriter != null) {
				        fileWriter.close();
				    }
				}
				
			//odczyt danych z pliku
				
						
						BufferedReader fileReader = null;

						try {
						    fileReader = new BufferedReader(new FileReader(filePath));
						    String numberAsString = fileReader.readLine();
						    res = Integer.parseInt(numberAsString);
						} finally {
						    if (fileReader != null) {
						        fileReader.close();
						    }
						}
	}

}
