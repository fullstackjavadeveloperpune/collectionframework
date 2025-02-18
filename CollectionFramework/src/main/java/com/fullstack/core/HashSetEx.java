package com.fullstack.core;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("SWARA");
		set.add(null);
		set.add("APARNA");
		set.add("RAJESH");
		set.add("APEKSHA");
		set.add("RUTUJA");
		set.add("SWARA");
		set.add("YOGIRAJ");
		set.add(null);

		set.forEach(System.out::println);
	}

}
