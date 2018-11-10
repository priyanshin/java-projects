import java.util.Scanner;
public class RandomStudent {
	/*
	 * Write a program to select a student at random from the class. The
	 * scenario: You are an APCS instructor. You would like to randomly call
	 * upon any student in class. You'd like to select random students until you
	 * quit.
	 * 
	 * 1) Create a method which returns the names of all the students in class
	 * today. String[] getStudentNames()
	 * 
	 * 2) Create a method which selects one student at random from the class.
	 * String getOneStudent(String[] students)
	 * 
	 * 3) Create a method which asks the user: "Select another student?" If the
	 * user responds "Y", then use the above methods to find a student and print
	 * to the console. If the user responds "N", then quit the method. void
	 * getRandomStudents()
	 * 
	 * 4) Call getRandomStudents from main.
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		getRandomStudents();

	}
	public static String[] getStudentNames(){
		String[] studentNames= {"Pranav Nigam", "Priyanshi Nigam", "Aavani Sree", "Raghav Gupta", "Aman Gupta", 
				"Ekta Halani", "Anish Kondepudi", "Hetal Halani", "Phi-Long Bui", "Krish Dandiwala", "Shivanshi Gupta",
				"Victor Tran", "Tanvi Guttula", "Nelson Koskela", "Sarvesh Chaudhari", "Jeremy Moncada", "Elijah Thomas",
				"Namit Srivastava", "Hinal Halani", "Nitesh Chaudhari", "Jessai Kikue", "John Norwood", "Sid Khabiya"};
		
		
		return studentNames;
		
		
	}
	
	public static String getOneStudent(String[] students) {
		String [] studentNames= getStudentNames();
		//int[] studentNumbers={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}; oops I was doing this wrong
		int randomNum;
		randomNum= (int) (Math.random()*24);//this will give a random number between 0 and 23
		
		
		
		return studentNames[randomNum];
		
	}
	public static void getRandomStudents(){
		System.out.println("Student: " + (getOneStudent(getStudentNames())));
		String [] studentNames= getStudentNames();
		
		// int[] studentNumbers={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
		// 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}; oops I was doing this wrong
		int randomNum;
		randomNum = (int) (Math.random() * 24);// this will give a random number
												// between 0 and 23

		Scanner anotherStudent = new Scanner(System.in);
		String ans= "Y";
		while (ans.equalsIgnoreCase("Y")) {
			
			System.out.println("Would you like to select another student? Enter Y or N.");
			ans = anotherStudent.next();
			if (ans.equalsIgnoreCase("Y")) {
				randomNum = (int) (Math.random() * 24);
				System.out.println("Student: "+(studentNames[randomNum]));
			} else {
			}
			;
			
		}
		anotherStudent.close();
	}}
