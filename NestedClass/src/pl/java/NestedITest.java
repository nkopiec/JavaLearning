package pl.java;

public class NestedITest {

	public static void main(String[] args) {
		NestedI nestedI = new NestedI();
		int a;
		NestedI.MyInner inner = nestedI.new MyInner(a= 8);
		inner.accessTest();

	}

}
