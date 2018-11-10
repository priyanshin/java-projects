
import java.util.Scanner;

public class Foothill
{
   // food #1 constants
   static final String FOOD_1_NAME = "pepperjack cheese";
   static final int FOOD_1_CALORIES_P100G = 372;  // in calories
   static final double FOOD_1_FIBER_P100G = 0;   // in grams
   static final double FOOD_1_FAT_P100G = 30.01;   // in grams
   static final double FOOD_1_SODIUM_P100G = 0.545;   // in grams
   static final double FOOD_1_PROTEIN_P100G = 24.24;   // in grams
   
   // food #2 constants
   static final String FOOD_2_NAME = "avocado";
   static final int FOOD_2_CALORIES_P100G = 160;  // in calories
   static final double FOOD_2_FIBER_P100G = 6.7;   // in grams
   static final double FOOD_2_FAT_P100G = 14.66;   // in grams
   static final double FOOD_2_SODIUM_P100G = .007;   // in grams
   static final double FOOD_2_PROTEIN_P100G = 2;   // in grams
   
   // food #3 constants
   static final String FOOD_3_NAME = "whole wheat bread";
   static final int FOOD_3_CALORIES_P100G = 259;  // in calories
   static final double FOOD_3_FIBER_P100G = 4.4;   // in grams
   static final double FOOD_3_FAT_P100G = 4.11;   // in grams
   static final double FOOD_3_SODIUM_P100G = 530;   // in grams
   static final double FOOD_3_PROTEIN_P100G = 9.13;   // in grams
   
   // food #4 constants
   static final String FOOD_4_NAME = "tomato";
   static final int FOOD_4_CALORIES_P100G = 18;  // in calories
   static final double FOOD_4_FIBER_P100G = 1.2;   // in grams
   static final double FOOD_4_FAT_P100G = 0.2;   // in grams
   static final double FOOD_4_SODIUM_P100G = .005;   // in grams
   static final double FOOD_4_PROTEIN_P100G = 0.88;   // in grams
   
   // food #5 constants
   static final String FOOD_5_NAME = "onion";
   static final int FOOD_5_CALORIES_P100G = 42;  // in calories
   static final double FOOD_5_FIBER_P100G = 1.4;   // in grams
   static final double FOOD_5_FAT_P100G = 0.08;   // in grams
   static final double FOOD_5_SODIUM_P100G = 0.003;   // in grams
   static final double FOOD_5_PROTEIN_P100G = 0.92;   // in grams
   
   static final String INDENT = "   ";
   static final String SEPARATOR = "\n";
   
   public static void main(String[] args) {
  
      String recipeName, userInputStr, servingSize;
      int userInputInt;
      double totalFiber, totalCals, totalFat, totalSodium, totalProtein;
      Scanner inputStream = new Scanner(System.in);
      
      // initialize accumulator variables
      totalFiber  = 0.;
      totalCals =  0;
      totalFat = 0;
      totalSodium = 0;
      totalProtein = 0;
      
      // print menu
      System.out.println("---------- List of Possible Ingredients ---------");
      System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
      System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
      System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
      System.out.println(INDENT + "Food #5: " + FOOD_5_NAME + SEPARATOR);      
    
      // name of recipe
      System.out.print("What are you calling this recipe ? ");
      recipeName  = inputStream.nextLine();
      
      // # of servings
      System.out.print("How many servings would you like? ");
      servingSize  = inputStream.nextLine();
      int servings = Integer.parseInt(servingSize); // making servings an integer so I can divide with it later
      if (servings < 1 || servings > 15) {
    	  System.out.println("Error");
    	  System.exit(1); //used to exit the program (seen in all the if statements for incorrect user input)
      }
      
      
      // food #1 --------------------------------------------------------
      System.out.print("How many grams of " + FOOD_1_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500) {
    	  System.out.println("Error");
    	  System.exit(1);
      }
      
      
      // update accumulators
      totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100.);
      totalFiber  += userInputInt * (FOOD_1_FIBER_P100G / 100.);
      totalFat += userInputInt * (FOOD_1_FAT_P100G / 100.);
      totalSodium += userInputInt * (FOOD_1_SODIUM_P100G / 100.);
      totalProtein += userInputInt * (FOOD_1_PROTEIN_P100G / 100.);
    

      // food #2 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_2_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500) {
    	  System.out.println("Error");
    	  System.exit(1);
      }
      
      
      // update accumulators
      totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100.);
      totalFiber  += userInputInt * (FOOD_2_FIBER_P100G / 100.);
      totalFat += userInputInt * (FOOD_2_FAT_P100G / 100.);
      totalSodium += userInputInt * (FOOD_2_SODIUM_P100G / 100.);
      totalProtein += userInputInt * (FOOD_2_PROTEIN_P100G / 100.);
      

      // food #3 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_3_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500) {
    	  System.out.println("Error");
    	  System.exit(1);
      }
      
      
      // update accumulators
      totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100.);
      totalFiber  += userInputInt * (FOOD_3_FIBER_P100G / 100.);
      totalFat += userInputInt * (FOOD_3_FAT_P100G / 100.);
      totalSodium += userInputInt * (FOOD_3_SODIUM_P100G / 100.);
      totalProtein += userInputInt * (FOOD_3_PROTEIN_P100G / 100.);
   

      // food #4 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_4_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500) {
    	  System.out.println("Error");
    	  System.exit(1);
      }
      
      
      // update accumulators
      totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100.);
      totalFiber  += userInputInt * (FOOD_4_FIBER_P100G / 100.);
      totalFat += userInputInt * (FOOD_4_FAT_P100G / 100.);
      totalSodium += userInputInt * (FOOD_4_SODIUM_P100G / 100.);
      totalProtein += userInputInt * (FOOD_4_PROTEIN_P100G / 100.);

 
      
      // food #5 ---------------------------------------------------------
      System.out.print("How many grams of " + FOOD_5_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500) {
    	  System.out.println("Error");
    	  System.exit(1);
      }
      
      
      // update accumulators
      totalCals += userInputInt * (FOOD_5_CALORIES_P100G / 100.);
      totalFiber  += userInputInt * (FOOD_5_FIBER_P100G / 100.);
      totalFat += userInputInt * (FOOD_5_FAT_P100G / 100.);
      totalSodium += userInputInt * (FOOD_5_SODIUM_P100G / 100.);
      totalProtein += userInputInt * (FOOD_5_PROTEIN_P100G / 100.);

      inputStream.close();
      
      // report results --------------------------------------------------
      System.out.println("\nNutrition for " + recipeName + "------------"); 
      System.out.println(INDENT + "Calories per serving: " + totalCals/servings);
      System.out.println(INDENT + "Fiber per serving: " + totalFiber/servings + " grams");
      System.out.println(INDENT + "Fat per serving: " + totalFat/servings + " grams");
      System.out.println(INDENT + "Sodium per serving: " + totalSodium/servings + " grams");
      System.out.println(INDENT + "Protein per serving: " + totalProtein/servings + " grams");
   

   	}
}


/*''''''''''''''''''''''''''''''''''''''''''''''''''''
 *  ---------- Run #1 --------------------------------
 *  ''''''''''''''''''''''''''''''''''''''''''''''''''
 *  
 * ---------- List of Possible Ingredients ---------
   Food #1: pepperjack cheese
   Food #2: avocado
   Food #3: whole wheat bread
   Food #4: tomato
   Food #5: onion

What are you calling this recipe ? avocado toast
How many servings would you like? 2
How many grams of pepperjack cheese? 28
How many grams of avocado? 100
How many grams of whole wheat bread? 256
How many grams of tomato? 91
How many grams of onion? 60

Nutrition for avocado toast------------
   Calories per serving: 484.39000000000004
   Fiber per serving: 9.948 grams
   Fat per serving: 16.907200000000003 grams
   Sodium per serving: 678.482975 grams
   Protein per serving: 16.7564 grams
 
 * ''''''''''''''''''''''''''''''''''''''''''''''''''
 * ---------- Run #2 --------------------------------
 * ''''''''''''''''''''''''''''''''''''''''''''''''''
 * 
 * ---------- List of Possible Ingredients ---------
   Food #1: pepperjack cheese
   Food #2: avocado
   Food #3: whole wheat bread
   Food #4: tomato
   Food #5: onion

What are you calling this recipe ? guacamole
How many servings would you like? 20
Error


''''''''''''''''''''''''''''''''''''''''''''''''''''
----------- Run #3 ---------------------------------
''''''''''''''''''''''''''''''''''''''''''''''''''''


---------- List of Possible Ingredients ---------
   Food #1: pepperjack cheese
   Food #2: avocado
   Food #3: whole wheat bread
   Food #4: tomato
   Food #5: onion

What are you calling this recipe ? grilled cheese
How many servings would you like? 5
How many grams of pepperjack cheese? 20
How many grams of avocado? 0
How many grams of whole wheat bread? -1
Error

''''''''''''''''''''''''''''''''''''''''''''''''''
-------- Run #4 ----------------------------------
''''''''''''''''''''''''''''''''''''''''''''''''''

---------- List of Possible Ingredients ---------
   Food #1: pepperjack cheese
   Food #2: avocado
   Food #3: whole wheat bread
   Food #4: tomato
   Food #5: onion

What are you calling this recipe ? salsa
How many servings would you like? 7
How many grams of pepperjack cheese? 0
How many grams of avocado? 0
How many grams of whole wheat bread? 0
How many grams of tomato? 60
How many grams of onion? 30

Nutrition for salsa------------
   Calories per serving: 3.3428571428571425
   Fiber per serving: 0.16285714285714284 grams
   Fat per serving: 0.02057142857142857 grams
   Sodium per serving: 5.571428571428571E-4 grams
   Protein per serving: 0.11485714285714287 grams
   
'''''''''''''''''''''''''''''''''''''''''''''''''''   
--------------- Run #5 -------------------------
'''''''''''''''''''''''''''''''''''''''''''''''''''

---------- List of Possible Ingredients ---------
   Food #1: pepperjack cheese
   Food #2: avocado
   Food #3: whole wheat bread
   Food #4: tomato
   Food #5: onion

What are you calling this recipe ? bread pizza
How many servings would you like? 4
How many grams of pepperjack cheese? 56
How many grams of avocado? 0
How many grams of whole wheat bread? -1
Error

 * */

