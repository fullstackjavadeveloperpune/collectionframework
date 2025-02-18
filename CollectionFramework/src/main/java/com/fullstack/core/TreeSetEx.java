package com.fullstack.core;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		set.add("SWARA");
		set.add("APARNA");
		set.add("RAJESH");
		set.add("APEKSHA");
		set.add("121");
		set.add("RUTUJA");
		set.add("11");
		set.add("SWARA");
		set.add("YOGIRAJ");

		set.forEach(System.out::println);
	}

}
