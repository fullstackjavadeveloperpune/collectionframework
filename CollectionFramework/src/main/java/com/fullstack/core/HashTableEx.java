package com.fullstack.core;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable<String, String> hashTable = new Hashtable<String, String>();

		hashTable.put("ID", "121");
		hashTable.put("NAME", "SWARA");
		hashTable.put("SALARY", "97000.96");
		hashTable.put("ADDRESS", "PUNE, INDIA");
		

		hashTable.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
	}

}
