package com.fullstack.core;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.add("SWARA");
		vector.add("APARNA");
		vector.add("RAJESH");
		vector.add("APEKSHA");
		vector.add("RUTUJA");
		vector.add("SWARA");
		vector.add("YOGIRAJ");

		vector.forEach(System.out::println);
	}

}
