
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("The Body Mass Index of someone who is 1.5 meters and 45 kilograms is: "+ bodyMassIndex(1.5, 45));
	}
	public static double bodyMassIndex (double heightInMeters, double weightInKilograms){
		//bmi is your weight (in kilograms) over your height squared (in meters).
		double h = heightInMeters;
		double h2=Math.pow(h, 2);
		//h2= height squared
		double w=weightInKilograms;
		double bmi = w/h2;
		return (bmi);
		
	}
}
