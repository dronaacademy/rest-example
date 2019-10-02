package info.aryalinux.examples.restexample.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import info.aryalinux.examples.restexample.entity.Employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {

}
