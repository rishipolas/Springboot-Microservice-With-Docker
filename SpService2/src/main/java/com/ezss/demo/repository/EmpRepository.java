package com.ezss.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ezss.demo.model.Employee;

@Repository
public interface EmpRepository extends PagingAndSortingRepository<Employee, Integer>{

}
