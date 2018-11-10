
public class Arithmetic {
	
	public static void main(String[] args) {
	int myId = 20367874; // This is my foothill ID number.
	int numLet = 9; // This is the number of letters in my first name, Priyanshi.
	
	System.out.println("My first name is Priyanshi.");
	System.out.println("My student ID is " + myId);
	System.out.println("The number of characters in my first name is " + numLet);
	
	double ex1, ex2, ex3, ex4, ex5;
	
	ex1= myId % 17; // expression 1
	ex2 = (numLet + 17) % 11; // expression 2
	ex3 = (myId/(numLet+800.0)); // expression 3
	ex4 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + numLet; // expression 4
	
	System.out.println( "Expression #1 --> " + ex1 +  "\nExpression #2 --> " + ex2 +  "\nExpression #3 --> " 
			+ ex3 +  "\nExpression #4 --> " + ex4 +  "\nExpression #5 --> " + ex5);
	
/* ----------------- Run ---------------------------------
 
My first name is Priyanshi.
My student ID is 20367874
The number of characters in my first name is 9
Expression #1 --> 4.0
Expression #2 --> 4.0
Expression #3 --> 25176.605686032137
Expression #4 --> 45.0
Expression #5 --> 7.364562745289036E-4

 ---------------------------------------------------------*/  
	
}
}