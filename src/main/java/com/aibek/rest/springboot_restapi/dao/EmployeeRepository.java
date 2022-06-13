package com.aibek.rest.springboot_restapi.dao;

import com.aibek.rest.springboot_restapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
