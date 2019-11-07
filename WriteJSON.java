import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON {

	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jo = new JSONObject();
		jo.put("firstname", "Bill");
		jo.put("lastname", "Gates");
		jo.put("age", 25);
		
		Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
        
        jo.put("address", m);
        JSONArray ja = new JSONArray();
        
        m= new LinkedHashMap(2);
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
        ja.add(m);
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234");
        ja.add(m);
        jo.put("phoneNumbers",ja);
        
        System.out.println(jo);
        
       /* PrintWriter pw = new PrintWriter("JSONExample.json"); 
        pw.write(jo.toJSONString()); 
          
        pw.flush(); 
        pw.close();*/ 
    } 
        
        

		
	}


