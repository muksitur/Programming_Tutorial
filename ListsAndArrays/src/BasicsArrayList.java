import java.util.ArrayList;
import java.util.Scanner;


public class BasicsArrayList {
private static ArrayList a1;

//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList
	
	public static void add(ArrayList a, int item){
		
		a.add(item);
	}
	
	public static void del(ArrayList a,int index){
		
		a.remove(index);
	}
	
	public static void show(ArrayList a){
		
		System.out.println("Contents of the list: "+a);
	}
	
	public static void main(String args[]){
		
		int choice,item,pos;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		BasicsArrayList bal = new BasicsArrayList();
		
		while(true){
			System.out.println("choose from the following: \n1 -> add in the list \n2 -> delete from the list \n3 -> show the list");
			choice = sc.nextInt();
			
			if(choice == 1){
				System.out.println("item to add");
				item = sc.nextInt();
				bal.add(a1,item);
			}
			else if(choice == 2){
				System.out.println("delete from which position?");
				pos = sc.nextInt();
				bal.del(a1,pos-1);
			}
			else if(choice == 3){
				bal.show(a1);
			}
		}
		
	}

}
