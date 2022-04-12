package com.crudapp.SpringWebCrudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapp.SpringWebCrudApp.model.Employee;

@Repository
public interface HomeRepo extends JpaRepository<Employee,Long> {


	
	public Employee findByEid(long eid);


}
