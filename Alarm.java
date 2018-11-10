
public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfTheWeek=1;
		boolean holiday;
		if(dayOfTheWeek>=1 && dayOfTheWeek<=5){
			holiday= false;
		}
		else {
			holiday= true;
		}
		System.out.println(holiday);
	}

}
