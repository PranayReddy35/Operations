package com.enterprise.operationsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.operationsapi.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	public Department findByDepartmentName(String departmentName);
	public Department findByDepartmentNameIgnoreCase(String departmentName);
}
