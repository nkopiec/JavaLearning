package helloword;

public class Exercises {
	public static void main(String[] args) {
		double d = 10.1;
		int a = (int) d;
		System.out.println(a);
		int h,c,g;
		h = 10;
		c = 4;
		g = h/c;
		System.out.println(g);
		double n,m,j;
		m = 10;
		n = 4;
		j = m/n;
		System.out.println(j);
		int q,w,e;
		q = 30;
		w = 20;
		e = w*(q/w);
		System.out.println(e);
		int x = 41;
		int s = 7;
		int poj = x/s;
		int rest = x%s;
		if (rest != 0) {
			poj++;
			s = rest;
			System.out.println(s + poj);
			int u, p = 1;
			u = ++p;
			System.out.println(u);
			int z, o = 123;
			z = --o;
			System.out.println(z);
		}
	}

}
