
public class MedianofTwoSortedArrays {
	
	static int[] sortArray(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
			}
		return arr;
		}
	
	static double findMedian (int arr2[]) {
		sortArray(arr2);
		printArray(arr2);
		double med =0;
		System.out.println(arr2.length);
		if (arr2.length%2 == 0) {
			med = (double)(arr2[(arr2.length/2)-1]+arr2[(arr2.length/2)])/2;
		} else {
			med = arr2[(arr2.length/2)];
		}
		
		return(med);
		
	}
	
	static void printArray (int arr1[]) {
		System.out.println("Sorted Array is: ");
		for (int i=0;i<arr1.length;i++) {
			System.out.print( arr1[i] + " ");
		}
		System.out.println("\n");
	}
		

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = {5,15,25,35,45};
		
		int c[] = new int[a.length+b.length];
		int counter=0;
		for (int i=0;i<a.length;i++) {
			c[i]=a[i];
			counter=counter+1;
		}
		int k=0;
		for (int j=counter;j<c.length;j++) {
			c[j]=b[k];
			k=k+1;
		}
		
		for (int l=0;l<c.length;l++) {
			System.out.println(c[l]);
		}
		
		System.out.println("Median of the array is : " + findMedian(c));
		
		

	}
	
}


