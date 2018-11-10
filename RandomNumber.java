
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a method which gives a random number, within a range. The
		 * method accepts an integer parameter, max. The random number should be
		 * between 0 and max. Hint: use a method from the Math class in your
		 * calculation.
		 */
		System.out.println("Here is a random number in your range: "+getRandom(88));
	}
	public static int getRandom(int max){
		max=max+1;
		int number=(int)(Math.random()*max);
		return number;
	}
}
