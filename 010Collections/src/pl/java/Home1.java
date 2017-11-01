package pl.java;

public class Home1 {
	Nosy n1 = new Nosy();
	public static void main(String[] args) {
		Nosy n = new Nosy();
		System.out.println(n.toString());
		
		String s1 = "Tekst";
		String s2 = new String("Tekst");
		if (s1 == s2)
			System.out.println("s1==s2");
		if(s1.equals(s2))
			System.out.println("s1.equals(s2)");
		if(n instanceof Object)
			System.out.println("n istanceof Object");
	
		TV1.changeVolume();
		int y = Nosy.a;
	
	}

}
