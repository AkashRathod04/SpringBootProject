package com.crudapp.SpringWebCrudApp.serviceimpl;

import com.crudapp.SpringWebCrudApp.model.Employee;
import com.crudapp.SpringWebCrudApp.repository.HomeRepo;
import com.crudapp.SpringWebCrudApp.service.EmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;


@Transactional
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private HomeRepo hm;

    @Override
    public List<Employee> getEmployee () {


        return hm.findAll () ;
    }

	@Override
	public Employee saveNewEmp(Employee em) {
		// TODO Auto-generated method stub
		return hm.save(em);
	}

	@Override
	public Employee getSingleEmp(long eid) {
		// TODO Auto-generated method stub
		return hm.findByEid(eid);
	}

	@Override
	public void deleteEmp(long eid) {
		
		hm.deleteById(eid);
		
	}
}
