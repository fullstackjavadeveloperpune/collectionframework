package com.fullstack.core.advcollection;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
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

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}

}

public class IQListEx {

	public static void main(String[] args) {

		List<Employee> employeeList = Stream.of(new Employee(121, "SWARA", 97000.96),
				new Employee(122, "LAKSHMI", 19000.96), new Employee(123, "RUTUJA", 91000.96),
				new Employee(124, "RAM", 47000.96), new Employee(125, "POOJA", 94000.96),
				new Employee(1001, "APEKSHA", 77000.96), new Employee(1005, "APARNA", 17000.96)).toList();

		// sort by name
		/*
		 * employeeList.stream().sorted(Comparator.comparing(Employee::getEmpName).
		 * reversed()) .forEach(System.out::println);
		 */

		// sort by salary
		/*
		 * employeeList.stream().sorted(Comparator.comparing(Employee::getEmpSalary).
		 * reversed()) .forEach(System.out::println);
		 */

		// filter data by salary>50000.00
		// employeeList.stream().filter(emp -> emp.getEmpSalary() >=
		// 50000.00).forEach(System.out::println);

		// Second Largest Salary Record
		Employee employee = employeeList.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed())
				.toList().get(1);

		System.out.println(employee);
	}

}
