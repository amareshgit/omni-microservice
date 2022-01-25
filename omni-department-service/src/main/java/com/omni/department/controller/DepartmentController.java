package com.omni.department.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omni.department.entity.Department;
import com.omni.department.service.DepartmentService;
	


@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	Logger log = LoggerFactory.getLogger(DepartmentController.class);


	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		
		log.info("Simple log statement with department {}", department);
		return departmentService.saveDepartment(department);
	
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Simple log statement with department id {}", departmentId);
		return departmentService.findDepartmentById(departmentId);
	}
}
