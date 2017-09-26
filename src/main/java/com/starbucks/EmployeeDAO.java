package com.starbucks;

public interface EmployeeDAO {
    public Long insertEmployee(Employee employee);
    public boolean contains(Employee employee);
    public boolean contains(Long id);
}
