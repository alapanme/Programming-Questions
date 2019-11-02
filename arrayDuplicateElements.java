package stringsArrays;

import java.util.ArrayList;

public class arrayDuplicateElements {
	
	public static void main (String args[]) {
		
		int a[] = {1,2,3,3,4,0,9,0,5,6,7,8,9,1,0};
		int count = 0;
		//ArrayList b = new ArrayList();
		
		for (int i=0; i<a.length-1; i++) {
			for (int j=i+1; j<=a.length-1; j++) {
				if (a[i] == a[j]) {
					count ++;
					//b.add(a[i]);
				}
			}
		}
		if (count >= 1) {
			System.out.println("Array has duplicate Elements");
			//System.out.println("Duplicate Elements are" + b);
		}
		else {
			System.out.println("Array doesn't have duplicate Elements");
		}
		
	}

}
