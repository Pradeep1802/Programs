import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacters {

	public static void main(String[] args) {
		
		String Input ="Bu$!ne$$0n%^&";
		String regex = "[^A-Za-z0-9]";
			
		Pattern p= Pattern.compile(regex);
		Matcher m = p.matcher(Input);
		System.out.println(m);
		int count=0;
		
		while (m.find()) {
			count++;}
			System.out.println(count);
			
		}
	}


		
