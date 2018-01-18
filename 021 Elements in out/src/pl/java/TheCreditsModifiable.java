package pl.java;

public class TheCreditsModifiable {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		sb.append("some");
		sb.append("thing");
		sb.append(10);
		sb.append('\n');
		sb.append(12);
 
		System.out.println(sb);
		
		sb.append("some").append("thing").append(10).append('\n').append(12);
		
		System.out.println(sb);
	}

}
