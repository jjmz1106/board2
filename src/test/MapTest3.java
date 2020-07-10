package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {
	
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("123", "125");
		m.put("2345", "12354");
		Iterator<String> it = m.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + m.get(key));

		
		}
	}

}
