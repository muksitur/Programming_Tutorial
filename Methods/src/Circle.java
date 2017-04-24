import java.util.Scanner;


public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	
	public static double diameter(double r){
		
		return 2*r;
		
	}
	
	public static double circum(double r){
		
		return 2*3.1416*r;
	}
	
	public static double area(double r){
		
		return 3.1416*r*r;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Circle cir = new Circle();
		
		while (true){
			
			System.out.println("Enter the radius: ");
			
			double radius = scan.nextDouble();
			
			double diameter = cir.diameter(radius);
			
			double circum = cir.circum(radius);
			
			double area = cir.area(radius);
			
			System.out.println("Diameter is: "+diameter+"\nCircumsfarance is: "+circum+"\nArea is: "+area);
			
		}
	}
}
