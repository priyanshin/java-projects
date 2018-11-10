
public class DiceRoll {

	public static void main(String[] args) {
		System.out.println(monopolyRoll());
		
	
		// TODO Auto-generated method stub
//		for(int i =1; i<=3; i++){ 
//			int x=(monopolyRoll());
//			int total=x;
//				total = total+ x;
		}
	//}
	
	public static int diceRoll(){
		double randomNum= (Math.random()*6)+1;
		int randomDiceRoll= (int) randomNum;
		return randomDiceRoll;
		
	}
	public static int monopolyRoll(){
		int total = 0;
		int x1=0;
		int x2=0;
		for (int i=1; i<=3; i++){
			x1=x1+diceRoll();
			x2=x2+diceRoll();
			int jailCounter=i;
				if (x1!=x2){
					total=x1+x2;
					return total;
					//break;
					
				}
				
				if (jailCounter==3){
					System.out.println("Go to Jail!");
					total=x1+x2;
					return total;
					//break;
				}	
		}
		total=x1+x2;
		return total;
		
//		int diceRoll1=diceRoll();
//		int diceRoll2=diceRoll();
//		
//		if(diceRoll1!=diceRoll2){
//			
//			int total= diceRoll1+diceRoll2;
//			return total;
//			
//		}
//		else{
//			int diceRoll3=diceRoll();
//			int diceRoll4=diceRoll();
//			int total= diceRoll1+diceRoll2+ diceRoll3+diceRoll4;
//			//monopolyRoll();
//			return total;
//		}
		
		
		
	}
}
