
public class BottlesOfJuice {
	public static void main (String[] args) {System.out.println(childrenSong(9));}

	
	
	
	public static String childrenSong(int x){
		if(x==0){
			return "";
		}
		else{
			return (x+ " bottles juice on the wall, " +x+ " bottles of juice, Take one down, pass it around, " + childrenSong(x-1));
		}
		
		
	}
}
