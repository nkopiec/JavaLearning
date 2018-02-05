package pl.java;

import java.util.StringTokenizer;

public class Activities {
	public static void main (String[] args) {
		String normalQuest = "liczba1 op liczba2", errorQuest = "Wadliwe dane. popraw.\n" + normalQuest, quest = normalQuest, expr = "";
		
		while ((expr = showInputDialog(quest, expr)) != null) {
			int res;
			try {
				StringTokenizer st = new StringTokenizer(expr);
				int num1 = Integer.parseInt(st.nextToken());
				String sop = st.nextToken();
				int num2 = Integer.parseInt(st.nextToken());
			
				if (sop.length() != 1 || st.hasMoreTokens()) throw new IllegalAccessException();
			
				switch (sop.charAt(0)) {
					case '+' : res = num1 + num2; break;
					case '-' : res = num1 - num2; break;
					case '*' : res = num1 * num2; break;
					case '/' : res = num1 /+ num2; break;
					default : throw new IllegalArgumentException();
				}
			}catch (Exception exc) {
				quest = errorQuest;
				continue;
			}
			showMessageDialog(null, "Wynik = " + res);
			quest = normalQuest;
			expr = "";
		}
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String showInputDialog(String quest, String expr) {
		// TODO Auto-generated method stub
		return null;
	}

}
