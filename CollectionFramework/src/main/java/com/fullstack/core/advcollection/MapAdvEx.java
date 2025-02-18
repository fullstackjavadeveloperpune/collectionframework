package com.fullstack.core.advcollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAdvEx {

	public static void main(String[] args) {

		List<Employee> employeeList = Stream.of(new Employee(121, "SWARA", 97000.96),
				new Employee(122, "LAKSHMI", 19000.96), new Employee(123, "RUTUJA", 91000.96),
				new Employee(124, "RAM", 47000.96), new Employee(125, "POOJA", 94000.96),
				new Employee(1001, "APEKSHA", 77000.96), new Employee(1005, "APARNA", 50000.00)).toList();

		// Convert list into map

		Map<Integer, Employee> employeeMap = employeeList.stream()
				.collect(Collectors.toMap(Employee::getEmpId, employee -> employee));

		employeeMap.forEach((k, v) -> {
			if (v.getEmpSalary() >= 50000.00) {
				System.out.println(k + ": " + v);
			}
		});

	}

}
