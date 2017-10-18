package pl.java;

public class ChgTab {

	
	public void chgTab1(int[] tab) {
		int[] nowa = { 3, 6, 8 };
		tab = nowa;
		showTab("W matodzie chgTab1 tablica oznaczona przez tab", tab);
		
	}
	
	public void chgTab2(int[] tab) {
		for (int i=0; i < tab.length; i++) tab[i]++;
	}
	
	public void showTab(String s, int[] tab) {
		System.out.println(s);
		for (int i=0; i < tab.length; i++) System.out.println(" " + tab[i]);
		System.out.println('\n');
	}
	
	public static void mail(String[] args) {
			ChgTab ct = new ChgTab();
			int[] tab = { 2, 5, 7};
			ct.chgTab1(tab);
			ct.showTab("Po wywo³aniu metody chgTab1 tablica oznaczona przez tab", tab);
			ct.chgTab2(tab);
			ct.showTab("Po wywo³aniu metody chgTab2 tablica oznaczona przez tab", tab);
	}
}
