
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * This function converts a temperature in Fahrenheit to a temperature in Celsius
	 * 
	 * @param fahrenheit The temperature in Fahrenheit that needs to be coverted to Celsius
	 * @return Returns the temperature in celsius
	 */
	public double fahrenheitToCelsius(double fahrenheit){
		double celsius= (fahrenheit-32)*5/9;
		return celsius;
	}
	
	/**
	 * This function converts a temperature in Fahrenheit to a temperature in Celsius and prints it
	 * 
	 * @param fahrenheit The temperature in Fahrenheit that needs to be coverted to Celsius
	 * 
	 */
	public void printTemperature(double fahrenheit){
		double celsius=fahrenheitToCelsius(fahrenheit);
	System.out.println("F: "+ fahrenheit+ "C: " + celsius);
	
	}
		
}
