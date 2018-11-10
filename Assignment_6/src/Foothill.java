import java.util.*; 
/*Initial File Comment:
 * Name: Priyanshi Nigam
 * Instructor: Dave Harden
 * Date: 7/23/18
 * Code: This uses constructors, accessors and mutators to instantiate and modify objects of a class.
 * */
public class Foothill { 
	public static final int MIN_LEN = 1;
	public static final int MAX_LEN = 50;
	public static final String DEFAULT_STRING = "(undefined)";
	

	public static void main(String[] args) {
		TripleString tripleString1 = new TripleString("a", "b", "c");
		TripleString tripleString2 = new TripleString("d", "e", "f");
		TripleString tripleString3 = new TripleString("1", "2", "3");
		
		System.out.println(tripleString1.getString1());
		System.out.println(tripleString1.getString2());
		System.out.println(tripleString1.getString3());
		System.out.println(tripleString2.getString1());
		System.out.println(tripleString2.getString2());
		System.out.println(tripleString2.getString3());
		System.out.println(tripleString2.getString1());
		System.out.println(tripleString3.getString1());
		System.out.println(tripleString3.getString2());
		System.out.println(tripleString3.getString3());
	
		tripleString1.setString1("hello");
		tripleString1.setString2("my");
		tripleString1.setString3("name");
		tripleString2.setString1("is");
		tripleString2.setString2("priyanshi");
		tripleString2.setString3("nigam");
		tripleString2.setString1("and");
		tripleString3.setString2("im");
		tripleString3.setString3("16");
		
		System.out.println(tripleString1.getString1());
		System.out.println(tripleString1.getString2());
		System.out.println(tripleString1.getString3());
		System.out.println(tripleString2.getString1());
		System.out.println(tripleString2.getString2());
		System.out.println(tripleString2.getString3());
		System.out.println(tripleString2.getString1());
		System.out.println(tripleString3.getString1());
		System.out.println(tripleString3.getString2());
		System.out.println(tripleString3.getString3());
		
		System.out.println("Displaying all TripleStrings: ");
		System.out.println(tripleString1.toString());
		System.out.println(tripleString2.toString());
		System.out.println(tripleString3.toString());
		
		String x= tripleString3.toString();
		
		tripleString1.setString1("testing");
		tripleString1.setString2("if");
		tripleString1.setString3("the");
		tripleString2.setString1("mutator");
		tripleString2.setString2("is");
		tripleString2.setString3("working");
		tripleString2.setString1("and");
		tripleString3.setString2("it");
		tripleString3.setString3("is");
		
		System.out.println(tripleString1.getString1());
		System.out.println(tripleString1.getString2());
		System.out.println(tripleString1.getString3());
		System.out.println(tripleString2.getString1());
		System.out.println(tripleString2.getString2());
		System.out.println(tripleString2.getString3());
		System.out.println(tripleString2.getString1());
		System.out.println(tripleString3.getString1());
		System.out.println(tripleString3.getString2());
		System.out.println(tripleString3.getString3());
		

		
		System.out.println("\nDisplaying new TripleStrings after mutation: ");
		System.out.println(tripleString1.toString());
		System.out.println(tripleString2.toString());
		System.out.println(tripleString3.toString()); 
		
		String y = tripleString3.toString(); 

		if (!x.equals(y)) {
			System.out.println("The mutator worked.");
			
		}
		else {
			System.out.println("The mutator did not work.");
		}
	}
 

static class TripleString { 
	public String str1;
	public String str2;
	public String str3;
	TripleString(String str1, String str2, String str3) {
		
		this.str1= str1;
		this.str2 = str2;
		this.str3 = str3;
	}
		
		private void setString2(String string) {
			str2 = string;
			
		}
		private void setString3(String string) {
			str3 = string;
			
		}
		private void setString1(String string) {
			str1 = string;			
		}
	
		
		public String toString(){
			return " String 1: " +str1 +" String 2: " +str2+ " String 3: "+str3;
			
		}
		
		public String getString1(){
			return str1;

		}
		public String getString2(){
			return str2;
			
		}
		public String getString3(){
			return str3;

		}
		boolean validString( String str ) {
			if (str.length() >= MIN_LEN && str.length ()<= MAX_LEN) {
				return true;
			}
			return false;
			
		}
	





	public TripleString() {
		str1= DEFAULT_STRING;
		str2= DEFAULT_STRING;
		str3= DEFAULT_STRING;
				
	}





}
}


/*
 * RUN:
 * 
 * a
b
c
d
e
f
d
1
2
3
hello
my
name
and
priyanshi
nigam
and
1
im
16
Displaying all TripleStrings: 
 String 1: hello String 2: my String 3: name
 String 1: and String 2: priyanshi String 3: nigam
 String 1: 1 String 2: im String 3: 16
testing
if
the
and
is
working
and
1
it
is

Displaying new TripleStrings after mutation: 
 String 1: testing String 2: if String 3: the
 String 1: and String 2: is String 3: working
 String 1: 1 String 2: it String 3: is
The mutator worked.*/


