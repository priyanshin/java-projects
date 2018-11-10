import java.util.*;
public class DrivingTest {
	public static void main(String[] args) {
		if ((canYouDrive(15.5, true))==true){			System.out.println("You are eligible to drive!");			
		}
		else{
			
			System.out.println("You are not eligible to drive!");
		}
		System.out.println();

	}

	public static boolean canYouDrive(double age, boolean driversLicense) {
		Scanner age1= new Scanner (System.in);
		System.out.println("Enter your age:");
		age= age1.nextDouble();
		Scanner license= new Scanner (System.in);
		System.out.println("Can you drive?");
		String check=license.next();
		if (check.equalsIgnoreCase("yes")){
			driversLicense= true;
			
		}
		else if(check.equalsIgnoreCase("no"));
		{ driversLicense= false;}
		
		else {driversLicense= false;}
		
	
		
		if (age <= 15) {
			return false;
		} else if (age >= 15.5 && age < 90 && driversLicense==true) {
			return true;

		} else {
			return false;
		}

	}

}