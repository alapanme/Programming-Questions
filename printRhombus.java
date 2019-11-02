package stringsArrays;

public class printRhombus {
	
	public static void main (String args[]) {
		
		/*
		 
		 * 
		***
	   *****
	  *******
	   *****
	    ***
	     *
	     
		 */
		
		int rows = 7;
		int columns = 0;
		
		for (int i=0;i<=rows-1;i++) {
		for (int j=0; j<=columns; j++) {
			System.out.print("*");
		}
		if (i < 3) {
		columns = columns + 2;
		}
		else {
			columns = columns - 2;
		}
		System.out.println("");
		}
	}

}
