package pl.java;

import pl.java.packing.Disk;

public class Definement {
	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 10;
		int b1 = 11;
		int b2 = 12;
		int c1;
		int c2;
		c1 = a1 + b1;
		c2 = a2 + b2;
		System.out.println(c1 + " " + c2);
		
		Para para = new Para(23, 67);
		para.show();
		int d = para.sum();
		System.out.println(d);
		
		Publication publication = new Publication("smerfy", "trwam");
		publication.show();
		String tiitle = publication.getTiitle();
		System.out.println(tiitle);
		
		Calculator calculator = new Calculator();
		calculator.setA(34);
		calculator.setB(78);
		calculator.show();
		int c = calculator.sum();
		System.out.println(c);
		
		Bookshop bookshop = new Bookshop("Wild animals", "Nature", 1997, "DFER456", 45.2, 10);
		bookshop.show();
		bookshop.show("Koty", "Janusz Nowak", 2016, "HAJS2345", 13.50, 0);
		String title = bookshop.getTitle();
		String publisher = bookshop.getPublisher();
		int year = bookshop.getYear();
		String ident = bookshop.getIdent();
		double price = bookshop.getPrice();
		int qualitity = bookshop.gatQualitity();
		System.out.println(title + " " + publisher + " " + year + " " + ident + " " + price + " " + qualitity);
		
		Disk.setVat(22.0);
		Disk disk = new Disk("Seagate Barracuda", 500, 200.0);
		System.out.println(disk.getDespription() + " - cena " + disk.getBruttoPrice() + " z³" );
		
		Disk disk1 = new Disk("Segregator", 700);
		disk1.show();
		disk1.setPrice(45.50); 
		disk1.show();
		
		ParaII para1 = new ParaII(1, 5);
		ParaII para2 = new ParaII(2, 4);
		para1.show("ParaII 1 =");
		para2.show("ParaII 2 =");
		ParaII sumaPar = para1.add(para2);
		sumaPar.show("Suma par =");
		para1.set(para2);
		para1.show("Teraz para 1 = ");
		
		double a = 12.0, b = 14.0, q = 4.0;
		
		Work w = new Work();
		w.report(a,  b, q);
		a++;
		b++;
		q++;
		w.report(a, b, q);
		a++;
		b++;
		q++;
		w.report(a, b, q);
		
		Trojka t = new Trojka(12, 14, 4);
		t.report();
		t.increase();
		t.report();
		t.increase();
		t.report();
		
		Book book = new Book("James Gossling", "Moja Java", "wnt", 2009, "dhja4567", 34.57, 3);
		int n = 100;
		book.buy(n);
		double koszt = n * book.getPrice();
		System.out.println("Na zakup " + n + " ksi¹¿ek:");
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getPublisher());
		System.out.println(book.getYear());
		System.out.println(book.getIdent());
		System.out.println("-----------\nwydano: " + koszt);
		book.sell(90);
		System.out.println("-----------");
		System.out.println("Po sprzeda¿y zosta³o " + book.gatQualitity() + " pozycji");
		
		
	}
	
}
	