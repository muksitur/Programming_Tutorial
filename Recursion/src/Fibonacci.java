import java.util.Scanner;


public class Fibonacci {
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
	
	
	public static int fibonacci(int n){
		
		if(n>=2){
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
		else if(n==1)
			return 1;
		
		else
			return 0;
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		Fibonacci fib = new Fibonacci();
		
		while(true){
			
			System.out.println("Enter a number(n): ");
			
			int num = scan.nextInt();
			
			int result = fib.fibonacci(num);
			
			System.out.println("Fibonacci of n = "+result);
		}
		
	}
}
