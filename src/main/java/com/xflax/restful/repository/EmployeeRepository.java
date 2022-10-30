package com.xflax.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xflax.restful.model.EmployeeEntity;

@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {

}