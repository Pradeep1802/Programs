import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicatesinArray {

	public static void main(String[] args) {
		int a[] = {10,15,9,7,10,12,15,7,12,9};
		/*	for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					
					System.out.println(a[i]);
					
				}
			}
		}*/
		
		HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i:a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
				System.out.println("value of i--" + i);
				System.out.println("Value of map.get(i)--" + map.get(i));
			} else { 
				map.put(i, 1);
				System.out.println("----map---" + map);		
			}
		}
		
		for (Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+"---------"+e.getValue());
			
		}
		
		

	}

}
