package stringsArrays;

public class bubbleSort {
	
	public static void main(String args[]) {
		
		int[] a = {6,4,5,2,3,1};
		int temp = 0, size=a.length;
		
		for (int i=0; i<size-1; i++) {
			for (int j=0; j<size-1-i; j++) {
				if (a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i=0; i<=size-1; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
