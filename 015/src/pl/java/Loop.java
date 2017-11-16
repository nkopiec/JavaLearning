package pl.java;

public class Loop {
	public static void main(String[] args) {
	for (double d = 4; d < 100; d=d*3.4) {
		System.out.println(d);
	}
	double b = 4;
	while(b < 100) {
		System.out.println(b);
		b=b*3.4;
	}
	double k = 4;
	do {
		System.out.println(k);
	}
	while(k < 100);
	k=k+3.4;
	
	}
}
