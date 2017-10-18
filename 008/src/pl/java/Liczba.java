package pl.java;

public class Liczba {
	
	int a;
	
	public Liczba(int liczba) {
		a = liczba;
		
	}
	
	public double pow(int n) {
		
		if (n < 0) {
			System.out.println("Niedopuszczalna wartoœæ wyk³adnika");
			return -0.1;
			
		}
		double wynik = 1;
		for (int i = 1
		; i <= n; i++) wynik *= a;
		return wynik;
	}

}
