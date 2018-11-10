/*Initial File Comment:
 * Name: Priyanshi Nigam
 * Instructor: Dave Harden
 * Date: 7/21/18 
 * Assignment Description: This is a program working with strings to count, replace or hide substrings. It also uses user input and counts string length and requests for a certain length.
 * */





import java.util.Scanner;

public class Foothill {
	public static void main(String[] args) {
		System.out.println("Single character: "+getKeyCharacter());
		System.out.println("String with 4 or more characters: "+getString());
		System.out.println(maskCharacter("java", 'f'));
		System.out.println(removeCharacter("java", 'f'));
		System.out.println("The character is in the string "+countKey("java", 'f')+ " times");
	}
	/*
	 * Method: getKeyCharacter
	 * 
	 * This method takes in user input until the user types in one character and then returns the single character.*/
	static char getKeyCharacter(){
		Scanner inputStream = new Scanner(System.in);
	    System.out.print("Please enter a single character: \n");
	    String character = inputStream.nextLine();
		
	    while (character.length() != 1) {
	    	Scanner inputStream1 = new Scanner(System.in);
		    System.out.print("Please enter a single character: \n");
		    character = inputStream1.nextLine();
	    }
		
		return character.charAt(0);
		}
	
	/*
	 * Method: getString
	 * 
	 * This method takes in user input until the user types in a string with at least 4 characters and returns that string.*/
	static String getString() {
		Scanner inputStream = new Scanner(System.in);
	    System.out.print("Please enter a string with a minimum of 4 characters: \n");
	    String str = inputStream.nextLine();
		
		
		final int min = 4;
		
		while (str.length()< min) {
			Scanner inputStream1 = new Scanner(System.in);
		    System.out.print("Please enter a string with a minimum of 4 characters: \n");
		    str = inputStream1.nextLine();
		}
		return str;
		
	}
	/*
	 * Method: maskCharacter
	 * 
	 * 
	 * This method has 2 parameters - a string and a character - and it replaces every occurence of the character with a dollar sign and then returns the new string.*/
	static String maskCharacter(String theString, char keyCharacter) {
		String newStr= "";
		for(int i =0; i< theString.length(); i++) {
			if (theString.charAt(i) != keyCharacter)
				newStr += theString.substring(i, i+1);
			else
				newStr += "$";
		}
		

		return "The character " + keyCharacter + " in the string "+ theString + " replaced by '$' is: " + newStr;
		
	}
	
	/*
	 * Method: removeCharacter
	 * 
	 * This method has 2 parameters - a string and a character - and it removes every occurrence of the character and then returns the new string.*/
	static String removeCharacter(String theString, char keyCharacter) {
		
		String newStr= "";
		for(int i = 0; i<theString.length(); i++)
			if (theString.charAt(i) != keyCharacter)
				newStr += theString.substring(i, i+1);
		

		return "The character " + keyCharacter + " in the string "+ theString + " removed is: " + newStr;
		
	}
	
	/*
	 * Method: countKey
	 * 
	 * This method has 2 parameters - a string and a character - and it counts how many times that character is present in the string and then returns the number.*/

	
	static int countKey(String theString, char keyCharacter) {
		return(theString.split(Character.toString(keyCharacter), -1).length-1);
		
	}
}	

/*Run 1: 
 * 
 * Please enter a single character: 
s
Single character: s
Please enter a string with a minimum of 4 characters: 
ss
Please enter a string with a minimum of 4 characters: 
sdf
Please enter a string with a minimum of 4 characters: 
sdfsd
String with 4 or more characters: sdfsd
The character o in the string hello replaced by '$' is: hell$
The character o in the string hello removed is: hell
The character is in the string 1 times

 * 
 * Run 2:
 * 
 * Please enter a single character: 
fsdf
Please enter a single character: 
4
Single character: 4
Please enter a string with a minimum of 4 characters: 
dsfksjdhfkjs
String with 4 or more characters: dsfksjdhfkjs
The character p in the string happy replaced by '$' is: ha$$y
The character p in the string happy removed is: hay
The character is in the string 2 times

Run 3:

Please enter a single character: 
sdsdfsdfsdfjsdh
Please enter a single character: 
uuuuu
Please enter a single character: 
p
Single character: p
Please enter a string with a minimum of 4 characters: 
1
Please enter a string with a minimum of 4 characters: 
12
Please enter a string with a minimum of 4 characters: 
123
Please enter a string with a minimum of 4 characters: 
1234
String with 4 or more characters: 1234
The character n in the string name replaced by '$' is: $ame
The character n in the string name removed is: ame
The character is in the string 1 times


 * Run 4:
 * 
 * Please enter a single character: 
sfdsfsd
Please enter a single character: 
sdfdswe352
Please enter a single character: 
32d
Please enter a single character: 
3
Single character: 3
Please enter a string with a minimum of 4 characters: 
sdfsd2131243d=]][;'
String with 4 or more characters: sdfsd2131243d=]][;'
The character a in the string java replaced by '$' is: j$v$
The character a in the string java removed is: jv
The character is in the string 2 times

Run 5:
Please enter a single character: 
ljsdfj
Please enter a single character: 
12fdsfs
Please enter a single character: 
-
Single character: -
Please enter a string with a minimum of 4 characters: 
kjdfshkajhkdj1243
String with 4 or more characters: kjdfshkajhkdj1243
The character f in the string java replaced by '$' is: java
The character f in the string java removed is: java
The character is in the string 0 times



 * */
