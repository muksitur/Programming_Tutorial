import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws ParseException{
		Driver d = new Driver();
		d.testLion();
		d.testPig();
	}
	public void testLion() throws ParseException{
		
		String lname = "rudy";
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date ldob = fmt.parse("2013-05-06");
		boolean lisFemale = true;
		
		Lion l = new Lion(lname, ldob, lisFemale);
		
		l.saySomething();
		l.warningPlate();
	}
	
	public void testPig() throws ParseException{
		
		String pname = "piggy";
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date pdob = fmt.parse("2013-07-31");
		boolean pisFemale = true;
		
		Pig p = new Pig(pname, pdob, pisFemale);
		
		p.saySomething();
		p.pet();
	}

}
