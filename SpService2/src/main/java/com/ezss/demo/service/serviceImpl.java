package com.ezss.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezss.demo.model.Employee;
import com.ezss.demo.repository.EmpRepository;

@Service
public class serviceImpl implements servicei{

	
	@Autowired EmpRepository er;



	@Override
	public Employee saveDataObjects(Employee e) {
	
		Employee ty = er.save(e);
		
		return ty;
	}



	@Override
	public List<Employee> dataFind() {
		List<Employee> li = (List<Employee>) er.findAll();
		return li;
	}
	
	
	
}
