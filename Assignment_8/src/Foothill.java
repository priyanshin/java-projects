/*
 * Initial File Comment
 * 
 * Name: Priyanshi Nigam
 * Instructor: Dave Harden
 * Date: 7/31/18
 * 
 *Code: This code is a low level dating app that takes 4 parameters to determine how good of a fit two people are. It determines the fit between 0 and 1.
 *If two peoples gender preferences don't match then they are automatically given a fitValue of 0, the other two parameters are finance and romance. This 
 *code also takes into account when there is an invalid input or no name and changes it to the default.
 * */

import java.lang.Math;
public class Foothill {
		static double fitVal;
		static DateProfile app1 = new DateProfile('m', 'f', 5, 9, "Henry"), 
				app2 = new DateProfile('f', 'm', 2, 10, "Jane"),
				app3 = new DateProfile('f', 'm', 5, 1, "Sutton"),
				app4 = new DateProfile('m', 'f', 5, 1, "Richard"),
				app5 = new DateProfile('l', 'f', 5, 13, "Kat"),
				app6 = new DateProfile('f', 'q', 12, 1, ""),
				app7 = new DateProfile('m', 'm', 0, 7, "Ian");
		
		public static void main(String[] args) 
		{
			// i tried doing this with a loop but i wasn't able to without turning it into a string
			displayTwoProfiles(app1, app2);
			displayTwoProfiles(app1, app3);
			displayTwoProfiles(app1, app4);
			displayTwoProfiles(app1, app5);
			displayTwoProfiles(app1, app6);
			displayTwoProfiles(app1, app7);
			
			System.out.println("\n");
			
			displayTwoProfiles(app2, app1);
			displayTwoProfiles(app2, app3);
			displayTwoProfiles(app2, app4);
			displayTwoProfiles(app2, app5);
			displayTwoProfiles(app2, app6);
			displayTwoProfiles(app2, app7);
			
			System.out.println("\n");
			
			displayTwoProfiles(app3, app1);
			displayTwoProfiles(app3, app2);
			displayTwoProfiles(app3, app4);
			displayTwoProfiles(app3, app5);
			displayTwoProfiles(app3, app6);
			displayTwoProfiles(app3, app7);
			
			System.out.println("\n");
			
			displayTwoProfiles(app4, app1);
			displayTwoProfiles(app4, app2);
			displayTwoProfiles(app4, app3);
			displayTwoProfiles(app4, app5);
			displayTwoProfiles(app4, app6);
			displayTwoProfiles(app4, app7);
			
			System.out.println("\n");
			
			displayTwoProfiles(app5, app1);
			displayTwoProfiles(app5, app2);
			displayTwoProfiles(app5, app3);
			displayTwoProfiles(app5, app4);
			displayTwoProfiles(app5, app6);
			displayTwoProfiles(app5, app7);
			
			System.out.println("\n");
			
			displayTwoProfiles(app6, app1);
			displayTwoProfiles(app6, app2);
			displayTwoProfiles(app6, app3);
			displayTwoProfiles(app6, app4);
			displayTwoProfiles(app6, app5);
			displayTwoProfiles(app6, app7);
	
			displayTwoProfiles(app7, app1);
			displayTwoProfiles(app7, app2);
			displayTwoProfiles(app7, app3);
			displayTwoProfiles(app7, app4);
			displayTwoProfiles(app7, app5);
			displayTwoProfiles(app7, app6);
			
		}
		
		
		
		 static void displayTwoProfiles( DateProfile profile1, DateProfile profile2 )  {
			System.out.println("Fit between " + profile1.getName() + " and "+ profile2.getName() + ":");
			fitVal = profile1.fitValue(profile2);
			System.out.println(fitVal);
			
			
		}
		 
		 
		 DateProfile person2 = new DateProfile('M','F', 1, 5, "PN");
}	



class DateProfile{
	
	
	public static final int MIN_ROMANCE = 1;
	public static final int MAX_ROMANCE = 10;
	public static final int MIN_FINANCE = 1;
	public static final int MAX_FINANCE = 10;
	public static final int MIN_NAME_LEN = 1;
	public static final int MAX_NAME_LEN = 20;
	
	public static final char DEFAULT_GEND = 'F';
	public static final char DEFAULT_SEARCH_GEND = 'M';
	public static final String DEFAULT_NAME= "John Doe";

	
	private char gender;
	private char searchGender;
	private int romance;
	private int finance;
	private String name;
	
	public DateProfile(char c, char d, int i, int j, String string) {
		gender = c;
		searchGender = d;
		romance = i;
		finance = j;
		name = string;
		
		if (c != 'm' && c != 'M' && c != 'f' && c != 'F') {
			System.out.println(c + " is not a valid gender. \n");
			gender = DEFAULT_GEND;
		}
		if (d != 'm' && d != 'M' && d != 'f' && d != 'F') {
			System.out.println(c + " is not a valid gender. \n");
			searchGender = DEFAULT_GEND;
		}
		if (i < MIN_ROMANCE || i > MAX_ROMANCE) {
			romance = MIN_ROMANCE;
		}
		if (j < MIN_FINANCE || j > MAX_FINANCE) {
			finance = MIN_FINANCE;
		}
		if (string.length() < MIN_NAME_LEN || string.length() > MAX_NAME_LEN || string == "") {
			name = DEFAULT_NAME;
		}
		
		
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getSearchGender() {
		return searchGender;
	}

	public void setSearchGender(char searchGender) {
		this.searchGender = searchGender;
	}

	public int getRomance() {
		return romance;
	}

	public void setRomance(int romance) {
		this.romance = romance;
	}

	public int getFinance() {
		return finance;
	}

	public void setFinance(int finance) {
		this.finance = finance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAll(char gender, char searchGender, int romance, int finance, String name) {
		gender = DEFAULT_GEND;
		searchGender = DEFAULT_SEARCH_GEND;
		romance = MIN_ROMANCE;
		finance = MIN_FINANCE;
		name = DEFAULT_NAME;
	}
	
	double determineGenderFit(DateProfile partner) {
		if(partner.gender == this.searchGender) {
			return 10;}
		else {
			return 0;
		}
		
		
	}
	
	double determineRomanceFit(DateProfile partner)  {
		
		double x = Math.abs(partner.romance - this.romance);
		
		return 10-x;
		
	}
	
	double determineFinanceFit(DateProfile partner) {
		double x = Math.abs(partner.finance - this.finance);
		
		return 10-x;
		
	}

	
	public double fitValue(DateProfile partner) {
		if (determineGenderFit(partner)== 0) {
			return 0;
		}
		return (determineRomanceFit(partner) + determineGenderFit(partner) + determineFinanceFit(partner))/30;
		
	}
	
	
}


/*Sample Run:
 * 
 * l is not a valid gender. 

f is not a valid gender. 

Fit between Henry and Jane:
0.8666666666666667
Fit between Henry and Sutton:
0.7333333333333333
Fit between Henry and Richard:
0.0
Fit between Henry and Kat:
0.0
Fit between Henry and John Doe:
0.6
Fit between Henry and Ian:
0.0


Fit between Jane and Henry:
0.8666666666666667
Fit between Jane and Sutton:
0.0
Fit between Jane and Richard:
0.6
Fit between Jane and Kat:
0.0
Fit between Jane and John Doe:
0.0
Fit between Jane and Ian:
0.8666666666666667


Fit between Sutton and Henry:
0.7333333333333333
Fit between Sutton and Jane:
0.0
Fit between Sutton and Richard:
1.0
Fit between Sutton and Kat:
0.0
Fit between Sutton and John Doe:
0.0
Fit between Sutton and Ian:
0.6666666666666666


Fit between Richard and Henry:
0.0
Fit between Richard and Jane:
0.6
Fit between Richard and Sutton:
1.0
Fit between Richard and Kat:
0.0
Fit between Richard and John Doe:
0.8666666666666667
Fit between Richard and Ian:
0.0


Fit between Kat and Henry:
0.0
Fit between Kat and Jane:
0.6
Fit between Kat and Sutton:
1.0
Fit between Kat and Richard:
0.0
Fit between Kat and John Doe:
0.8666666666666667
Fit between Kat and Ian:
0.0


Fit between John Doe and Henry:
0.0
Fit between John Doe and Jane:
0.0
Fit between John Doe and Sutton:
0.0
Fit between John Doe and Richard:
0.0
Fit between John Doe and Kat:
0.8666666666666667
Fit between John Doe and Ian:
0.0
Fit between Ian and Henry:
0.8
Fit between Ian and Jane:
0.0
Fit between Ian and Sutton:
0.0
Fit between Ian and Richard:
0.6666666666666666
Fit between Ian and Kat:
0.0
Fit between Ian and John Doe:
0.0
*/
