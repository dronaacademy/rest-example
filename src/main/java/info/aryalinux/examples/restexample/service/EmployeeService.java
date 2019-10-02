package info.aryalinux.examples.restexample.service;

import java.util.List;

import info.aryalinux.examples.restexample.entity.Employee;

public interface EmployeeService {
	List<Employee> getEmployees(int page, int count);
}
