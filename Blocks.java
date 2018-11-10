
public class Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBlocks(4));

	}
	public static int countBlocks(int levels){
		 int total=0;
		   
		 for(int i=0; i<= levels; i++){
		     int x=i*i;
		     total=total+x;  
		 }
		return total;

		    
		}
}
