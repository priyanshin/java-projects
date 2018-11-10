
public class PowerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power (2, 6));
	}
	public static int power(int base, int exponent){
		if(exponent==0){
			return 1;
		}
		else{
			
			//int total=base*base;
			//total= power(total, exponent);
			return base*power(base,(exponent-1) );
		}
	
		
		// all of my excess code before i realized how easy this actually is:
		
		//double x = Math.pow(base, exponent);
////		for (int i =0; i<=base; i++)
////			int total = base*base;
////			total=total*base;
//		int count = 0;
//		if (exponent!=count){
//			for(int i=0; i==count; i++)
//			{count++; 
//			int total=base*base;
//			total= base*total;
//			return total;}
//		}
//		else{
//			return 0;
//			
//		}
//		return count;
//	
//		
		}
;
}
