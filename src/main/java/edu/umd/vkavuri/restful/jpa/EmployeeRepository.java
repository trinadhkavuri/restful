package edu.umd.vkavuri.restful.jpa;

import org.springframework.data.repository.CrudRepository;

import edu.umd.vkavuri.restful.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
}
