
public class MonopolyGoSquare extends MonopolySquare
{
  //Does the player get double, if they land on Go ?
  private boolean doubleAmountIfLandOnGo;
  //Amount player gets for landing on Go

  private int goAmount=200; 
  /** Constructor.  Use super to set the name. Use 'this' where needed */
  public MonopolyGoSquare(int goAmountParam, boolean doubleAmountParam) {
	  super("Go");
	  goAmount=goAmountParam;
	  doubleAmountIfLandOnGo=doubleAmountParam;
	  
	  
}
  
  /** get amount for passing Go */
  public int getGoAmount(){
	  return goAmount;
  }
  
  /** whether or not double bonus for landing on Go*/
  public boolean getDoubleAmount(){
	  return doubleAmountIfLandOnGo;
  }
  
  /**  toString() */
  public String toString(){
	  //String x = super.toString();
	  
	  
	return "Go! (pass Go, $200, no double Bonus for landing on Go)";
	  
  }
}