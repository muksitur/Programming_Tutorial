import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
		String s, num;
		int i,j,val;
		s = scan.nextLine();
		
		for(i=0;i<s.length()-1;i++){
			
			/*if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' ||
					s.charAt(i) == '8' || s.charAt(i) == '9'){
				
				for(j=0;;){
					if(s.charAt(j) == '0' || s.charAt(j) == '1' || s.charAt(j) == '2' || s.charAt(j) == '3' || s.charAt(j) == '4' || s.charAt(j) == '5' || s.charAt(j) == '6' || s.charAt(j) == '7' ||
							s.charAt(j) == '8' || s.charAt(j) == '9'){
						
					}
					
					else{
						num = s.substring(i, j);
					}
				}
			}*/
			
			
			if(i%2 == 0){
				num = Character.toString(s.charAt(i));
				//System.out.print(num);
				val = Integer.parseInt(num);
				
				for(j=0;j<val;j++){
					
					System.out.print(s.charAt(i+1));
				}
			}
			
		}
	}
	
}
