package com.fullstack.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("SWARA");
		list.add("APARNA");
		list.add("RAJESH");
		list.add("APEKSHA");
		list.add("RUTUJA");
		list.add("SWARA");
		list.add("YOGIRAJ");

		/*
		 * Iterator<String> iterator = list.iterator();
		 * 
		 * while (iterator.hasNext()) { String string = (String) iterator.next();
		 * System.out.println(string); }
		 */
		
		/*
		 * for(String name: list) { System.out.println(name); }
		 */
		
		//list.forEach(name-> System.out.println(name));
		
		list.forEach(System.out::println);

	}

}
