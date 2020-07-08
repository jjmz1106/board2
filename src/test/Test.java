package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	private static final Iterator<String> Keys = null;

	public static void main(String[] args) throws SQLException {
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("3");
		strList.add("4");
		System.out.println(strList.size());
		
		Map<String,String> map = new HashMap<>();
		map.put("4", "0");
		map.put("3", "1");
		map.put("2", "2");
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = Keys.next();
			String value = map.get(key);
			System.out.println(key + "," + value);
		}
	}

}
