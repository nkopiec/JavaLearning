package pl.java;

public class NestedI {
	private static int aStaticPrivate = 7;
	public static int aStaticPublic = 77;
	
	private int aPrivate = 10;
	public int aPublic = 100;
	
	//inner class
	class MyInner {
		private int a;
		
		
		public MyInner(int a) {
			this.a = a;
		}
		
		public void  accessTest() {
			System.out.println(aPrivate);
			System.out.println(aPublic);
			int a = NestedI.aStaticPublic;
			int b = NestedI.aStaticPrivate;
		}
	}
	static class MyNested {
		
	}

}
