import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		int n, number;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of Rows: ");
		n = scan.nextInt();
		
		for (int i=0;i<=n;i++) {
			for (int j=n;j>i;j--) {
				System.out.print(" ");
			}
			number=1;
			for  (int k=0;k<=i;k++) {
				System.out.print(number + " ");
				number= number * (i-k)/(k+1);
			}
			System.out.println();
		}
		
	
	}

}
