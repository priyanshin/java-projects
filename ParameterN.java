
import java.util.Scanner;
public class ParameterN {
	/*Write a method which adds the numbers 1 to N, where N is a parameter.
Your method signature is:

public static int addMeUp(int N)
{
//
}

In your main method; get a value for N from the user.
Use this as a parameter to addMeUp().*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner parameterN = new Scanner (System.in);
		System.out.println("Enter an integer");
		int N= parameterN.nextInt();
		parameterN.close();
		System.out.println(addMeUp(N));
		//System.out.println(addMeUpTest(0));
		
		
	}
	public static int addMeUp(int N){
		int p;
		int x=0;
		for (p=0;p<=N;p++){
			x=x+p;
		}
		
		return x;
	}
	/*public static int addMeUpTest(int x){
		x=0;
		int i;/*
		x=x+1;
		x=x+2;
		x=x+3;
		for (i=0;i<=5;i++){
			x=x+i;
		}
		return x; */
		
	}

