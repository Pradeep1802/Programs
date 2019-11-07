import java.util.LinkedHashMap;

public class LongestCommonPrefix {
	
	static String commonPrefix(String arr[],int n) {
		String pf = arr[0];
		for (int i=1;i<n;i++) {
			pf = checkPrefix(pf,arr[i]);
			}
		return (pf);
	}
	
	static String checkPrefix(String str1,String str2) {
		String result ="";
		int n1=str1.length();
		int n2=str2.length();
				
		for (int i=0;i<=n1-1;i++) {
			for (int j=0;j<=n2-1;j++) {
				if (str1.charAt(0)!=str2.charAt(0)) {
					break;
				} else if (str1.charAt(i)!=str2.charAt(j)) {
					continue;	
				} else {
					result +=str1.charAt(i);
				}
			}
			
		}
		return (result);
	}
	
	
	
	public static void main(String[] args) {
		
		String arr[] = {"Flower","Flow","Flown","Flight","Flowing"};
		String prefix=commonPrefix(arr,arr.length);
		if (prefix.length() >0) {
			System.out.println("Longest Common Prefix is:" + prefix);
		}
		else {
			System.out.println("No Common prefix");
		}
		
	}
		
	
			
			
}
		
		




