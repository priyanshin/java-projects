
public class ClassmateYear {
	/*
	 * Write a method which indicates if a value is greater than the year which
	 * your classmate (sitting next to you) was born. This method should compare
	 * the parameter value and the year which your classmate was born, and
	 * return true or false.
	 * 
	 * Your method signature is :
	 * 
	 * public static boolean isGreaterThan(int otherVal) { // }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isGreaterThan(777777));
	}
	public static boolean isGreaterThan(int otherVal) { 
		//doing this for my brother, Pranav, since I wasn't at class
		int year= 2008;
		if (otherVal>year)
		{
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
}
