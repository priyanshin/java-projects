
public class FullName {
	/*From the keyboard enter your first and then your last name, each with its own prompt.
	Store each in a separate String and then concatenate them together to show your full
	name. Call both the project and the class FullName. When your program is finished
	running, the output should appear similar to that below:
	What is your first name? Cosmo
	What is your last name? Kramer
	Your full name is Cosmo Kramer.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//From the keyboard enter your first and then your last name, each with its own prompt.
		String firstName="Priyanshi", lastName= "Nigam";
		
		System.out.println("What is your first name? "+ firstName);
		System.out.println("What is your last name? "+ lastName );
		System.out.println("My full name is " + myFullName("Priyanshi", "Nigam" +"."));
		
	}
	public static String myFullName(String firstName, String lastName){
		String myName= firstName+ " " +lastName; 		
		return myName;	

}
}