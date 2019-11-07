
public class Power {
	
	static double power(double x,double y) {
		double product=1;
		if (y>0) {
			while (y!=0) {
				product *=x;
				y--;
	   } 	
	} 
		
		else {
			while (y!=0) {
			product=product*(1/x);
			y++;
		
	}
		   
	}
		return product;
	}
		
	public static void main(String[] args) {
		
		System.out.println("Power of :" + power(-2,-3));
	}
}
		
