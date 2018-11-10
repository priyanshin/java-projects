
	import java.util.*;

	public class MonopolyPlayer {
		private Integer money; // How much money i currently have
		private Integer position; // My current position
		String token; // Name of my token
		String name; // Name of player
		private MonopolyBoard board;

		// All properties i own
		ArrayList<MonopolyPropertySquare> properties;

		MonopolyPlayer(String name, String token, Integer startingMoney, MonopolyBoard board) {
			this.name = name;
			this.token = token;
			money = startingMoney;
			this.board = board;
			properties = new ArrayList<MonopolyPropertySquare>();
			position=0;
		}

		// Get a random number from 1-6; update my position
		public Integer rollDice() {
			// DiceRoll();
			Integer r = (int) (Math.random() * 6) + 1;
			return r;
		}

		// Reduce my money by cost of property
		void buyProperty(MonopolyPropertySquare sq) {
			money -= sq.getPropertyValue();
			properties.add(sq);
		}

		// Reduce my money by rent of property
		void rentProperty(MonopolyPropertySquare sq) {
			money -= sq.getRentValue();
		}

		// Pay tax owned to square
		void payTax(MonopolyTaxSquare sq) {
			money-=sq.getTaxAmount();
		}

		// Update for passing Go. You can assume Go is at position 0 in the Board.
		void getGoMoney(Integer oldPosition, Integer newPosition) {
			money += 200;
			position = newPosition;
		}

		// roll dice. Update position. Based on new square
		void takeTurn() {
			
			
		}

		// if on a property, buy if unowned. rent if owned.
		// pay tax, if landed on a tax square
		// increase funds if landed on or passed Go
		void landOnSquare(MonopolySquare sq) {
			Integer r = rollDice();
			if (r + position > 19) {
				r -= 19 - position;
				getGoMoney(position, r - 1);
			} else {
				position += r;
			}
		}

		// Increase or decrease funds as required.
		void updateMoney(Integer dollars) {
			money+= dollars;
		}

		// Print name, token, current square, properties and amount of money
		public String toString() {
			return "Player Name: "+name+" Token: "+token+" Position: "+position+" Money Left: "+money+" Properties Owned: "+properties; 
				

		}
	}

