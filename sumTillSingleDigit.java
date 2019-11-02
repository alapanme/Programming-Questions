package stringsArrays;

public class sumTillSingleDigit {
	
	public static void main (String args[]) {
	
	int n = 12345678;
	int sum = 0;
	
	while (n>0 || sum>9) {
		
        if (n == 0) { 
            n = sum; 
            sum = 0; 
        } 
		
		sum += n%10;
		n = n/10;	
	}
	System.out.println(sum);
	
	}
	
}
