package pl.java;

public class ObjectsArrays {
	public static void main(String[] args) {
		String[] tab1 = new String[] {"Sosnowiec", "Radom", "Ciechocinek"};
		show(tab1);
		
		String help = tab1[0];
		tab1[0] = tab1[2];
		tab1[2] = help;
		show(tab1);
		
		Para[] tab2 = new Para[10];
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = new Para();
		}
		
		for (int i = 0; i < tab2.length; i++) {
			tab2[i].show();
		}
		System.out.println();
		Para[] tab3 = new Para[] {new Para(), new Para(), new Para(1, 3)};
		for (Para para : tab3) {
			para.show();
		}
				
	}
	
	public static void show(String[] args) {
		for (String element : args) {
			System.out.println(element);
		}
	}
}
