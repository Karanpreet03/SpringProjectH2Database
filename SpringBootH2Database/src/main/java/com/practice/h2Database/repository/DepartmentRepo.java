package com.practice.h2Database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.h2Database.entity.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long>{

}
