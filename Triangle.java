import java.util.Scanner;
public class Triangle {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		
			//Declare variables to hold the base and height.
			double base;
			double height;
			//Variables created, move on.
			System.out.print("Enter the triangle's base: ");
			base = sc.nextDouble(); 
			//Base has been declared and filled in.
			System.out.print("Enter the triangle's height: ");
			height = sc.nextDouble();
			//Both variables are filled in.
			double preArea = base * height;
			//Now we need to divide by 2.
			double Area = preArea / 2;
			//There we go. All variables are done, are has been calculated.
			System.out.println("The area of your triangle is: " + Area);
			
	}
}
