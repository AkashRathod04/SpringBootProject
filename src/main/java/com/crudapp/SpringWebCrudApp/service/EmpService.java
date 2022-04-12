package com.crudapp.SpringWebCrudApp.service;

import java.util.List;

import com.crudapp.SpringWebCrudApp.model.Employee;

public interface EmpService {


    List<Employee> getEmployee ();

	Employee saveNewEmp(Employee em);

	Employee getSingleEmp(long eid);

	void deleteEmp(long eid);
}
