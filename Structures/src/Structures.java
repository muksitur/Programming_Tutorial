package structures;

import java.util.Scanner;

//if-else

public class Structures {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                
                while(true){
                System.out.println("Enter your points: ");
                
                int score = scan.nextInt();
                char grade = 0;
                
                if (score < 50)
                    grade = 'F';
                else if (score < 60)
                    grade = '4';
                else if (score < 70)
                    grade = '3';
                else if (score < 80)
                    grade = '2';
                else if (score <100)
                    grade = '1';
                else
                    System.out.println("Sorry, your point is invalid");
                
                System.out.println("Your Result is: "+grade);
                }
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}