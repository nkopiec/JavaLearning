package pl.java;

public enum EnumTest {
	SMALL(false), MEDIUM(false), LARGE(false), XXL(true);
	
	boolean isBig;
	EnumTest(boolean isBig) {
		this.isBig = isBig;
	}
	
	String getSize(EnumTest et) {
		String size = (et.isBig) ? "Big" : "small";
		return "Size" + et + "its" + size;
	}
	
	
}
