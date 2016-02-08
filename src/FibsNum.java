

public class FibsNum {

	public static void main(String[] args) {
		
		
		//this main method only serves to demo the fib() method, which can generate any number in the Fibonacci sequence.
		
		for (int k = 1; k <= 10; k++){
        System.out.print(fib(k) + " ");
		}
		
		System.out.println("\n");
		System.out.println(fib(10));

	}
	
	public static int fib( int n ){
		
		int a = 1;
		int b = 1;
		int num = 0;
		
		if (n < 1 ){
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

}
