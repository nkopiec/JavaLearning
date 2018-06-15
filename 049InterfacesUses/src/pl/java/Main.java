package pl.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> SchoolClass = new ArrayList<>();
		SchoolClass.toString();

		List<SchoolClass> clas = Arrays.asList(
				new SchoolClass("Stanis³aw", "Kowalski", 3.5, 23),
				new SchoolClass("Joanna", "Surman", 4.0, 10),
				new SchoolClass("Andrzej", "Guz", 5.0, 3),
				new SchoolClass("Natalia", "Wi¹cek", 2.5, 15),
				new SchoolClass("Jakub", "Anio³", 1.0, 20),
				new SchoolClass("Jakub", "Anio³", 3.0, 17));
		
		// wszyscy uczniowie 
		Set<SchoolClass> set1 = new HashSet<>(clas);
		System.out.println(set1);
		//po kolei
		Set<SchoolClass> set2 = new LinkedHashSet<>(clas);
		System.out.println(set2);
		//afabetycznie
		Set<String> set3 = new TreeSet<>( Arrays.asList("Kowalski", "Surman", "Guz", "Wi¹cek", "Anio³", "Anio³"));
		System.out.println(set3);
		//pokolei 
		Collections.sort( Arrays.asList("Kowalski", "Surman", "Guz", "Wi¹cek", "Anio³", "Anio³"));
		Collections.sort(clas);
		System.out.println( Arrays.asList("Kowalski", "Surman", "Guz", "Wi¹cek", "Anio³", "Anio³"));
		//wg numerów
		Collections.sort(clas, new Comparator<SchoolClass>() {
			@Override
			public int compare(SchoolClass s1, SchoolClass s2) {
				return s1.getNumber() - s2.getNumber();
			}
		});
		System.out.println(clas);
		//odwrócone
		Collections.sort(clas, Collections.reverseOrder());
		System.out.println(clas);
		//
		clas.sort( new Comparator<SchoolClass>() {

			@Override
			public int compare(SchoolClass s1, SchoolClass s2) {
				return hashCode();
			}
			
		});
		System.out.println(clas);
		//wg ocen
		Set<SchoolClass> set4 = new TreeSet<>(clas);
		System.out.println(set4);
		
		set4 = new TreeSet<>(new Comparator<SchoolClass>() {
			@Override
			public int compare(SchoolClass s1, SchoolClass s2) {
				return (int) (s1.getMark() - s2.getMark());
			}
		});
		set4.addAll(clas);
		System.out.println(set4);
		
		
	}

	class Para<T, S> {
		private T first;
		private S last;
		
		public Para(T first, S last) {
			this.first = first;
			this.last = last;
		}
		
		public T getFirst() {
			return first;
		}
		
		public S getLast() {
			return last;
		}
		
		public void setFirst(T f){
			first = f;
		}
		
		public void setLast(S l) {
			last = l;
		}
	}

}
