package com.practice.h2Database.service;

import java.util.List;

import com.practice.h2Database.entity.Department;


public interface DepartmentService {
	Department saveDepartment(Department dept);
	List<Department> fetchDepartmentList();
	Department updateDepartment(Department dept, Long departmentId);
	
	void deleteDepartmentById(Long DepartmentId);
}
