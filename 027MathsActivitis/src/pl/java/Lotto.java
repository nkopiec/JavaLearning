package pl.java;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		String msg = "Podaj magiczne liczby,\n" + "nic nie wypsuj automatyczna inicjacja,\n" + "lub wybierz Cencel by skonczyc losowania";
		Random rand;
		boolean[] isDrawn = new boolean[49];
		String inp;
		while ((inp = showInputDialog(msg)) != null) {
			if (!inp.equals("")) {
				Scanner sc = new Scanner(inp);
				long sum = 0;
				while (sc.hasNextInt()) sum += sc.nextInt();
				rand = new Random(sum); 
				
			}
			else rand = new Random();
	//		final int ILE = 6;
	//		int k = 0;
	//		String out = "";
	//		while (k < ILE) {
	//			int n = rand.nextInt(49);
	//			if(isDrawn(n)) continue;
	//			else{
	//				k++;
	//				isDrawn[n] = true;
	//				out += " " + (n+1);
	//			}
	//		}
		final int ILE = 6;
		TreeSet<Integer> nums = new TreeSet<>();
		while (nums.size() < ILE) 
			nums.add(rand.nextInt(49) +1);
		showMessageDialog(null, "wylosowane liczby : \n" + nums);
			//showMessageDialog(null, "wylosowane liczby:\n" + out);
		}

	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String showInputDialog(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean isDrawn(int n) {
		// TODO Auto-generated method stub
		return false;
	}

}
