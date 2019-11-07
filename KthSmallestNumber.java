public class KthSmallestNumber {

	public static void main(String[] args) {
		
		int [][] a = new int [5][5];
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				a[i][j]=(i+1)*(j+1);
		}
	}
		int [] b = new int[25];
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				b[(i*5)+j]=a[i][j];
			}
		}
		
		for (int k=0;k<b.length;k++) {
			System.out.println(b[k]);	
		}
		
		for (int l=0;l<b.length-1;l++) {
			for (int m=0;m<b.length-l-1;m++) {
				if (b[m]>b[m+1]) {
					int temp = b[m];
					b[m]=b[m+1];
					b[m+1]=temp;
				}
			}
		}
		System.out.println ("Sorted Array is :");
		for (int n=0;n<b.length;n++) {
			
			System.out.println(b[n]);
		}
		
		System.out.println("6th smallest element in the array is:" + b[5]);
		
		

	}
}


