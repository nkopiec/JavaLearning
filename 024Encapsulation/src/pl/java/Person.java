package pl.java;

public class Person {
	
		private String name;
		private String pesel;
		
		Person(String aname, String id) {
			name = aname;
			pesel = id;
		}
		
		String getName() {
			return name;
		}
		
		public String getPesel() {
			return pesel;
		}
}
