/*
 * Initial File Comment
 * Name: Priyanshi Nigam
 * Instructor: Dave Harden 
 * Date: 8/4/2018
 * Code Description: This code takes in a Student array and organizes it using many different operations such as sort alphabetically by first or last name.*/

import javax.swing.*;

public class Foothill {
	

	public static void main(String[] args) {


		
		Student[] myClassEven = {new Student("dodo", "bird", 230), new Student("nigam","priyanshi", 205), new Student("jackson","jack",123),new Student("jacobs","senor", 195), new Student("","lovely",148),new Student("jackson","percy", 108), new Student("sperry","steven",225),new Student("lamo","frankie", 44), new Student("sings","",452),new Student("halpert","jim",200), new Student("schrute","dwight",321),new Student("scott","michael",321),new Student("chambie","emma",425),new Student("risotto","ernesto",405),new Student("pace","tim",335),new Student("flower","kally",389),new Student("cali","brock",176),new Student("ra","ok",385)};
		// First student array with size 16( largest size)
		// display the array immediately before calling a sort method
		// display original list
		// System.out.println("Before:");
		// System.out.println("Display of original sort");
		System.out.println(StudentArrayUtilities.toString("Before: ", myClassEven));
		// sort by last name( default)
		Student.setSortKey(Student.SORT_BY_LAST);
		StudentArrayUtilities.arraySort(myClassEven);
		System.out.println("Sorting by default ---------------");
		System.out.println(StudentArrayUtilities.toString("After: ", myClassEven));
		// sort by first nameStudent.setSortKey(Student.SORT_BY_FIRST);
		Student.setSortKey(Student.SORT_BY_FIRST);
		StudentArrayUtilities.arraySort(myClassEven);
		System.out.println("Sorting by first name ---------------");
		System.out.println(StudentArrayUtilities.toString("After: ", myClassEven));
		// sort by total scoreStudent.setSortKey(Student.SORT_BY_POINTS);
		Student.setSortKey(Student.SORT_BY_POINTS);
		StudentArrayUtilities.arraySort(myClassEven);
		System.out.println("Sorting by total points ---------------");
		System.out.println(StudentArrayUtilities.toString("After: ", myClassEven));
		// setSortKey() to first name, call the getMedianDestructive() method 
		// and display the median score
		
		Student[] myClassOdd = {new Student("smith","fred", 205), new Student("bauer","jack",123),new Student("jacobs","carrie", 195), new Student("renquist","abe",148),new Student("jackson","trevor", 108), new Student("perry","steve",225),new Student("loceff","frank", 44), new Student("stollings","pamela",452),new Student("charters","rodney",200), new Student("cassar","john",321),new Student("cunningham","alan",321),new Student("menns","eric",425),new Student("sotto","ernesto",405),new Student("grace","tim",335),new Student("lai","henry",389),};
		// second student array with size 15( next largest size)
		// display the array immediately before calling a sort method
		// display original list
		System.out.println("\n\n");
//		System.out.println("Display of original sort");
		System.out.println(StudentArrayUtilities.toString("Before: ", myClassOdd));
		// sort by last name( default)StudentArrayUtilities.arraySort(myClassOdd);
		System.out.println("Sorting by default ---------------");
		System.out.println(StudentArrayUtilities.toString("After: ", myClassOdd));
		// sort by first name
		Student.setSortKey(Student.SORT_BY_FIRST);
		StudentArrayUtilities.arraySort(myClassOdd);
		System.out.println("Sorting by first name ---------------");
		System.out.println(StudentArrayUtilities.toString("After: ", myClassOdd));
		// sort by total score
		Student.setSortKey(Student.SORT_BY_POINTS);
		StudentArrayUtilities.arraySort(myClassOdd);
		System.out.println("Sorting by total points ---------------");
		System.out.println(StudentArrayUtilities.toString("After: ", myClassOdd));
		// setSortKey() to first name, call the getMedianDestructive() method 
		// and display the median score
		System.out.println("\nMedian of evenClass = " + StudentArrayUtilities.getMedianDestructive(myClassEven));
		System.out.println("Successfully preserved sort key.");
		System.out.println("Median of oddClass = " + StudentArrayUtilities.getMedianDestructive(myClassOdd));
		Student[] myClassSmall = {new Student("smith","fred", 205)};
		System.out.println("Median of smallClass = " + StudentArrayUtilities.getMedianDestructive(myClassSmall));
		Student[] myClassNo = {};
		System.out.println("Median of noClass = " + StudentArrayUtilities.getMedianDestructive(myClassNo));
	}
}

class Student {
	
	private String lastName;
	private int totalPoints;
	private String firstName;
	
	public static final int SORT_BY_FIRST = 88;
	public static final int SORT_BY_LAST = 98;
	public static final int SORT_BY_POINTS = 108;
	
	public static final String DEFAULT_NAME = "zz-error";
	public static final int DEFAULT_POINTS = 0;
	public static final int MAX_POINTS = 1000;
	
	private static int sortKey = SORT_BY_LAST;

	// constructor requires parameters - no default supplied
	public Student(String last, String first, int points) {
		if (!setLastName(last))
			lastName = DEFAULT_NAME;
		if (!setFirstName(first))
			firstName = DEFAULT_NAME;
		if (!setPoints(points))
			totalPoints = DEFAULT_POINTS;
		firstName = first;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public boolean setLastName(String last) {
		if (!validString(last))
			return false;
		lastName = last;
		return true;
	}
	public boolean setFirstName(String first) {
		if (!validString(first))
			return false;
		firstName = first;
		return true;
	}

	public boolean setPoints(int pts) {
		if (!validPoints(pts))
			return false;
		totalPoints = pts;
		return true;
	}

	// could be an instance method and, if so, would take one parameter
	public static int compareTwoStudents(Student firstStud, Student secondStud) {
		int result = 0;
		switch(sortKey) {
		case SORT_BY_FIRST: result = firstStud.firstName.compareToIgnoreCase(secondStud.firstName);
			break;
		case SORT_BY_LAST: result = firstStud.lastName.compareToIgnoreCase(secondStud.lastName);
			break;
		case SORT_BY_POINTS: if(firstStud.totalPoints > secondStud.totalPoints) {
			result = 1;
		}
		else if(firstStud.totalPoints < secondStud.totalPoints) {
			result = -1;
		}
		else {result = 0;}
		break;
		}

		// this particular version based on last name only (case insensitive)
		

		return result;
	}

	public String toString(String name, Student[] students) {
		String resultString;
		// resultString = name + "\n" + lastName + " points: " + totalPoints + "\n";
		//for (int i=0; i <= students.length; i++) {
			resultString = " " + lastName + ", " + firstName + ": " + totalPoints;
		//}
		return resultString;
	}

	private static boolean validString(String testStr) {
		if(testStr.length() == 0) {
			return false;
		}
		if (testStr != null && Character.isLetter(testStr.charAt(0)))
			return true;
		
		return false;
	}

	private static boolean validPoints(int testPoints) {
		if (testPoints >= 0 && testPoints <= MAX_POINTS)
			return true;
		return false;
	}

	public static int getSortKey() {
		return sortKey;
	}

	public static boolean setSortKey(int key) {
		Student.sortKey = key;
		return true;
	}
	
//	public static Student[] sort(Student[]){}
}

class StudentArrayUtilities {
	// print the array with string as a title for the message box
	// this is somewhat controversial - we may or may not want an I/O
	// methods in this class. we'll accept it today
	public static String toString(String title, Student[] data) {
		String output = title + "\n";

		// build the output string from the individual Students:
		for (int k = 0; k < data.length; k++)
			output += " " + data[k].toString(title, data) + "\n";

		
		return output;
	}

	// returns true if a modification was made to the array
	private static boolean floatLargestToTop(Student[] data, int top) {
		boolean changed = false;
		Student temp;

		// compare with client call to see where the loop stops
		for (int k = 0; k < top; k++)
			if (Student.compareTwoStudents(data[k], data[k + 1]) > 0) {
				temp = data[k];
				data[k] = data[k + 1];
				data[k + 1] = temp;
				changed = true;
			}
		return changed;
	}

	// public callable arraySort() - assumes Student class has a compareTo()
	public static void arraySort(Student[] array) {
		for (int k = 0; k < array.length; k++)
			// compare with method def to see where inner loop stops
			if (!floatLargestToTop(array, array.length - 1 - k))
				return;
	}

	public static int arraySearch(Student[] array, String keyFirst, String keyLast) {
		for (int k = 0; k < array.length; k++)
			if (array[k].getLastName().equals(keyLast))
				return k; // found match, return index
		
		return -1; // fell through - no match
	}

	public static int binarySearch(Student[] array, String keyLast, int firstIndex, int lastIndex) {
		int middleIndex, result;

		if (firstIndex > lastIndex)
			return -1;

		middleIndex = (firstIndex + lastIndex) / 2;
		result = keyLast.compareToIgnoreCase(array[middleIndex].getLastName());

		if (result == 0)
			return middleIndex; // found him!
		else if (result < 0)
			return binarySearch(array, keyLast, firstIndex, middleIndex - 1);
		else
			return binarySearch(array, keyLast, middleIndex + 1, lastIndex);
	}
	
	public static double getMedianDestructive(Student[] array) {
		Student[] arrCopy = array;
		if(array.length == 0)
			return 0;
		if(array.length == 1)
			return array[0].getTotalPoints();
		for(int i = 0; i < arrCopy.length; i++) {
			arrCopy[i].setSortKey(arrCopy[i].SORT_BY_POINTS);
		}
		arraySort(arrCopy);
		int len = arrCopy.length;
		if (len % 2 == 0) {
			Student y = arrCopy[len/2-1];
			Student x = arrCopy[len/ 2 ];
			
			double total = x.getTotalPoints() + y.getTotalPoints();
			return total/2;
		}
		else if (len % 2 != 0) {
			Student z = arrCopy[len/2];
			
			double total = z.getTotalPoints();
			return total;
		}
		else {
			return 0;
		}
		
	}
}

/**
 * RUN:
 * 
 * Before: 
  dodo, bird: 230
  nigam, priyanshi: 205
  jackson, jack: 123
  jacobs, senor: 195
  zz-error, lovely: 148
  jackson, percy: 108
  sperry, steven: 225
  lamo, frankie: 44
  sings, : 452
  halpert, jim: 200
  schrute, dwight: 321
  scott, michael: 321
  chambie, emma: 425
  risotto, ernesto: 405
  pace, tim: 335
  flower, kally: 389
  cali, brock: 176
  ra, ok: 385

Sorting by default ---------------
After: 
  cali, brock: 176
  chambie, emma: 425
  dodo, bird: 230
  flower, kally: 389
  halpert, jim: 200
  jackson, jack: 123
  jackson, percy: 108
  jacobs, senor: 195
  lamo, frankie: 44
  nigam, priyanshi: 205
  pace, tim: 335
  ra, ok: 385
  risotto, ernesto: 405
  schrute, dwight: 321
  scott, michael: 321
  sings, : 452
  sperry, steven: 225
  zz-error, lovely: 148

Sorting by first name ---------------
After: 
  sings, : 452
  dodo, bird: 230
  cali, brock: 176
  schrute, dwight: 321
  chambie, emma: 425
  risotto, ernesto: 405
  lamo, frankie: 44
  jackson, jack: 123
  halpert, jim: 200
  flower, kally: 389
  zz-error, lovely: 148
  scott, michael: 321
  ra, ok: 385
  jackson, percy: 108
  nigam, priyanshi: 205
  jacobs, senor: 195
  sperry, steven: 225
  pace, tim: 335

Sorting by total points ---------------
After: 
  lamo, frankie: 44
  jackson, percy: 108
  jackson, jack: 123
  zz-error, lovely: 148
  cali, brock: 176
  jacobs, senor: 195
  halpert, jim: 200
  nigam, priyanshi: 205
  sperry, steven: 225
  dodo, bird: 230
  schrute, dwight: 321
  scott, michael: 321
  pace, tim: 335
  ra, ok: 385
  flower, kally: 389
  risotto, ernesto: 405
  chambie, emma: 425
  sings, : 452




Before: 
  smith, fred: 205
  bauer, jack: 123
  jacobs, carrie: 195
  renquist, abe: 148
  jackson, trevor: 108
  perry, steve: 225
  loceff, frank: 44
  stollings, pamela: 452
  charters, rodney: 200
  cassar, john: 321
  cunningham, alan: 321
  menns, eric: 425
  sotto, ernesto: 405
  grace, tim: 335
  lai, henry: 389

Sorting by default ---------------
After: 
  smith, fred: 205
  bauer, jack: 123
  jacobs, carrie: 195
  renquist, abe: 148
  jackson, trevor: 108
  perry, steve: 225
  loceff, frank: 44
  stollings, pamela: 452
  charters, rodney: 200
  cassar, john: 321
  cunningham, alan: 321
  menns, eric: 425
  sotto, ernesto: 405
  grace, tim: 335
  lai, henry: 389

Sorting by first name ---------------
After: 
  renquist, abe: 148
  cunningham, alan: 321
  jacobs, carrie: 195
  menns, eric: 425
  sotto, ernesto: 405
  loceff, frank: 44
  smith, fred: 205
  lai, henry: 389
  bauer, jack: 123
  cassar, john: 321
  stollings, pamela: 452
  charters, rodney: 200
  perry, steve: 225
  grace, tim: 335
  jackson, trevor: 108

Sorting by total points ---------------
After: 
  loceff, frank: 44
  jackson, trevor: 108
  bauer, jack: 123
  renquist, abe: 148
  jacobs, carrie: 195
  charters, rodney: 200
  smith, fred: 205
  perry, steve: 225
  cunningham, alan: 321
  cassar, john: 321
  grace, tim: 335
  lai, henry: 389
  sotto, ernesto: 405
  menns, eric: 425
  stollings, pamela: 452


Median of evenClass = 227.5
Successfully preserved sort key.
Median of oddClass = 225.0
Median of smallClass = 205.0
Median of noClass = 0.0/
 */