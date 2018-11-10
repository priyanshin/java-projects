
public class sample2 {
	public static String badString(String finalValue) {
			// can't put reserved word as a variable
			// can't start function with number
		return (finalValue + finalValue);
		//needs to be in parenthesis
	}
	
	public static int bad_integer(int x) {
		//can't start function name with an underscore
		x = 100 + x;
		// can't be 100.0 because variable is int
		return (x);
		//not in quotes
	}
	
	public static void main(String[] args)   {
		int badOne;
		//not in camel case
		String badTwo;
		
		badOne = bad_integer(39);
		System.out.println(badOne);
		
		badTwo = badString("testing me twice ");
		System.out.println(badTwo);
		//badOne is an int so it can not be an String
		badTwo = badString("badOne,twice-");
		System.out.println(badTwo);
	}
}
