import java.util.Arrays;
import java.util.Scanner;


public class Basics {
//beginner
	
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element
	
	public static int leng(int [] array){
		
		int length = array.length;
		return length;
		
	}
	
	public static void drop(int [] array){
		
		int [] arr = new int[array.length-1];
		
		int i = 0;
		
		for(;i<arr.length;i++){
			
			arr[i] = array[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static int sum(int [] array){
		
		int i=0, sum=0;
		
		for(;i<array.length;i++){
			
			sum = sum + array[i];
		}
		
		return sum;
	}
	
	public static void find(int [] array,int item){
		
		int i=0;
		
		for(;i<array.length;i++){
			
			if(item == array[i]){
				System.out.println("item found");
				return;
			}
		}
		
		System.out.println("item not found");
	}
	
	public static void main(String args[]){
		
		int [] arr = new int[] {1,2,3,4,5,6};
		
		Scanner sc = new Scanner(System.in);
		Basics ba = new Basics();
		
		int leng = ba.leng(arr);
		System.out.println(leng);
		
		ba.drop(arr);
		
		int summ = ba.sum(arr);
		System.out.println(summ);
		
		System.out.println("Enter item to be found");
		int item = sc.nextInt();
		ba.find(arr, item);
	
	}

}
