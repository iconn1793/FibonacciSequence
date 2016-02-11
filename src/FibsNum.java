import java.util.Scanner;

public class FibsNum {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please select a number in Fibonacci's sequence: ");
		int i = kb.nextInt();
		System.out.println(recFib(i));

		kb.close();
	}
	
	public static int fib( int n ){
		
		int a = 1;
		int b = 1;
		int num = 0;
		
		if (n < 1 ){
			System.out.println("Please enter a positive number.\n");
			return 0;
		}
		
		if( n==1 || n==2 ) {
			return 1;
		}
		
		for (int i = 2; i < n; i++){
			
			num = a + b; 
			a = b;
			b = num;
			
		}
		
		return num;
		
	}
	
	public static int recFib( int n){
		
		if (n <= 0){
			System.out.println("Please enter a positive integer." );
			return 0;
		}
		else if (n <= 2){
			return 1;
		}
		else {
			return (recFib(n-1) + recFib(n-2));
		}
		
	}

}
