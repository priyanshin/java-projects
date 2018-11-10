// BigNumber.java

import java.util.Scanner; // importing Scanner class to get user input

public class BigNumber
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner( System.in );
    
    int number; // number given by user
    
    System.out.println("Enter an integer: ");
    number = s.nextInt(); // setting user number
    
    if ( number > 100 ) // bigger than 100
    {
      System.out.println( "You have a big number!" );
    }
    else // NOT bigger than 100
    {
      System.out.println( "You have a small number" );
    }
  }
}