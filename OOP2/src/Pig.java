import java.util.Date;


public class Pig extends Animal implements Pet{

	public String getName;
	public Date birthday;
	public String getGender;
	
	public Pig(String name, Date birthday, boolean isFemale) {
		// TODO Auto-generated constructor stub
		
		System.out.println(name+" "+birthday+" "+isFemale);
	}

	@Override
	public void pet() {
		// TODO Auto-generated method stub
		
		System.out.println("mr. piggy is a pet");
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
		System.out.println("mr. piggy is a bad pet");
	}
	
	

}
