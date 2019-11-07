import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		
		int n, number;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of Rows: ");
		n = scan.nextInt();
		
		if (n==1) {
			System.out.println("1");
		}
		if (n==2) {
			System.out.println("11");
		}
		
		if (n>=3) {
		System.out.print("1,11");
		}
		String str ="11";
	
		
		for (int i=3;i<=n;i++) {
			str+="\n";
			String temp="";
			int count=1;
			char []arr = str.toCharArray();
			for (int j=1;j<str.length();j++) {
				if (arr[j]!=arr[j-1]) {
					temp=temp+Integer.toString(count)+arr[j-1];
					count=1;
				} else {count++;}
			}
			str=temp;
			
			System.out.print(","+str);
		}
		
	}
}
			


