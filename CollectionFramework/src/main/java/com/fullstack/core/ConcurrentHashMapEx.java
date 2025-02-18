package com.fullstack.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();

		map.put("ID", "121");
		map.put("NAME", "SWARA");
		map.put("SALARY", "97000.96");
		map.put("ADDRESS", "PUNE, INDIA");

		map.forEach((k, v) -> {
			map.put("GENDER", "FEMALE");

			System.out.println(k + ": " + v);
		});
	}

}
