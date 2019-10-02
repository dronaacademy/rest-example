package info.aryalinux.examples.restexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import info.aryalinux.examples.restexample.entity.Employee;
import info.aryalinux.examples.restexample.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, path = "/employee")
	public List<Employee> getEmployees(@RequestParam(name = "page") int page, @RequestParam(name = "count") int count) {
		return employeeService.getEmployees(page, count);
	}
}
