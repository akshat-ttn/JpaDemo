package com.akshat.JpaDemo.repository;

import com.akshat.JpaDemo.model.Employee;
import com.akshat.JpaDemo.model.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Employee2Repository extends JpaRepository<Employee2,Integer> {

}
