package com.nreddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {


    @Id
    @GeneratedValue
    private Long departmentId;
    private String departmentName;
    private String departmentCode;
}
