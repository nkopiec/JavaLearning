package pl.java;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//Not possible
		//ArrayList<Object> list2 = list1;
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
		
		ArrayList<String> list2 = new ArrayList<String>();
		
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