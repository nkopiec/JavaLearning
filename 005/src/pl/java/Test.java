package pl.java;

public class Test {
	
	static void test(String jakiePary, ParaIII p1, ParaIII p2) {
		System.out.println(jakiePary + " == - daje wynik: " + (p1 == p2));
		System.out.println(jakiePary + " equals - daje wynik: " + p1.equals(p2));
	}

	public static void main(String[] args) {
		
		ParaIII paraIII1 = new ParaIII(1,2);
		ParaIII paraIII2 = new ParaIII(3,4);
		ParaIII paraIII3 = new ParaIII(5,6);
		test("paraIII1 i paraIII2", paraIII1, paraIII2);
		test("paraIII1 i paraIII3", paraIII1, paraIII3);
		paraIII2 = paraIII1;
		System.out.println("Po podstawieniu paraIII2 = paraIII1");
		test("paraIII1 i paraIII3", paraIII1, paraIII3);
	}

	
}
