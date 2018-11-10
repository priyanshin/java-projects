
import java.util.Scanner;

public class PartyRank {
	public static void main(String[] args) {
		/*
		 * Party Rank. Implement a method which ranks the success of a party. A
		 * party was successful if it was held on a weekend (Friday, Saturday,
		 * or Sunday), and the attendance was at least 20 people. A party is
		 * also successful if it was held during the week; and the attendance
		 * was at least 15 people. Your measureSuccess method should prompt the
		 * user for the day of the week (as a String) and the number of people
		 * who attended. It should then print an indication: “You had a great
		 * party!” , or, “Hmm… that was a lame party!”
		 */
		measureSuccess();
	}

	public static void measureSuccess() {
		Scanner userInputDay = new Scanner(System.in);
		Scanner userInputPeople = new Scanner(System.in);
		System.out.println("What day was the party held on?");
		String day = userInputDay.next();
		System.out.println("How many people attended the party?");
		int people = userInputPeople.nextInt();
		if ((day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("Saturday") 
				|| day.equalsIgnoreCase("Sunday"))
				&& people >= 20

		)

		{
			System.out.println("You had a great party!");

		} else if ((day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday")
				|| day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")) && people >= 15

		) {
			System.out.println("You had a great party!");
		}
		else {
			
			System.out.println("Hmmm... that was a lame party!");
		}
		 
	}
}
