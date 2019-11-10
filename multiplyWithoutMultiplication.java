package recursion;

public class multiplyWithoutMultiplication {
	
	public static int Multiplication(int x, int y) {
		
		if (y==0) {
			return 0;	
		}
		
		else if (y>0){
			return (x + Multiplication(x,y-1)); 
		}
		
		else if (y<0) {
			return -(x + Multiplication(x,-y-1));
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		System.out.println(Multiplication (10,45));
	}
	
}