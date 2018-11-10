import java.io.*;

public class JavaCalender {
	public static void main(String ar[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("******* Welcome**********");
		System.out
				.println("This Programs helps you to find out which day of the year a date will fall??");
		System.out.println();
		System.out
				.println("Note:This Program Will only work for dates from 1-1-0001 till 31-12-10000");
		System.out.println();

		// Reading date
		System.out.println("enter date [In format DD]");
		int dt = Integer.parseInt(br.readLine());

		// Reading month number
		System.out.println("enter Month [in format MM]");
		int mon = Integer.parseInt(br.readLine());

		// Reading 4 digit year
		System.out.println("enter Year [In Format YYYY]");
		int yr = Integer.parseInt(br.readLine());

		// date
		int d = dt % 7;
		System.out.println("d=" + d);

		// year
		// y is 2 digit year
		int y = yr % 100;
		System.out.println("y=" + y);

		int y1 = y + y / 4;
		if (y == 0) {
			y1 = 6;
		}

		// Adjustment as years like 2100 will not be leap year
		if (y == 0 && yr % 400 != 0) {
			y1 = y1 - 1;
		}
		System.out.println("y1=" + y1);
		System.out.println("y=" + y);

		// Century
		int c = ((yr - 1) / 100) + 1;
		System.out.println("c=" + c);

		int c1 = 9 - 2 * (c % 7) + (c - 1) / 4;

		System.out.println("c1=" + c1);

		// q =1 for leap year , q=2 for non leap year

		int q = 0, b = 0, tot = 0, f = 0;

		if ((yr % 100 == 00 && yr % 400 != 0) || yr % 4 != 00) // checking for
																// century
																// nonleap year
		{
			q = 2;
		} else {
			q = 1;
		}
		System.out.println("q=" + q);

		if (q == 2) // non leap year
		{
			switch (mon) {
			case 1:
				b = 6; // b is month value
				break;
			case 2:
				b = 2;
				break;
			case 3:
				b = 2;
				break;
			case 4:
				b = 5;
				break;
			case 5:
				b = 0;
				break;
			case 6:
				b = 3;
				break;
			case 7:
				b = 5;
				break;
			case 8:
				b = 1;
				break;
			case 9:
				b = 4;
				break;
			case 10:
				b = 6;
				break;
			case 11:
				b = 2;
				break;
			case 12:
				b = 4;
			}

		} else // leap year
		{
			switch (mon) {
			case 1:
				b = 5;
				break;
			case 2:
				b = 1;
				break;
			case 3:
				b = 2;
				break;
			case 4:
				b = 5;
				break;
			case 5:
				b = 0;
				break;
			case 6:
				b = 3;
				break;
			case 7:
				b = 5;
				break;
			case 8:
				b = 1;
				break;
			case 9:
				b = 4;
				break;
			case 10:
				b = 6;
				break;
			case 11:
				b = 2;
				break;
			case 12:
				b = 4;
				break;
			}

		}
		System.out.println("b=" + b);

		tot = d + b + y1 + c1;

		System.out.println("total=" + tot);

		f = tot % 7;

		System.out.println("f=" + f);
		switch (f) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out
					.println("there is some error with the program please re-run");
		}
	}
}
