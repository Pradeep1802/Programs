import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
		Object obj = parser.parse(new FileReader("C:\\Users\\pbalivada\\OneDrive - BusinessOne Technologies, Inc\\Desktop\\test.json"));
		JSONObject jo = (JSONObject) obj;
		String fname = (String) jo.get("firstname");
		String lname = (String) jo.get("lastname");
		Map address=((Map) jo.get("address"));
		Iterator<Map.Entry> itr1 = address.entrySet().iterator();
		while(itr1.hasNext()) {
			Map.Entry pair = itr1.next();
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
		
		JSONArray ja = (JSONArray) jo.get("phoneNumbers");
		Iterator itr2 = ja.iterator();
		while (itr2.hasNext()) {
			itr1=((Map) itr2.next()).entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey()+ " : " + pair.getValue());
			}
			
		}
		
		
		
		
		System.out.println(fname);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
