import java.util.Scanner;

public class DragonLair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Dragon’s Lair - #1. Implement a program which offers an intrepid
		 * adventurer a choice. The adventurer is deep within a mountain cave,
		 * hunting for a trove of gold coins. Describe the scene to the
		 * adventurer. Explain that the adventurer has the choice of entering a
		 * cavern on the left; or a cavern on the right. Prompt the user for
		 * their choice (as a string).
		 * 
		 * With a 50% probability, the adventurer enters the room with the
		 * Dragon, and is eaten. Also with 50% probability, the adventurer
		 * enters the room with the gold chest, and lives happily ever after.
		 * Implement methods that calculate which event has occurred; and
		 * describes the result to the adventurer.
		 */

		Scanner userInput = new Scanner(System.in);
		System.out.println("Do you want to go left or right?");
		String leftOrRight = userInput.next();
		if (Math.random() < 0.5) {
			System.out.println("You have been eaten by a dragon; click run to play again.");
		} else {
			System.out.println(
					"You have recieved a HUGE pot of gold and you live happily ever after;"
					+ " click run to play again.");
		}

	}

}
