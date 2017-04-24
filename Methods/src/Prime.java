import java.util.Scanner;


public class Prime {
	
	public static int chkprime(int num){

		int temp = 1;
		int prime_flag = 0;
		
		while(temp<=((double)num)/2){
			
			temp++;
			if((num%temp)==0){
				prime_flag++;
				System.out.println(num+" is divisible by "+temp);
			}
		}
		
		return prime_flag;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: write a method which tells you if a given number is a prime or not
		
		Prime pr = new Prime();
		
		while(true){
		
			System.out.println("Enter the number: ");
			
			int number = scan.nextInt();
			
			
			int flag = pr.chkprime(number);
			
			if(flag == 0){
				System.out.println(number+" is a prime");
			}
			else
				System.out.println(number+" is not a prime");
				
		}
		
	}
	
}
