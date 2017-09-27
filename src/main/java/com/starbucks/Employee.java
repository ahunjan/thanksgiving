package com.starbucks;

import java.util.Objects;

public class Employee {

	private String firstName;
	private String lastName;
	private String ssn;

	public Employee(String ssn, String firstName, String lastName) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSsn() {
		return ssn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(firstName, employee.firstName) &&
				Objects.equals(lastName, employee.lastName) &&
				Objects.equals(ssn, employee.ssn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, ssn);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Employee{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", ssn='").append(ssn).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
