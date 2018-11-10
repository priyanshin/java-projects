import java.util.Scanner;
public class GuessMyNumber {
	
	/*
	 * Implement "Guess my number". First generate a random number between 1 and
	 * 100. Next, prompt the user to enter a number. If the entered number is
	 * less than the random number, print a message ("too low"). If it is
	 * greater, print a message "too high!". If it is equal, print
	 * "congratulations! You guessed my number in X guesses" (where X is how
	 * many times user guessed) Loop until the player gets the right answer. If
	 * the answer is correct, exit the loop.
	 * 
	 * Your method signature is : public static void guessMyNumber()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner (System.in);
		System.out.println("Try to guess my number! It is between 1 and 100.");
		int num = number.nextInt();
		guessMyNumber(num);
		number.close();
	}
	public static void guessMyNumber(int number){
		Scanner number2 = new Scanner (System.in);
		int value = number; 
		int count=1; 
		int a =(int) (Math.random()*100 + 1);

//		boolean numValue;
		//System.out.println(a);
		do{ 
		/*if (number == a){
			numValue= true;
			System.out.println("Congratulations! You got my number right in 1 guess!");
			break;
			
		}*/
			count++;
	    if(value > a){
			System.out.println("too high, try again!");
			value = number2.nextInt();
		}
		else if (value <a){
			System.out.println("too low, try again!");
			value = number2.nextInt();
			}
		
		}while(a!=value);
		
		System.out.println("Congratulations! You got my number right in " + count +" guesses!");
	    
		number2.close();

	}
}

