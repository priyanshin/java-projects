
public class tempConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println ("17 degrees Fahrenheit to degrees Celsius: " + fahrenheitToCelsius(17));
			System.out.println("38 degrees Celsius to degrees Fahrenheit: " + celsiusToFahrenheit(38));
			System.out.println("11 degrees Fahrenheit to Kelvin: " + fahrenheitToKelvin(11));
			System.out.println("16 Kelvin to degrees Fahrenheit: " + kelvinToFahrenheit(16));
			System.out.println("71 Kelvin to degrees Celsius: " + kelvinToCelsius(71));
			System.out.println("49 degrees Celsius to Kelvin: " + celsiusToKelvin(49));
		}
		
	public static double fahrenheitToCelsius(double fahrenheit) {
		//Fahrenheit to Celsius
		double count = fahrenheit;
		count = count - 32;
		count = count *5;
		count = count/9;
		return (count);
		
		
		
	}

	public static double celsiusToFahrenheit (double celsius){
		//Celsius to Fahrenheit
		double count2 = celsius;
		count2 = count2 *9;
		count2= count2/ 5;
		count2 = count2 + 32;
		return (count2);
	
		
	}
	public static double fahrenheitToKelvin (double fahrenheit){
		//Fahrenheit to Kelvin
			fahrenheitToCelsius(11);
			//Fahrenheit to Celsius method
		    double count3=fahrenheitToCelsius(11);
		    count3=count3+273.15;
		    return (count3);
		
	}
	
	public static double kelvinToFahrenheit (double kelvin){
		//Kelvin to Fahrenheit
		
		double count4= kelvin;
		count4=count4-273.15;
		double x= celsiusToFahrenheit(count4);
		return (x);
		
	}
	
	public static double kelvinToCelsius (double kelvin2){
		//Kelvin to Celsius
		double count5=kelvin2-273.15;
			return (count5);
		
	}
	public static double celsiusToKelvin (double celsius2){
		//Celsius to Kelvin
		double count6=celsius2+273.15;
		return (count6);
		
		
	}
}




