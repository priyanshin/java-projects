
public class Student {
	//1) Complete the group class exercise.
	//2) Add the following attributes : gpa, email, and highSchool. Add setter and getter methods for them.
	String name;
	String hobby;
	int idNum;
	double gpa;
	String email;
	String highSchool;
	
	static int nextAvailableId=0;
	//static often used to create increments
	//a better constructor 
	public Student(String nameParam, String hobbyParam, double gpaParam, String emailParam, String highSchoolParam) {
		// TODO Auto-generated constructor stub
		name=nameParam;
		hobby=hobbyParam;
		idNum=nextAvailableId;
		nextAvailableId++;
		email=emailParam;
		gpa= gpaParam;
		highSchool=highSchoolParam;
		
	}
	public String toString(){
		return name+": "+hobby+ ": "+idNum + ": " + email+ ": " + gpa + ": " + highSchool;
		
	}
	
	public void setHobby(String hobbyParam)
	{
		hobby=hobbyParam;
	}
	public String getHobby()
	{
		return hobby;
	}
	public double getGpa()
	{
		return gpa;
		
	}
	public void setGpa(double gpaParam){
		
		gpa=gpaParam;
	}
	public double getEmail(){
		return gpa;
	}
	public void setEmail(String emailParam){
		
		email=emailParam;
	}
	public String getHighSchool(){
		return highSchool;
	}
	public void setHighSchool(String highSchoolParam){
		highSchool=highSchoolParam;
		
	}
	
	
	}


