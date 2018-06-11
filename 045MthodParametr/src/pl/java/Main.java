package pl.java;

public class Main {

	public static void main(String[] args) {
		   ParaObj po = new ParaObj("Ala", new Integer(3));
		     System.out.println(po.getFirst() + " " + po.getLast());

		    
		     String name = (String) po.getFirst();
		     int nr = (Integer) po.getLast();
		     po.setFirst(name + " Kowalska");
		     po.setLast( new Integer(nr + 1));
		     System.out.println(po.getFirst() + " " + po.getLast());


		    
		     po.setLast("kot");
		     System.out.println(po.getFirst() + " " + po.getLast());

		    
		     Integer n = (Integer) po.getLast(); 
	}

}
