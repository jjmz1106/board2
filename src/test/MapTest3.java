package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "졸려");
		map.put(2, "그냥");
		map.put(3, "그래서");
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

}
