package com.enterprise.operationsapi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.enterprise.operationsapi.entity.Department;
import com.enterprise.operationsapi.repository.DepartmentRepository;
@SpringBootTest
class DepartmentServiceTest {
	@Autowired
	private DepartmentService departmentService;
	@MockBean
	private DepartmentRepository departmentRepository;

	@BeforeEach
	void setUp() {
		Department department=
				Department.builder()
				.departmentName("IT")
				.departmentAddress("Ahmedabad")
				.departmentCode("IT-06")
				.departmentId(1L)
				.build();
		
		Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
				.thenReturn(department);
	}
	@Test
	@DisplayName("Get Data based on Valid Department Name")
	public void whenValidDepartmentName_thenDepartmentshouldFound() {
		String departmentName="IT";
		Department found=departmentService.fetchDepartmentByName(departmentName);
		
		assertEquals(departmentName,found.getDepartmentName());
	}

}
