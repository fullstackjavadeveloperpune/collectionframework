package com.fullstack.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("ID", "121");
		map.put("NAME", "SWARA");
		map.put("SALARY", "97000.96");
		map.put(null, "ABC");
		map.put("ADDRESS", "PUNE, INDIA");
		map.put(null, "XYZ");

		/*
		 * for (Map.Entry<String, String> m : map.entrySet()) {
		 * System.out.println(m.getKey() + ": " + m.getValue()); }
		 */

		/*
		 * map.forEach((k, v)->{ System.out.println(k+": "+v); });
		 */

		map.entrySet().stream().forEach(System.out::println);
	}

}
