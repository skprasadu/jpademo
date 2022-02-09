package com.hcl.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.jpademo.repositories.DepartmentRepository;

@RestController
public class DepartmentController {
	
	//@Autowired
	//private DepartmentRepository departmentRepository;
	
	//public DepartmentController(DepartmentRepository departmentRepository) {
	//	this.departmentRepository = departmentRepository;
	//}
	
	@Autowired
	private DepartmentService departmentService;
	
	//public DepartmentController(DepartmentRepository departmentRepository) {
	//	this.departmentRepository = departmentRepository;
	//}

	
	@GetMapping("/count")
	public Long getCount() {
		return departmentService.getCount();
	}

}
