package com.fullstack.core;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();

		set.add("SWARA");
		set.add("APARNA");
		set.add("RAJESH");
		set.add("APEKSHA");
		set.add("RUTUJA");
		set.add("SWARA");
		set.add("YOGIRAJ");

		set.forEach(System.out::println);
	}

}
