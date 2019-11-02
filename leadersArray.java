package stringsArrays;

public class leadersArray {
	
	public static void main(String args[]) {
		
		//A leader is an element which is larger than all the elements in the array to its right.
		
		int[] a = {5,4,3,2,9,1,0,100,9,0,12,8};
		int count = 0;
		int len = a.length;
		int flag =0;
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<=a.length-1; j++) {
				if (a[i] > a[j]) {
					count++;
				}
			}
			if (count == len-1) {
				System.out.println("The leader is: " + a[i]);
				flag ++;
			}
			len--;
			count=0;
		}
		if (flag == 0) {
			System.out.println("The leader is not present in the series.");
		}
	}

}
