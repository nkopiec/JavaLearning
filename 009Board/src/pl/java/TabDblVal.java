package pl.java;

public class TabDblVal {
	
	public TabDblVal() {
		int[] a = {1, 2, 3, 4 };
		int[] wynik = dblVal(a);
		for (int i=0; i < wynik.length; i++)
			System.out.println(" " + wynik[i]);
	}

	public int[] dblVal(int[] tab) {
		int[] w = new int[tab.length];
		for (int i=0; i < w.length; i++) w[i] = tab[i]*2;
		return w;
	}
	
	public static void mail(String[] args) {
		new TabDblVal();
	}
}
