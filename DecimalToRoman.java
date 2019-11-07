import java.util.HashMap;

class Convert {
	
	public static String intToRoman(int num)  
    {  
 
        String m[] = {"", "M", "MM", "MMM"}; 
        String c[] = {"", "C", "CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "CM"}; 
        String x[] = {"", "X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"}; 
        String i[] = {"", "I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX"}; 
              
        String thousands = m[num/1000]; 
        String hundreds = c[(num%1000)/100]; 
        String tens = x[(num%100)/10]; 
        String ones = i[num%10]; 
              
        String roman = thousands + hundreds + tens + ones; 
              
        return roman; 
    } 
}
public class DecimalToRoman {
		    public static void main(String []args) 
		    { 
		        System.out.println(Convert.intToRoman(567));
		        
		          
		    } 
		  
		} 
		
		
	