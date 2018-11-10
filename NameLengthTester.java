
public class NameLengthTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public String findLongestName(String [] names){
		 int size = names.length;
		 int nameLength= names[0].length();
		 String longestName=names[0];
		 for(int i=1; i<size; i++){
			 if (names[i].length()>nameLength){
				 longestName=names[i];
			 }
		 }
		 

	    return longestName;
	}
}
