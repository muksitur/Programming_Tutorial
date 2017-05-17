
import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 0, sum = 0;
		char dum;
		int a[] = new int[50];
		String s[] = new String[50];
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		System.out.println("Enter numbers. The program ends when it has \"s\"");
		while(true){
			try{
				s[i] = scan.next();
				a[i] = Integer.parseInt(s[i]);
				sum = sum + a[i];
				//System.out.println(a[i]);
				//System.out.println(s[i]);
				i++;
			}
			catch(NumberFormatException e){
				System.out.println(sum);
				return;
			}
			
		}
	}
	
}
