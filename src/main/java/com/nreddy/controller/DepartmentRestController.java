package com.nreddy.controller;


import com.nreddy.entity.Department;
import com.nreddy.service.IDepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {


    @Autowired
    private IDepartmentService departmentService;



    @Operation(summary = "Save Department")
    @PostMapping("/saveDepartment")

    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){

        return  new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.CREATED);

    }



}
