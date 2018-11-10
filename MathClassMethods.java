
public class MathClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("The sum of the addends 4 and 6 is " + addition(4,6));
			System.out.println("The difference between the minuend, 45, and the subtrahend, 9, is "+ subtraction(45,9));
			System.out.println ("The product of the multiplicand, 7, multiplied by the multiplier, 8, is " + multiplication (7, 8));
			System.out.println("The quotient that results from dividing the dividend, 81, by the divisor, 3, is "+ division(81,3));
			System.out.println("The modulus of the integers 17 and 9 is " + modulus (17,9));
	}
	public static int addition(int addend1, int addend2){
		int ans = addend1+addend2;
		return (ans);
		
		
	}
	public static int subtraction(int minuend, int subtrahend){
		int ans = minuend - subtrahend;
		return (ans);
	}
	public static int multiplication(int multiplicand, int multiplier){
		int ans = multiplicand * multiplier;
		return (ans);
		
	}
	public static int division(int dividend,int divisor){
		int ans = dividend/divisor;
		return (ans);
		
	}
	public static int modulus(int operand1, int operand2){
		int ans = operand1 % operand2;
		return (ans);
	}
	
}

