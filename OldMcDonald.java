
public class OldMcDonald {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(verse("cat", "meow"));
	}

	public static String verse (String animalName, String sound){
		
		String c ="Old McDonald had a farm, ";
		//c=chorus
		String cn= "ee-eye-ee-eye-oh";
		//cn=chorus noises
		String song =  c +"\n"+ cn+ ", \n"  + "and on his farm he had a " + animalName + ",  \n"+
				cn + ", \nwith a " +sound+ "-" + sound+ " here and a " +sound+"-" +sound+ " there, \n" +
				
				"here a " + sound+ ", there a " +sound+", everywhere a " +sound+ "-" +sound+ ", \n" +c+"\n"+cn ; 
		return (song);
		
	}
}
