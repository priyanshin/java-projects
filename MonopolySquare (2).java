
public class MonopolySquare {
	private String property;
	private boolean isProperty;
	private int price;
	private int rent;
	private boolean isOwned;
	private int numberOfHotels;
	private int numberOfHouses;

	public MonopolySquare(String propertyParam) {
		property = propertyParam;
	}

	public MonopolySquare(String propertyParam, int priceParam, int rentParam) {
		property = propertyParam;
		price = priceParam;
		rent = rentParam;
	}
	
	public int getRent(){
		return rent;
	}
	
	public int getPrice(){
		return price;
	}
	// I couldn't figure out how the computer would know if the property is owned for the public boolean isOwned(){?} method
}
