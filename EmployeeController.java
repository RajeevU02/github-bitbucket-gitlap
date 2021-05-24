package com.icf.springbootassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icf.springbootassignment.entity.Employee;
import com.icf.springbootassignment.repository.EmployeeRepository;
import antlr.collections.List;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository EmployeeRepository;

	// Get all Employee data
	@GetMapping
	public List getAllEmployee() {
		return (List) this.EmployeeRepository.findAll();
	}
//CRUD Operations expose
	// Create Employee
	@PostMapping
	public Employee createEmployee(@RequestBody Employee Employee) {
		return this.EmployeeRepository.save(Employee);
	}

	// Get Employee by ID
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") long Id) {
		return this.EmployeeRepository.findById(Id).orElseThrow();
	}

	// Update Employee
	@PostMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee Employee, @PathVariable("id") long Id) {
		Employee existingEmployee = this.EmployeeRepository.findById(Id).orElseThrow();
		existingEmployee.setFirst_Name(Employee.getFirst_Name());
		existingEmployee.setLast_Name(Employee.getLast_Name());
		existingEmployee.setEmployment_ID(Employee.getEmployment_ID());
		existingEmployee.setStart_Date(Employee.getStart_Date());
		existingEmployee.setDesignation(Employee.getDesignation());
		existingEmployee.setDepartment(Employee.getDepartment());
		existingEmployee.setEnd_date(Employee.getEnd_date());
		existingEmployee.setStatus(Employee.getStatus());
		existingEmployee.setDOB(Employee.getDOB());
		existingEmployee.setReporting_Manager(Employee.getReporting_Manager());
		existingEmployee.setGender(Employee.getGender());
		existingEmployee.setBlood_Group(Employee.getBlood_Group());
		existingEmployee.setAddress(Employee.getAddress());
		return this.EmployeeRepository.save(existingEmployee);
	}

	// Delete Employee
	@DeleteMapping("/{id")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") long Id) {
		Employee existingEmployee = this.EmployeeRepository.findById(Id).orElseThrow();
		this.EmployeeRepository.delete(existingEmployee);
		return ResponseEntity.ok().build();
	}
}