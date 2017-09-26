package com.starbucks;

public class EmployeeService {

	private EmployeeDAO employeeDAO;

	public EmployeeService(EmployeeDAO employeeDAO) {
	    this.employeeDAO = employeeDAO;
	}

	public Long register(Employee employee) {
		if (!employeeDAO.contains(employee)) {
			return employeeDAO.insertEmployee(employee);
		}
	
		return -199L;
	}

}
