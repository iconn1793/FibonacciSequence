

public class FibsNum {

	public static void main(String[] args) {
		
		
		//this main method only serves to demo the fib() method, which can generate any number in the Fibonacci sequence.
		
		for (int k = 1; k <= 10; k++){
        System.out.print(fib(k) + " ");
		}
		System.out.println("\n\n");
		
		System.out.println(recFib(9, 3, 1, 1));

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
	
	public static int recFib( int n, int p, int j, int k){
		
		//n == nth number in sequence that user wants
		//p == recursion counter (what number in sequence currently being generated)
		//j & k == previous numbers in sequence
		
		int l = j + k; 
		j = k;
		k = l;
		
		if (n <= 0){
			System.out.println("Please enter a positive integer." );
			return 0;
		}
		else if (n <= 2){
			return 1;
		}
		else if (p < n ){
			p++;
			return recFib(n, p, j, k);
		}
		else if (p == n){
			return l;
		}
		else{
			return 0;
		}
		
	}

}
