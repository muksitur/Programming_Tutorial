import java.util.ArrayList;


public enum SolarSystem {
	
	MERCURY (3.303e+23, 2.4397e6), 
	VENUS (4.869e+24, 6.0518e6),
	EARTH (5.976e+24, 6.37814e6), 
	MARS (6.421e+23, 3.3972e6),
	JUPITER (1.9e+27, 7.1492e7), 
	SATURN (5.688e+26, 6.0268e7),
	URANUS (8.686e+25, 2.5559e7), 
	NEPTUNE (1.024e+26, 2.4746e7);
	
	private final double value1;
	private final double value2;
	private final double g = 6.67300E-11;

	SolarSystem(double value1, double value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public double getMass(){
		
		return value1;
	}
	
	public double getRadius(){
		
		return value2;
	}
	
	public double gravity(){
		
		double grav = g*value1/(value2*value2);
		return grav;
	}
	
	public double weight(){
		
		double weigh = value1*value2;
		return weigh;
	}

}
