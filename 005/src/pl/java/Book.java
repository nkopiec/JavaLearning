package pl.java;

public class Book extends Bookshop {

		private String author;
		
		public Book(String aut, String tit, String pub, int y, String id, double price, int quant) {
			super(tit, pub, y, id, price, quant);
			author = aut;
	}
		
		public String getAuthor() {
			return author;
		}
		
		
	
	}