
public class InchesToCentimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inches = 9.8;
		System.out.println(inches + " inches is " + conversionInToCm(inches) + " centimeters.");
	}

	// 1 inch is 2.54 centimeters
	public static double conversionInToCm(double inches) {
		double cm = inches * 2.54;
		return cm;
	}
}
