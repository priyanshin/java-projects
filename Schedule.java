
public class Schedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String schedule;
		int dayOfWeek = 4;
		switch(dayOfWeek){
		case 1: schedule= "Get to work!";
			break;
		case 2: schedule= "Do homework!";
			break;
		case 3: schedule= "Wash hair!";
			break;
		case 4: schedule= "Attend livestream!";
			break;
		case 5: schedule= "Yay, Friday! Work on CSAP";
			break;
		default: schedule= "Free!";
		}System.out.println(schedule);
	} 

}
