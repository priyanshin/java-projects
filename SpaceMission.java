
public class SpaceMission {
	static final double SPEED_OF_LIGHT= 3_000_000; //in meters/second
	static final double numberOfYears= 1.0464234E-5 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("If a star is 990 million meters away, it will take the spaceship "+ time (990000000)+ " years to reach it.");
		System.out.println(details("Majesty", "Catalogue", 983785738));
	}
	public static double time(double distanceInMeters){
		double seconds= distanceInMeters/SPEED_OF_LIGHT;
		double years= seconds * 3.17098E-8;
		return (years);
	}
	public static String details(String spaceship, String star, double distance){
		return ("Amazing, it will only take " + numberOfYears + " years for the spacecraft, "+ spaceship + ", to reach the star, " + star+ "!");
		
		
	}
	

}
