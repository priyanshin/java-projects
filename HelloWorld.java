import java.util.Scanner;
public class HelloWorld {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello World!");
	System.out.println("Hola Mundo!");
	System.out.println("Namaste Duniya!");
	modification ();
	internationalHello();
	}
	public static void modification() {
		
		String espanol = "Hola Mundo";
		String hindi = "Namaste Duniya";
		modification2 (espanol);
		modification2 (hindi);
	
		
	}
	public static void modification2 (String foreignLanguage) {
		
		System.out.println(foreignLanguage);
	}
	
	/*7. International Hello.  Improve your International Hello program; as follows:
	Prompt the user for the country they are from.
	Based on the country; print Hello World (in the right language)
	Also print, “You must like <food and drink from that country>”.  You can print this part in English.
	Example:
	Which country are you from? England
	Hello World!
	You must like biscuits and tea!

	Another example:
	Which country are you from? Spain
	Hola mundo!
	You must like paella and sangria!

	Implement this for 2 countries; with 2 different languages.*/
	public static void internationalHello (){
		Scanner userInputCountry= new Scanner (System.in);
		System.out.println("Are you from Argentina or India?");
		String countryName= userInputCountry.next();
		if (countryName.equals("Argentina")){
			System.out.println("Hola, mundo!");
			System.out.println("You must like tacos and cola!");
			}
			else {
				System.out.println("Namaste, duniya!");
				System.out.println("You must like pav bhaji and mango lassi!");
			}
			
		}
		
		
	}
	

