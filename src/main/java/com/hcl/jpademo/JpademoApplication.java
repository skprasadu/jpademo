package com.hcl.jpademo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hcl.jpademo.models.Department;
import com.hcl.jpademo.repositories.DepartmentRepository;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JpademoApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(JpademoApplication.class, args);
		
		DepartmentRepository repo = (DepartmentRepository) ctx.getBean("departmentRepository");
		
		repo.save(new Department("Chemistry"));
		repo.save(new Department("Physics"));
		
		List<Department> list = repo.findAll();
		
		System.out.println("department count is " + list.size());
		System.out.println("1st department name is " + list.get(0).getName());
		
		DepartmentService service = (DepartmentService) ctx.getBean("departmentService");
		System.out.println(service.getCount());

		DepartmentController controller = (DepartmentController) ctx.getBean("departmentController");
		System.out.println(controller.getCount());
		
	}

}
