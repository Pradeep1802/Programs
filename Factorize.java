import java.util.Scanner;

public class Factorize {

	public static void main(String[] args) {
		
		for (int i=1;i<=8899;i++) {
			for(int j=1;j<=i;j++) {
				if((i*j) == 8899) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
					
				