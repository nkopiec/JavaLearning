// efektywnoœæ u¿ycia String+, StringBuffer, StringBuilder


package pl.java;

import javax.swing.JOptionPane;

public class QTimerI {

	public static void main(String[] args) throws InterruptedException {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Liczba Operacji")); 
		QTimer timer = new QTimer().start();
		for(long i = 1; i <= 1_000_000_000; i++);
		timer.stop();
		
		//sumowanie intów
		timer.start();
		long sum = 0;
		for (int i = 1; i <= n; i++) sum+=i;
		System.out.println("Sumowanie liczb ca³kowitych " + timer.stop());
		
		// StringBuffer
		timer.start();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; i++) sb.append("A");
		sb.toString();
		System.out.println("StringBuffer append. " + timer.stop());
		long sbuftime = timer.elapsed();
		
		//String
		timer.start();
		String strA = "";
		for(int i = 1; i <= n; i++) strA += "B";
		System.out.println("String operator +; " + timer.stop());
		double rell = (double) timer.elapsed()/sbuftime;
		
		//StringBuilder
		timer.start();
		StringBuilder sbl = new StringBuilder();
		for (int i = 1; i <= n; i++) sbl.append("C");
		sbl.toString();
		System.out.println("StringBuilder append. " + timer.stop());
		double rel2 = (double) timer.elapsed()/sbuftime;
		
		System.out.println("Wykonano " + n + " operacji.");
		System.out.println("Relacja String/StringBuffer = " + rell);
		System.out.println("Relacja StringBuilder/StringBuffer = " + rel2);
		
		
	

	}

}
