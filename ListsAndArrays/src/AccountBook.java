import java.util.Scanner;


public class AccountBook {
//intermediate (multidimensional arrays)
	
	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019) and an amount of money you would like to store
	//and returns the saving you would have for this year.
	
	public static int saving(int year, int [][] array){
		
		int i,saving;
		
		for(i=0;i<10;i++){
			
			if(year == array[i][0]){
				saving = array[i][1] + (array[i][1]*2/100);
				return saving;
			}
		}
		return 0;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		AccountBook ab = new AccountBook();
		
		int[][] arr = new int[10][2];
		
		int yr,i,j,savingg;
		
		System.out.println("Enter year and amount to be stored");
		
		for(i=0;i<10;i++){
			for(j=0;j<2;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		while(true){
		System.out.println("Which year saving u want to know?");
		yr = sc.nextInt();
		savingg = ab.saving(yr, arr);
		
		System.out.println("your saving for year "+yr+" is "+savingg);
		}
	}

}
