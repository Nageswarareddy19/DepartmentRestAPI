package com.nreddy.service;

import com.nreddy.entity.Department;
import com.nreddy.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements IDepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;



    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
