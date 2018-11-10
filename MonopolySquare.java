


public class MonopolySquare {
	private String name;
	private boolean isProperty;
	private int price;
	private int rent;
	private boolean isOwned;
	private int numberOfHotels;
	private int numberOfHouses;

	public MonopolySquare(String nameParam) {
		name = nameParam;
		isProperty = false;
	}

	public MonopolySquare(String propertyParam, int priceParam, int rentParam) {
		isProperty = true;
		name = propertyParam;
		price = priceParam;
		rent = rentParam;
	}

	public int getRent() {
		return rent;
	}

	public int getPrice() {
		return price;
	}
	
	public boolean isOwned(){
		return isOwned;
	}

	public String toString() {
		if (isProperty) {
			return name +  "(Value: "+ price +",Rent: "+ rent+")";
		} else if (!isProperty) {
			return  name;
		}
		return "Error";
	}
}
