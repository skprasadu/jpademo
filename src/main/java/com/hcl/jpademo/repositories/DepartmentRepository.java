package com.hcl.jpademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.jpademo.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
