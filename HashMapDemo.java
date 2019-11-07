import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String> hmap = new HashMap<Integer,String> ();
		hmap.put(10,"Java");
		hmap.put(15, "Python");
		hmap.put(20, "Perl");
		hmap.put(25, "C#");
		hmap.put(30, "Python");
		
		System.out.println("Test Get --" + hmap.get(30) );
		
		System.out.println("Initial Mappings are :" + hmap);
		
		
		System.out.println("The set is:" + hmap.entrySet());
		 
		HashMap <String, Integer> hmap1 = new HashMap <String,Integer> ();
		hmap1.put("Apple", 10);
		hmap1.put("Google",20);
		hmap1.put("Microsoft", 30);
		hmap1.put("VMWare", 40);
		hmap1.put("Google", 50);
		hmap1.put("Microsoft", 60);
		
		System.out.println("Initial Mappings are :" + hmap1);
		
		System.out.println("The set is:" + hmap1.entrySet());
		

	}

}
