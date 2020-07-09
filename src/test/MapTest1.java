package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("age", 10);
		for(int i=map.get("age");i<=50;i++) {
			int sum = map.get("age") + i;
			map.put("age", sum);
		}
		System.out.println(map);
	}

}
