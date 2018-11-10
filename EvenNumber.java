
public class EvenNumber {
	/*
	 * Write a method to create an array of even integers. Return this array
	 * from the method.
	 * 
	 * Your method signature should be: int[] createEven(int numIntegers) {}
	 * 
	 * Your code should create a new array of size numIntegers. It should then
	 * fill the array with even numbers. For example:
	 * 
	 * myEvens = createEven(5); /* now myEvens = {0, 2, 4, 6, 8 };
	 * 
	 * Your main method should test this ; ie. call the method. Main has code to
	 * walk the array an print the values.
	 * 
	 * Your main method should test this ; ie. call the method. Main has code to
	 * walk the array an print the values.
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		createEven(9);
		printMe(createEven(9));
	}

	public static void printMe(int[] values) {
		int i;
		for (i = 0; i < values.length; i++) {
			System.out.println(values [i]);

		}

	}

	public static int[] createEven(int numIntegers) {
		int i;
		int[] myEvens = new int[numIntegers];
		for (i = 0; i < numIntegers; i++) {
			myEvens[i] = i * 2;
			//System.out.println(i);
		}
		return myEvens;

	}
}
