package com.icf.springbootassignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.icf.springbootassignment.entity.Dependants;
import com.icf.springbootassignment.entity.Educational_qualification;
import com.icf.springbootassignment.entity.Employee;

@SpringBootApplication
public class SpringbootCrudrestfulAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudrestfulAssignmentApplication.class, args);
	}
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
 
    public void run(String args[]) throws Exception {
        String sql = "SELECT * FROM Employee";
        List<Employee> Employee = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Employee.class));
        Employee.forEach(System.out :: println);
    }
    
    public void run1(String args[]) throws Exception {
        String sql = "SELECT * FROM Dependants";
        List<Dependants> Employee = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Dependants.class));
        Employee.forEach(System.out :: println);
    }
    
    public void run2(String args[]) throws Exception {
        String sql = "SELECT * FROM Educational_qualification";
        List<Educational_qualification> Employee = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Educational_qualification.class));
        Employee.forEach(System.out :: println);
    }
}