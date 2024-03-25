package edu.umd.vkavuri.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.umd.vkavuri.restful.jpa.EmployeeRepository;
import edu.umd.vkavuri.restful.model.Employee;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	@Transactional(value = TxType.REQUIRED)
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
}
