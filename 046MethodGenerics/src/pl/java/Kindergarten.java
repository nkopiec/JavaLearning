package pl.java;

class Kindergarten {
	Object jan;
	Object zosia;
	Object basia;

	public Kindergarten(Object j, Object z, Object b) {
		jan = j;
		zosia = z;
		basia = b;
	}


	public Object getJan() { return jan; }
	public Object getZosia()   { return zosia; }
	public Object getBasia()   { return basia; }

	public void setJan(Object j) { jan = j; }
	public void setZosia(Object z) { zosia = z; }
	public void setBasia(Object b) { basia = b; }
}
