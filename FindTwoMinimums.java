
public class FindTwoMinimums {

	public static void main(String[] args) {
		
		int a [] = {10,15,20,9,4,12,14,11,8,21};
		int min = a[0];
		int secondmin = a[0];
		for (int i=0;i<a.length;i++) {
			if (a[i]<min) {
				secondmin = min;
				min=a[i];
			} else if (a[i] < secondmin && a[i]!= min) {
				secondmin=a[i];
			}
			
		}
		System.out.println("The minimum number is :" + min);
		System.out.println("The second minimum is :" + secondmin);
		

	}

}
