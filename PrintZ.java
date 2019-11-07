import java.util.Scanner;

public class PrintZ {

	public static void main(String[] args) {
		
		int n, number;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of Rows: ");
		n = scan.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.print("*");
		}
		for (int j=1;j<=n-1;j++) {
		System.out.print("\n");
			{
				for (int k=1;k<=n-1;k++) {
					if (k==(6-j)) {
						System.out.print("*");
						break;
					} else {
						System.out.print(" ");
					}
				}
			}
		}
		for (int l=1;l<6;l++){
            System.out.print("*");
      }

			
			
		}

	}


