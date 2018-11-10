
public class DivisibleBy3 {
	/*
	 * Write a method which indicates if an integer value is divisible by 3. The
	 * method returns true if it is.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divisibleBy3(995));
	}
	public static boolean divisibleBy3(int val) { 
		if (val%3==0){
			return true;
		}
		else {
			return false;
		}
		
	}
}
