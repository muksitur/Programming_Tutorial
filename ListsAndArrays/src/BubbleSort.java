import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {
//intermediate
	
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	
	public static void bubble(int [] array){
		
		int j; 
		boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < array.length -1;  j++ )
	            {
	                   if ( array[ j ] > array[j+1] )   // change to > for ascending sort
	                   {
	                           temp = array[ j ];                //swap elements
	                           array[ j ] = array[ j+1 ];
	                           array[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      }
	     
	     System.out.println(Arrays.toString(array));
	     
	}
	
	public static void main(String args[]){
		
		int [] arr = new int[6];
		int i = 0;		
		System.out.println("Enter an array of 6 integers");
		Scanner sc = new Scanner(System.in);
		
		for(;i<arr.length;i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		BubbleSort bs = new BubbleSort();
		
		bs.bubble(arr);
	}
}
