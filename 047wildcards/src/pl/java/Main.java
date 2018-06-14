package pl.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		ArrayList<Object> l0 = new ArrayList<>();
		l0.add(new Object());
		
		ArrayList<Number> l1 = new ArrayList<>();
		l1.add(12);
		l1.add(23);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(34344);
		
		Util.write1(l2);
		Util.write2(l0);
		Util.write3(l1);
		
		
		
		ArrayList<String> Person = new ArrayList<>();
		Person.toString();
		
		ArrayList<String> Employee = new ArrayList<>();
		Employee.toString();
		
		ArrayList<String> Menager = new ArrayList<>();
		Menager.toString();
		
		Para<Manager, Manager> para0 = new Para<>(new Manager(), new Manager());
		Para<Employee, Employee> para1 = new Para<>(new Employee(), new Employee());
		
		Para para = Main.copy(para0, para1);
		System.out.println(para.getFirst());
		
		
		List<Employee> elist = Arrays.asList(
				new Employee("Jan", "Malinowski", 1200),
				new Employee("Jan", "Malonowski", 1000),
				new Employee("Jan", "Nowak", 1000),
				new Employee("Jan", "Kwiatkowski", 1000));
		
		Set<Employee> set = new LinkedHashSet<>(elist);
		System.out.println(set);
		
		Set<Employee> set0 = new HashSet<>(elist);
		System.out.println(set0);
		
		Set<String> set1 = new TreeSet<>( Arrays.asList("Malinowski", "Malinowski", "Nowak", "Kwiatkowski"));
		System.out.println(set1);
		
		Collections.sort( Arrays.asList("Malinowski", "Malinowski", "Nowak", "Kwiatkowski"));
		Collections.sort(elist);
		System.out.println(elist);
		
	}
		
	public static <S,T> Para<? super S, ? super T>
			copy(Para<? extends S, ? extends T> src, Para<? super S, ? super T> dest) {
		dest.setFirst(src.getFirst());
		dest.setLast(src.getLast());
		return dest;
	}
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
