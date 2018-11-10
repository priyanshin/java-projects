
public class MonopolyTester {

	public static void main(String[] args) {
		
		MonopolyBoard b = new MonopolyBoard();
		String [] places= {"Go!", "Mediterranean Avenue", "Community Chest", "Baltic Avenue", "Income Tax", "Reading Railroad", "Oriental Avenue", "Chance",
				"Vermont Avenue", "Connecticut Avenue", "Jail", "St. Charles Place", "Electric Company", "States Avenue", "Virginia Avenue", 
				"Pensylvania Railroad", "St. James Place", "Community Chest", "Tennessee Avenue", 
				"New York Avenue"};
		int[] prices={0, 60, 0, 60, 0, 200, 100, 0, 100, 120, 0, 140, 150, 140, 160, 200, 180, 0, 180, 200}; //in thousands
		int[] rent={0, 20, 0, 40, 0, 60, 250, 80, 0, 60, 80, 0, 100, 0, 100, 120, 250, 140, 140, 160}; //in thousands
					
		for (int i = 0; i< places.length; i++)
		{
			if (prices[i]==0){
			MonopolySquare s = new MonopolySquare(places[i]);
			b.addSquare(s);
			String str1=s.toString();
			System.out.println("["+i+"] :"+str1);
			}
			else {
				MonopolySquare s = new MonopolySquare(places[i], prices[i], rent[i]); //all prices are in thousands
				b.addSquare(s);
				String str2=s.toString();
				System.out.println("["+i+"] :"+str2);
			}
			
			}
		
		
	}
}