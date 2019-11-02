package stringsArrays;

public class checkNumberPrime {

	public static void main (String args[]) {
	
	int number=4,count=0;
	
	for (int i=2; i<=number - 1; i++) {
		if (number%i==0) {
			count++;
		}
	}
	//System.out.println(count);
	if (count>0) {
		System.out.println("No. is not Prime");
	}
	else {
		System.out.println("No. is Prime");
	}
	}
}
