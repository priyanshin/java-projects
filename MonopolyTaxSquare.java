
public class MonopolyTaxSquare extends MonopolySquare
{
   // flat tax cost
  private int taxAmount;
   //Percent of income tax could be
  private int taxPercent;
  private String name;
  
  /** Constructor. set property related values*/
  /*  use this 'this' and 'super' as required */
  public MonopolyTaxSquare(String name, int taxAmount, int taxPercent){
	  super("Income Tax");
	  this.taxAmount = taxAmount;
	  this.taxPercent=taxPercent;
	  this.name= name;
	  
  }
  
  /** get tax cost */
  public int getTaxAmount(){
	  return taxAmount;
  }
  
  /** get tax percent */
  public int getTaxPercent(){
	  return taxPercent;
  }
  
  /** calculate money * taxPercent */
  public int calculateTaxPercent(int money){
	  return (money-money*(taxPercent/100));
	  
  }
  
  /** calculate best/lowest payment for player */
  public int calculateBestTax(int money){
	 int percentMoney= money-money*(taxPercent/100);
	  if (money-200>percentMoney){
		  System.out.println("Pay $200");
		  return money-200;
	  }
	  else{
		  System.out.println("Pay 10%");
		  return percentMoney;
	  }
  }
  
  /**  toString(). Use super.toString() as needed */
  //[4] : Income Tax (pay 10% or $200)SS
  public String toString(){
	  //int x=calculateBestTax(x);
	  return super.toString()+"(pay " +taxPercent+" or " + taxAmount+")";
  }
}
