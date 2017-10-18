package pl.java;

public class ParaIII {
	private int a;
	private int b;
	
	public ParaIII(int a, int b) {
		a = a;
		b = b;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ParaIII other = (ParaIII) obj;
		if (a != other.a || b != other.b) return false;
		return true;
	}
}