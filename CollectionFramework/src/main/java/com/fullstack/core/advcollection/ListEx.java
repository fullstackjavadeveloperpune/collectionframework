package com.fullstack.core.advcollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListEx {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6, 8, 9, 3, 4, 9, 2, 9, 3, 10, 10);

		// sort integers
		// integerList.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(System.out::print);

		// Sum Of Integers
		// int sum =
		// integerList.stream().collect(Collectors.summingInt(Integer::intValue));

		// System.out.println(sum);

		// Avg of Integers

		// double avg =
		// integerList.stream().collect(Collectors.averagingDouble(Integer::intValue));

		// System.out.println(avg);

		// fetch 2nd largest number from integer list
		/*
		 * int secondLargestNumber =
		 * integerList.stream().distinct().sorted(Comparator.comparing(Integer::intValue
		 * ).reversed()) .toList().get(1);
		 * 
		 * System.out.println(secondLargestNumber);
		 */

		// Repeated Numbers with its occurences

		Map<Integer, Long> counterMap = integerList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		/*
		 * counterMap.forEach((k, v)->{ if(v>1) { System.out.println(k+": "+v); } });
		 */

		counterMap.entrySet().stream().filter(num -> num.getValue() > 1)
				.forEach(n -> System.out.println(n.getKey() + ": " + n.getValue()));
	}

}
