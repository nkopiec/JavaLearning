package pl.java;

import java.util.StringTokenizer;

public class Test72 {

	public static void main(String[] args) {
		String numbers = "21 + 21";
		StringTokenizer st = new StringTokenizer(numbers);
		int n = st.countTokens(); //1
		System.out.println(st.countTokens());
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		//String s4 = st.nextToken(); spowoduje  wywo³anie wyjatku "NoSuchElementException"
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
		}
		
		System.out.println(st.hasMoreTokens());
		

	}

	
	

}
