import java.util.Date;


public class Lion  extends Animal implements Predator{
	
	public String getName;
	public Date birthday;
	public String getGender;

	public Lion(String name, Date birthday, boolean isFemale) {
		// TODO Auto-generated constructor stub
		
		System.out.println(name+" "+birthday+" "+isFemale);
	}

	@Override
	public void warningPlate() {
		// TODO Auto-generated method stub
		
		System.out.println("mr. liony is a kitty");
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
		System.out.println("mr. liony is a bad kitty");
	}

}
