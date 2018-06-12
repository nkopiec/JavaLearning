package pl.java;

public class Main {

	public static void main(String[] args) {
		Kindergarten kindergarten = new Kindergarten("Ala", new Integer(4), null);
	     System.out.println(kindergarten.getJan() + " " + kindergarten.getZosia());
	    
	     String name = (String) kindergarten.getJan();
	     int nr = (Integer) kindergarten.getZosia();
	     kindergarten.setJan(name + " Kowalska");
	     kindergarten.setZosia( new Integer(nr + 1));
	     System.out.println(kindergarten.getZosia() + " " + kindergarten.getZosia());

	     kindergarten.setZosia("kot");
	     System.out.println(kindergarten.getZosia() + " " + kindergarten.getZosia());

	     Integer n = (Integer) kindergarten.getZosia(); 

	}

}
