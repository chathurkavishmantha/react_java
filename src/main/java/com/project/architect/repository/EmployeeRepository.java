package com.project.architect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.architect.model.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
