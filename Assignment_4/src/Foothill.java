import java.util.Scanner;

public class Foothill {
	
	/*
	 * Initial File Comment:
	 * 
	 * Name: Priyanshi Nigam
	 * Date : 7/18/18 (using 48 hour extension)
	 * Instructor: Dave Harden
	 * Program Description: This java program is to help make yogurt transactions simpler. It also accounts for coupons used in the transactions.
	 */
	
	public static void main (String[] args) {
		System.out.println("Menu: ");
		System.out.println("P (process purchase)");
		System.out.println("S (shut down) \n");
		
		Scanner inputStream = new Scanner(System.in);
	    System.out.print("Your choice: \n");
	    String response = inputStream.nextLine();
	 
	    
	    response = response.toLowerCase();
	    		
	   
	    if (response.charAt(0) != 'p' && response.charAt(0) != 's') {
	    	System.out.println("*** Invalid response. Please try again ***");
	    	
	    	main(args); // goes back to beginning of program
	    }
	    
	    
	    else if (response.charAt(0) == 's'){
	    	System.exit(1); // exits program
	    }
	    
	   
	    int totalYogurts = 0; // initialize total yogurts 
	    int count = 0; 
	    
	    
	    ////////////////////////////////////// start of while loop /////////////////////////////////////////////////////
	    while(response.charAt(0) == 'p') {
	    	

	    	if (true) {
	    		Scanner inputStream0 = new Scanner(System.in);
	    		System.out.println("How many yogurts would you like to buy? \n");
	    		String yogurts = inputStream0.nextLine();
	    		int numYogurts = Integer.parseInt(yogurts);
	    		totalYogurts = totalYogurts + numYogurts;
	    		
	    		System.out.println("You just earned " +numYogurts+ " stamps and have a total of " + totalYogurts + " to use. \n" );

    
	    	}
	    	
	    	
	    	if (totalYogurts >= 7) {
	    		
	    		
		    	
	    		Scanner inputStream1 = new Scanner(System.in);
	    		System.out.println("You qualify for a free yogurt. Would you like to use your credits (Y or N)");
	    		String yogurtResponse = inputStream1.nextLine();
	    		yogurtResponse = yogurtResponse.toLowerCase();
	    	
	    		if (yogurtResponse.charAt(0) == 'y') {
	    			System.out.println("You have just used 7 credits and have "+ (totalYogurts -7) + " left.");
	    			System.out.println("Enjoy your free yogurt.");
	    			totalYogurts -= 7;
	    			
	    			
	    			}
	    			
	    		else if (yogurtResponse.charAt(0) == 'n') {
	    			Scanner inputStream0 = new Scanner(System.in);
		    		System.out.println("How many yogurts would you like to buy? ");
		    		String yogurts = inputStream0.nextLine();
		    		int numYogurts = Integer.parseInt(yogurts);
		    		totalYogurts = totalYogurts + numYogurts;
		    		
		    		System.out.println("You just earned " + numYogurts + " stamps and have a total of " + totalYogurts + " to use. \n" );
	    			
	    	
	    		}
	    		
	    		while (yogurtResponse.charAt(0)!= 'y' && yogurtResponse.charAt(0)!= 'n'){
	    			
	    			System.out.println("*** Invalid response. Please try again. ***");
	    			
	    			if (yogurtResponse.charAt(0) == 'y') {
		    			System.out.println("You have just used 7 credits and have "+ (totalYogurts -7) + " left.");
		    			System.out.println("Enjoy your free yogurt.");
		    			totalYogurts -= 7;
		    			
		    			
		    			}
		    			
		    		else if (yogurtResponse.charAt(0) == 'n') {
		    			Scanner inputStream0 = new Scanner(System.in);
			    		System.out.println("How many yogurts would you like to buy? ");
			    		String yogurts = inputStream0.nextLine();
			    		int numYogurts = Integer.parseInt(yogurts);
			    		totalYogurts = totalYogurts + numYogurts;
			    		
			    		System.out.println("You just earned " + numYogurts + " stamps and have a total of " + totalYogurts + " to use. \n" );
		    			
		    	
		    		}
	    			
	    		}
	    	}
	    	
	    	else {
	    		
	    		main(args);
	    	}
	    			
	    	
	    	if (totalYogurts < 7) {
	    		Scanner inputStream0 = new Scanner(System.in);
	    		System.out.println("How many yogurts would you like to buy? ");
	    		String yogurts = inputStream0.nextLine();
	    		int numYogurts = Integer.parseInt(yogurts);
	    		totalYogurts = totalYogurts + numYogurts;
	    		
	    		System.out.println("You just earned " +numYogurts + " stamps and have a total of " + totalYogurts + " to use. \n" );
	    
	    		
	    	}

    		
    		
    		
	    	
	    	
	    	if (count > 0) {
	    		
	    		System.out.println("Menu: ");
	    		System.out.println("P (process purchase)");
	    		System.out.println("S (shut down) \n");
	    		
	    		Scanner inputStream6 = new Scanner(System.in);
	    	    System.out.print("Your choice: \n");
	    	    response = inputStream6.nextLine();
	    	 
	    	    
	    	    
	    	    while (response.charAt(0) != 'p' && response.charAt(0) != 's') {
	    	    	System.out.println("*** Invalid response. Please try again. ***");
	    	    	System.out.println("Menu: \n");
		    		System.out.println("P (process purchase)");
		    		System.out.println("S (shut down) \n");
	    	    	
		    		
		    		Scanner inputStream7 = new Scanner(System.in);
		    	    System.out.print("Your choice: \n");
		    	    response = inputStream7.nextLine();
	    	    }
	   
 	
	    	}
	    	
	    	count++;
		   
	    }
		
	   
	
	  


	}
	
	
}


	
/*
 * Sample Run:
 * 
 * 
 * Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
How many yogurts would you like to buy? 

3
You just earned 3 stamps and have a total of 3 to use. 

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
How many yogurts would you like to buy? 

7
You just earned 7 stamps and have a total of 10 to use. 

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
You qualify for a free yogurt. Would you like to use your credits (Y or N)
y
You have just used 7 credits and have 3 left.
Enjoy your free yogurt.

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
How many yogurts would you like to buy? 
2
You just earned 2 stamps and have a total of 5 to use. 

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
d
*** Invalid response. Please try again ***
Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
How many yogurts would you like to buy? 

9

You just earned 9 stamps and have a total of 14 to use. 

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
You qualify for a free yogurt. Would you like to use your credits (Y or N)
n
How many yogurts would you like to buy? 
1
You just earned 1 stamps and have a total of 15 to use.

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
You qualify for a free yogurt. Would you like to use your credits (Y or N)
y
You have just used 7 credits and have 8 left.
Enjoy your free yogurt

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
p
You qualify for a free yogurt. Would you like to use your credits (Y or N)
d

*** Invalid response. Please try again. ***
You qualify for a free yogurt. Would you like to use your credits (Y or N)
y
You have just used 7 credits and have 1 left.
Enjoy your free yogurt

Menu: 
P (process purchase)
S (shut down) 

Your choice: 
s


*/
 