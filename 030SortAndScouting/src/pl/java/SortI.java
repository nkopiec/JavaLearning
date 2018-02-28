package pl.java;

public class SortI {
	public static void main(String[] args) {
	
	int binarySearch(int[], int v) {
		int low = 0;
		int high = tab.lenght - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (v < tab[mid])
				high = mid -1;
			else if (v > tab[mid]) 
					low = mid + 1;
			else return mid;
		}
		return -1;
	}
	}
}