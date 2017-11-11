package pl.java;

public class Lesson3 {
	public static void main(String[] args) {
		int a = 234;
		double b = 4.564;
		double c = 4.5;
		
		double d = a-b;
		double e = a+c;
		double f = a*b;
		f++;
		double g = b / c;
		
		System.out.println(d);
		System.out.println(e--);
		System.out.println(f);
		System.out.println(g);
		System.out.println(e);
		
		
		int q = 2, p = 22, u = 234;
		if(p > q) {
			System.out.println("p is bigger from q");
			
		}
		if(p < q) {
			System.out.println("q is bigger from p");
		}
		else {//jesli powy¿szy warunke nie jest prwdziwy wykonaj...
			System.out.println("p is bigger from q");
		}
		if(p == q) {
			System.out.println("p is equal q");
		}
		if(u > q && u > p) {//jesli pierwszy warunek nie jest prawdziwy kolejne nie s¹ sprawdzane
			System.out.println("u is the biggest");
		if(p == u || q < p ) {// wszystkie warunki s¹ sprawdzane
			System.out.println("p is equal u or p is bigger from p");
		}
		
		int x = 7, y = 5;
		switch(x) {
			case 3:
				System.out.println("x is equal 3");
			break;
				
			case 4:
				System.out.println("x is equal 4");
			break;
			
			default:
				System.out.println("x is other");
			break;
		}
		}
	}
	
}
