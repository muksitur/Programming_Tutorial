import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: take an String as input and reverse it. Then print it.
		int i,j;
		String s ;
		
		while(true){
		char rev[] = new char [100];
		System.out.println("enter any string");
		s = scan.nextLine();
		
		for(j = s.length()-1,i=0;j>=0;j--,i++){
			rev[i] = s.charAt(j);
			
		}
		System.out.println(rev);
		}
		
	}

}
