
	public class MonopolyPropertySquare extends MonopolySquare {
		private boolean isOwned;
		private boolean isProperty;
		private int propertyValue;
		private int rentValue;
		private int numberOfHotels;
		private int numberOfHouses;
		//MonopolyPropertySquare square=new MonopolyPropertySquare("Mediterranean Avenue",60,20);

		public MonopolyPropertySquare(String nameParam, int propertyPrice, int rentParam)
		  {
			super(nameParam);
			propertyValue= propertyPrice;
			rentValue= rentParam;
			isOwned=false;
			isProperty= true;
			numberOfHotels= 0;
			numberOfHouses=0;
		  }
		/** get cost of renting this */
		  public int getRentValue(){
		  return rentValue;
		  }
		  /** get cost of buying this */
		  public int getPropertyValue(){
			  return propertyValue;
		  }
		  public void buyProperty(){
				isOwned=true;
			}
		  
		  /** check if property has an owner */
		  public boolean isOwned(){
			  return isOwned;
		  }
		 

	}

