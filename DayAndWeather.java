
public class DayAndWeather {
	/*
	 * Write a method which checks if both of the following conditions are true:
	 * The day is "Saturday" The weather is "dry" Your method returns true if
	 * both of these conditions are true. It returns false otherwise.
	 * 
	 * In your test code in your main class: print " Lets have fun!" if this
	 * method returns true. Print " Lets stay home!" if its false.
	 * 
	 * Your method signature is: public static boolean checkForDryWeekend(String
	 * day, String weather) { ... }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkForDryWeekend(("saturday"), ("wet"));
	}
	public static boolean checkForDryWeekend(String day, String weather) { 
		if (day.equalsIgnoreCase("Saturday")&& weather.equalsIgnoreCase("dry")){
			System.out.println("Let's have fun!");
			return true;
		
		}
		else 
		{
			System.out.println("Let's stay home!");
			return false;
		}
	
	}
}
