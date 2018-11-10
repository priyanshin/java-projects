
import java.util.Scanner;
public class Rabbits {
	/*
	 * (2 methods) Write a method which gets a String from the user, and returns
	 * it. Your method signature is : public static String getString()
	 * 
	 * Write another method which checks if the word "rabbit" is in the passed
	 * String parameter. If the "rabbit" is present, it prints
	 * "It seems you would like to talk about rabbits". If "rabbit" is not
	 * present, it prints "Why don't we talk about rabbits, instead?" Your
	 * method signature is: public static void checkForRabbits(String param) {
	 * ... }
	 * 
	 * In your main method; call getString() to get the user input. Call
	 * checkForRabbits() with the String from getString().
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkForRabbits(getString());
	}
	public static String getString(){
		Scanner userInput= new Scanner(System.in);
		System.out.println("What do you want to talk about?");
		String x=userInput.nextLine();
		userInput.close();
		return x;
		
	}
	public static void checkForRabbits(String param) {
		if (param.toLowerCase().contains("rabbit")){
			
			System.out.println("It seems like you would like to talk about rabbits.");}
		else {
			System.out.println("Why don't we talk about rabbits instead?");
		}
		
		
		
		
	}
}
