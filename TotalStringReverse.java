
public class TotalStringReverse {

	public static void main(String[] args) {
		
		String str="I.like.this.program.very.much";
		
		String[] arr = str.split("\\.");
		System.out.println(arr.length);
		for (int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]+".");
	}
		System.out.println(arr[0]);

}
}
