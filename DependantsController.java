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

import com.icf.springbootassignment.entity.Dependants;
import com.icf.springbootassignment.repository.DependantsRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/api/Employee")
public class DependantsController {
	@Autowired
	private DependantsRepository DependantsRepository;

	// Get all Dependants data
	@GetMapping
	public List getAllDependants() {
		return (List) this.DependantsRepository.findAll();
	}
//CRUD Operations expose
	// Create Dependants
	@PostMapping
	public Dependants createDependants(@RequestBody Dependants Dependants) {
		return this.DependantsRepository.save(Dependants);
	}

	// Get Employee by ID
	@GetMapping("/{first_Name}")
	public Dependants getDependantsById(@PathVariable(value = "first_Name") String first_Name) {
		return this.DependantsRepository.findById(first_Name).orElseThrow();
	}

	// Update Employee
	@PostMapping("/{first_Name}")
	public Dependants updateDependants(@RequestBody Dependants Dependants, @PathVariable(value = "first_Name") String first_name) {
		Dependants existingDependants = this.DependantsRepository.findById(first_name).orElseThrow();
		existingDependants.setLast_Name(Dependants.getLast_Name());
		existingDependants.setGender(Dependants.getGender());
		existingDependants.setDOB(Dependants.getDOB());
		existingDependants.setGender(Dependants.getRelationship());
		return this.DependantsRepository.save(existingDependants);
	}

	// Delete Employee
	@DeleteMapping("/{first_Name}")
	public ResponseEntity<Dependants> deleteDependants(@PathVariable(value = "first_Name") String first_Name) {
		Dependants existingDependants = this.DependantsRepository.findById(first_Name).orElseThrow();
		this.DependantsRepository.delete(existingDependants);
		return ResponseEntity.ok().build();
	}
}