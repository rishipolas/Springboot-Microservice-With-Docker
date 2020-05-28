package com.ezss.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ezss.demo.model.Employee;
import com.ezss.demo.service.servicei;

@RestController
public class HomeController {

	@Autowired servicei si;
	
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public Employee saveData(@RequestBody Employee e ){
		Employee tr =  si.saveDataObjects(e);
		
		if(tr == null)
		    return null;
		else
			return tr;
	}
	
	
	
	@RequestMapping(value = "/getData" , method = RequestMethod.GET)
	public List<Employee> dataFind(){
		return si.dataFind();
	}
	
	
}
