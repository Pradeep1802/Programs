
class A1 {
	
	static String [] until_19 = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
			"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	static String [] all_tens = {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
	public  String convertlessthan100(int val) {
		
		if (val <20) {
			return until_19[val];
		} else if (val == 100) {
			return "One Hundred";
		}

		else {
			int quotient=val/10;
			int remainder = val%10;
			if (remainder!=0) {
			return ((all_tens[quotient-2]) + ' ' + until_19[remainder]);
			} else {
				return (all_tens[quotient-2]);
			}
			
		}	
		
	}
	
    public  String convertgreaterthan100(int val) {
		
		if (val ==1000) {
			return "One Thousand" ;
		} 
		else {
			int quotient=val/100;
			int remainder = val%100;
			if (remainder==0) {
				return (until_19[quotient]+" " + "Hundred");
			}
			else {
				return (until_19[quotient] + " " + "Hundred" +" "+ "And" + " " + convertlessthan100(remainder));
			}
			
		}
		
}
}


public class NumberToWord {
	public static void main(String[] args) {
		
		A1 obj1 = new A1();
		
		System.out.println(obj1.convertlessthan100(88));
		System.out.println(obj1.convertgreaterthan100(500));
		System.out.println(obj1.convertgreaterthan100(999));
					
		}
}
		


