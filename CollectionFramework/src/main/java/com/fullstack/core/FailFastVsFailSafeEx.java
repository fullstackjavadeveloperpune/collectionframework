package com.fullstack.core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafeEx {
	
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<String>();

		list.add("SWARA");
		list.add("APARNA");
		list.add("RAJESH");
		list.add("APEKSHA");
		list.add("RUTUJA");
		list.add("SWARA");
		list.add("YOGIRAJ");
		
		for(String name: list) {
			list.add("LAKSHMI");
			
			System.out.println(name);
		}
	}

}
