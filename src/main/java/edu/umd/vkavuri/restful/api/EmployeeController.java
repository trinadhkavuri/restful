package edu.umd.vkavuri.restful.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.umd.vkavuri.restful.EmployeeService;
import edu.umd.vkavuri.restful.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getById(id);
	}
	
	@PutMapping("/employee")
	public Employee save(@RequestBody  Employee employee) {
		return employeeService.save(employee);
	}
}
