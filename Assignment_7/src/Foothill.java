import java.util.*;
import java.lang.Math;
/*
 * Initial Comment:
 * Name: Priyanshi Nigam
 * Instructor: Dave Harden
 * Date: 7/25/18
 * 
 * Code Description:
 * 
 * This is a slot machine simulation in which the user(player) 
 * is able to select a bet amount and based on the percentages
 * that each slot value occurs we have to predict whether they 
 * win or lose.*/
public class Foothill{
	


	public static void main(String[] args) {
		
		while (true) {
			bet = getBet();
			if (bet == 0) {
				System.out.println("Thanks for coming to Casino Nuevo.");
				System.exit(1);
			}
			TripleString obj2 = pull();
			getPayMultiplier(obj2);
			display(obj2, bet);
		}
	}
	static int bet = -1;
	static int betMultiplier = 1;
	public static int getBet() {
		Scanner inputStream = new Scanner(System.in);
		System.out.print("How much would you like to bet (1 - 50) or 0 to quit? ");
		bet = Integer.parseInt(inputStream.nextLine());
		if (bet == 0) {
			System.out.println("Thanks for coming to Casino Nuevo.");
			System.exit(1);
		}
		
		while (bet <= 0 || bet >50) {
			bet=0;
			Scanner inputStream1 = new Scanner(System.in);
			System.out.print("How much would you like to bet (1 - 50) or 0 to quit? ");
			bet = Integer.parseInt(inputStream1.nextLine());
			if (bet == 0) {
				System.out.println("Thanks for coming to Casino Nuevo.");
				System.exit(1);
			}
		}
		
		if (bet == 0) {
			System.out.println("Thanks for coming to Casino Nuevo.");
			System.exit(1);
			
		}

		return bet;
		
	}
	
	public static TripleString pull() {
		TripleString object1 = new TripleString(randString(), randString(), randString());
		return object1;
		   
	   }
	public static void display (TripleString thePull, int winnings) {
			if (winnings != 0) {
				System.out.println("Whirrrr......and your pull is... \n" +  thePull.toString() + "\n congratulations you win: " + winnings);
				}
			else {
				System.out.println("Whirrrr......and your pull is... \n" +  thePull.toString() + "\n sorry, you lose.");
			}
	   }
	   
	private static String randString() {
		String str = "";
		int randNum= (int)(Math.random()*100);
		if (randNum >= 1 && randNum <= 7 ) {
			str = " (space) ";
		}
		else if (randNum >= 8 && randNum <=22) {
			str = " 7 ";
		}
		else if (randNum >= 23 && randNum <=60) {
			str = " BAR ";
		}
		else if (randNum >= 61 && randNum <=100) {
			str = " cherries ";
		}
		return str;
		
		
		
	}
   
	static int getPayMultiplier (TripleString thePull) {
		
		if (thePull.str1.equals(" cherries ") && thePull.str2.equals(" cherries ") && thePull.str3.equals(" cherries ")) {
			betMultiplier = 30;
		}
		else if (thePull.str1.equals(" cherries ") && thePull.str2.equals(" cherries ") && !thePull.str3.equals(" cherries ")) {
			betMultiplier = 15;
		}
		else if (thePull.str1.equals(" cherries ") && !thePull.str2.equals(" cherries ") ) {
			betMultiplier = 5;
		}
		else if (thePull.str1.equals(" BAR ") && thePull.str2.equals(" BAR ") && thePull.str3.equals(" BAR ")) {
			betMultiplier = 50;
		}
		else if (thePull.str1.equals(" 7 ") && thePull.str2.equals(" 7 ") && thePull.str3.equals(" 7 ")) {
			betMultiplier = 100;
		}
		else {
			bet =0;
		}
		bet = bet * betMultiplier;
		return bet;
		
	}
	
	
}

class TripleString { 
	public static final int MIN_LEN = 1;
	public static final int MAX_LEN = 50;
	public static final String DEFAULT_STRING = "(undefined)";
	
	public String str1;
	public String str2;
	public String str3;
	TripleString(String str1, String str2, String str3) {
		
		this.str1= str1;
		this.str2 = str2;
		this.str3 = str3;
	}
		
		private void setString2(String string) {
			str2 = string;
			
		}
		private void setString3(String string) {
			str3 = string;
			
		}
		private void setString1(String string) {
			str1 = string;			
		}
	
		
		public String toString(){
			return str1 + str2 + str3;
			
		}
		
		public String getString1(){
			return str1;

		}
		public String getString2(){
			return str2;
			
		}
		public String getString3(){
			return str3;

		}
		boolean validString( String str ) {
			if (str.length() >= MIN_LEN && str.length ()<= MAX_LEN) {
				return true;
			}
			return false;
			
		}
	





	public TripleString() {
		str1= DEFAULT_STRING;
		str2= DEFAULT_STRING;
		str3= DEFAULT_STRING;
				
	}





}


/*
 * Sample Run:
 * 
 * How much would you like to bet (1 - 50) or 0 to quit? 12
Whirrrr......and your pull is... 
 BAR  BAR  BAR 
 congratulations you win: 600
How much would you like to bet (1 - 50) or 0 to quit? 40
Whirrrr......and your pull is... 
 cherries  BAR  BAR 
 congratulations you win: 200
How much would you like to bet (1 - 50) or 0 to quit? 5
Whirrrr......and your pull is... 
 cherries  7  7 
 congratulations you win: 25
How much would you like to bet (1 - 50) or 0 to quit? 670
How much would you like to bet (1 - 50) or 0 to quit? 51
How much would you like to bet (1 - 50) or 0 to quit? 50
Whirrrr......and your pull is... 
 BAR  cherries  (space) 
 sorry, you lose.
How much would you like to bet (1 - 50) or 0 to quit? 1
Whirrrr......and your pull is... 
 BAR  BAR  7 
 sorry, you lose.
How much would you like to bet (1 - 50) or 0 to quit? 2
Whirrrr......and your pull is... 
 cherries  BAR  (space) 
 congratulations you win: 10
How much would you like to bet (1 - 50) or 0 to quit? 3
Whirrrr......and your pull is... 
 BAR  BAR  BAR 
 congratulations you win: 150
How much would you like to bet (1 - 50) or 0 to quit? 89098
How much would you like to bet (1 - 50) or 0 to quit? 2345
How much would you like to bet (1 - 50) or 0 to quit? 78
How much would you like to bet (1 - 50) or 0 to quit? 49
Whirrrr......and your pull is... 
 cherries  BAR  cherries 
 congratulations you win: 245
How much would you like to bet (1 - 50) or 0 to quit? -1
How much would you like to bet (1 - 50) or 0 to quit? 8
Whirrrr......and your pull is... 
 cherries  BAR  7 
 congratulations you win: 40
How much would you like to bet (1 - 50) or 0 to quit? 10
Whirrrr......and your pull is... 
 cherries  (space)  BAR 
 congratulations you win: 50
How much would you like to bet (1 - 50) or 0 to quit? 0
Thanks for coming to Casino Nuevo.
*/
	
	