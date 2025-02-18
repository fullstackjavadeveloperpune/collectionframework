package com.fullstack.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer {
	private int custId;

	private String custName;

	private int custAge;

	public Customer(int custId, String custName, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]";
	}

}

class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getCustName().compareTo(c2.getCustName());
	}

}

class AgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if (c1.getCustAge() == c2.getCustAge()) {
			return 0;
		} else if (c1.getCustAge() > c2.getCustAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparatorEx {

	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer(121, "SWARA", 21));
		customerList.add(new Customer(122, "APEKSHA", 19));
		customerList.add(new Customer(123, "YOGIRAJ", 24));
		customerList.add(new Customer(124, "POOJA", 17));
		customerList.add(new Customer(1001, "APARNA", 32));
		customerList.add(new Customer(125, "RAJESH", 22));

		System.out.println("**********NAME COMPARATOR**************");
		Collections.sort(customerList, new NameComparator());
		customerList.forEach(System.out::println);

		System.out.println("\n \n \n");

		System.out.println("**********AGE COMPARATOR**************");
		Collections.sort(customerList, new AgeComparator());
		customerList.forEach(System.out::println);

	}

}
