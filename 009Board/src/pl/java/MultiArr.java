package pl.java;

public class MultiArr {
	
	public static void main(String[] args) {
		int [] w = { 2, 3, 4 };
		int n = 3;
		int[][] m2 = new int[n][];
		for (int i = 0; i < m2.length; i++) {
			m2[i] = new int[w[i]];
				for (int j = 0; j < m2.length; j++)
					m2[i][j] = i + j;
				}
		for (int i = 0; 1 < m2.length; i++) {
			System.out.print("Rozmiar " + i + "-go wiersza " + m2[i].length);
			String out = " ";
			for (int j = 0; j < m2[i].length; j++) out += " " + m2[i][j];
			System.out.println(out);
			}
		}
	}


