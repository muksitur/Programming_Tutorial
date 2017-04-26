import java.util.Scanner;


public class Factorial {
	//todo: implement a recursive functions which gives you the factorial value of a given number
	
	public static int factorial(int n){
		
		if(n>=1)
			return n * factorial(n-1);
		
		else
			return 1;
		
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		Factorial fac = new Factorial();
		
		while(true){
			
			System.out.println("Enter a number(n): ");
			
			int num = scan.nextInt();
			
			int result = fac.factorial(num);
			
			System.out.println("n! = "+result);
			
		}
	}
}
