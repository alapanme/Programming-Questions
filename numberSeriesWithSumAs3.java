package stringsArrays;

public class numberSeriesWithSumAs3 {
	
	public static void main(String Args[]) {
		
		int a[] = {1,1,0,3,0,4,7,4,2,6};
		
		for(int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i] + a[j] == 3) {
					System.out.println("The Nos. are: " + a[i] + "," + a[j] + " " + "at position " + i + "," + j);
				}
			}
		}
		
	}
}
