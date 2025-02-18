package com.fullstack.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO Class
class Employee implements Comparable<Employee> {

	private int empId;

	private String empName;

	private int empAge;

	private double empSalary;

	public Employee(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if (empAge == e1.empAge) {
			return 0;
		} else if (empAge < e1.empAge) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparableEx {

	public static void main(String[] args) {

		/*
		 * List<Employee> employeeList = Stream.of(new Employee(121, "SWARA", 21,
		 * 97000.96), new Employee(122, "LAKSHMI", 21, 97000.96), new Employee(123,
		 * "RAJESH", 21, 97000.96), new Employee(124, "RUTUJA", 21, 97000.96), new
		 * Employee(125, "APEKSHA", 21, 97000.96)).toList();
		 */

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(121, "SWARA", 21, 97000.96));
		employeeList.add(new Employee(122, "RAM", 16, 99000.96));
		employeeList.add(new Employee(123, "APARNA", 20, 96000.96));
		employeeList.add(new Employee(124, "RUTUJA", 17, 98000.96));
		employeeList.add(new Employee(125, "APEKSHA", 24, 91000.96));

		Collections.sort(employeeList);

		employeeList.forEach(System.out::println);
	}

}
