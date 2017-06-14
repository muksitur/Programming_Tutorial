
public class SolarSystemDriver {

	/*Todo: Create an enum with all Planets in the Solarsystem as
	 *allowed input types.
	 * Also save mass and radius of the planets. Here are the needed
	 * values:
	 * 
	 * MERCURY (3.303e+23, 2.4397e6), VENUS (4.869e+24, 6.0518e6),
	 * EARTH (5.976e+24, 6.37814e6), MARS (6.421e+23, 3.3972e6),
	 * JUPITER (1.9e+27, 7.1492e7), SATURN (5.688e+26, 6.0268e7),
	 * URANUS (8.686e+25, 2.5559e7), NEPTUNE (1.024e+26, 2.4746e7);
	 * 
	 * There should also be a constant for gravity:
	 * g = 6.67300E-11;
	 * 
	 * Write getter methods for mass and radius. Also write functions
	 * to compute the gravity
	 * Gravity = gravityconstant*mass/radius^2
	 * and the weight
	 * Weiht = mass*gravity
	 * 
	 * Print all the planets in this class and don't forget to test
	 * your methods
	 */
	
	public static void main(String[] args) {
		
		for(SolarSystem planet: SolarSystem.values()){
			System.out.println("planet: " + planet + " " + planet.getMass() + " " + planet.getRadius() + " " + planet.gravity() + " " + planet.weight());
		}

	}

}
