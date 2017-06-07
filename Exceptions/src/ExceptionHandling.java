
public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		try{
			int a = 5;
			int b = 0;
			int div = a/b;
		}
		catch(ArithmeticException e){
			System.err.println("error occurred");
			e.printStackTrace();
		}
		
		try{
			int[] arr = new int[5];
			arr[5] = 7;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("error occurred");
			e.printStackTrace();
		}
		
		try{
			String one = "one";
			int i = Integer.parseInt(one);
		}
		catch(NumberFormatException e){
			System.err.println("error occurred");
			e.printStackTrace();
		}
		
		try{
			double c = -7.0;
			
			double d = root(c);
			System.out.println(d);
		}
		catch(CustomException e){
			System.err.println("error occurred");
			e.printStackTrace();
		}
	}
	
	public static double root(double c) throws CustomException{
		if(c<0){
			throw new CustomException("cannot sqrt negative number");
		}
		
		else{
			return Math.sqrt(c);
		}
	}

}
