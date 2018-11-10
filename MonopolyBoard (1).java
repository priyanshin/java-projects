public class MonopolyBoard {

	/** size of array of MonopolySquares to create */
	public static final int MAX_SQUARES = 20;

	/**
	 * index in the squares array, at which the next MonopolySquare should be
	 * created
	 */
	private int initIndex;

	/** Array of all Monopoly Squares */
	private MonopolySquare[] squares;

	/** Constructor. Allocate the squares array */
	public MonopolyBoard() {
		squares = new MonopolySquare[MAX_SQUARES];
		initIndex = 0;

	}

	/** Insert square into the array, update initIndex */
	public void addSquare(MonopolySquare sq) {

		squares[initIndex] = sq;
		initIndex++;
	}

	/* get the object at position index in the array */
	public MonopolySquare getSquare(int index) {

		MonopolySquare sq_obj = squares[index];
		return sq_obj;
	}

	/* List each square on a new line */
	public String toString() {
		String result = "";
		int i = 0;
		for (MonopolySquare sq : squares) {
			//squares.toString();
			result += "[" + i + "] : " + sq + "\n";
			i++;
		}
		return result;
	}
}