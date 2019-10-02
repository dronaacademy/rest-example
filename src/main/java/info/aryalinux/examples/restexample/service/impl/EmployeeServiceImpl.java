package info.aryalinux.examples.restexample.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import info.aryalinux.examples.restexample.entity.Employee;
import info.aryalinux.examples.restexample.repository.EmployeeRepository;
import info.aryalinux.examples.restexample.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees(int page, int count) {
		Page<Employee> employees = employeeRepository.findAll(PageRequest.of(page, count));
		List<Employee> result = new ArrayList<>();
		for (Employee employee : employees) {
			result.add(employee);
		}
		return result;
	}

}
