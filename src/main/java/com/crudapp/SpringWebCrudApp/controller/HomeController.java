package com.crudapp.SpringWebCrudApp.controller;


import com.crudapp.SpringWebCrudApp.model.Employee;
import com.crudapp.SpringWebCrudApp.service.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
public class HomeController {


    @Autowired
    private EmpService empse;

    @GetMapping("/getAllEmp")
    public List<Employee> getEmployee(){

    	List<Employee> employee = empse.getEmployee();
    	
    	

        return employee;
    }

    
    @PostMapping("/saveEmp")
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee em){
    	
    	
    	return new ResponseEntity<Employee>(empse.saveNewEmp(em),HttpStatus.CREATED);

    }
    
    @GetMapping("/getSingleEmp/{eid}")
    public ResponseEntity<Employee> getSingleEmp(@PathVariable long eid){
    	
    	Employee em=empse.getSingleEmp(eid);
    	
    	return new ResponseEntity<Employee>(em,HttpStatus.OK);
    	
    }
    
    @DeleteMapping("/deleteData/{eid}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long eid){
    	
    
    	empse.deleteEmp(eid);
    	
    	
    	
    	return new ResponseEntity<String>("Employee Has Been Deleted in"+eid,HttpStatus.NO_CONTENT);
    }
    

}
