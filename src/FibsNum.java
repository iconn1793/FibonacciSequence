

public class FibsNum {

	public static void main(String[] args) {
		
		
		//this main method only serves to demo the fib() method, which can generate any number in the Fibonacci sequence.
		
		for (int k = 1; k <= 10; k++){
        System.out.print(fib(k) + " ");
		}

	}
	
	public static int fib( int n ){
		
		int[] sequence = new int[n];
		sequence[0] = 1;
		
		if (n > 1){
			sequence[1] = 1;
		}
		
		
		for (int i = 2; i < n; i++){
			
			sequence[i] = sequence[i-1] + sequence[i-2];
			
		}
		
		
		return sequence[n-1];
		
	}

}
