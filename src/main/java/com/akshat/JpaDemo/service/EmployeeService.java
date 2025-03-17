package com.akshat.JpaDemo.service;

import com.akshat.JpaDemo.model.Employee2;
import com.akshat.JpaDemo.model.Salary;
import com.akshat.JpaDemo.repository.Employee2Repository;
import com.akshat.JpaDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Employee2Repository employee2Repository;

    public void findEmployeesWithSalaryAboveAverageOrderedByAgeAndSalary() {
        List<Object[]> employees = employeeRepository.findEmployeesWithSalaryAboveAverageOrderedByAgeAndSalary();
        for (Object[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }
    }

    @Transactional
    public void updateEmployeeSalaryLessThanGivenSalary() {
        Double avgSal = employeeRepository.findAvgSalary();
        employeeRepository.updateEmployeeSalaryLessThanGivenSalary(100000.0, avgSal);
    }

    @Transactional
    public void addEmployee2() {
        Salary sal1 = new Salary(60000, 7000, 9000, 3000);
        Employee2 emp1 = new Employee2("Akshat", "Srivastava", 22, sal1);

        Salary sal2 = new Salary(45000, 5000, 6000, 2500);
        Employee2 emp2 = new Employee2("Kunal", "Rawat", 23, sal2);

        employee2Repository.saveAll(Arrays.asList(emp1, emp2));
    }

    public void findEmployeesWithLastName() {
        List<Object[]> employees = employeeRepository.findEmployeesWithLastName();
        for (Object[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }
    }

    @Transactional
    public void deleteEmployeeGreaterThanGivenAge() {
        employeeRepository.deleteEmployeeGreaterThanGivenAge(45);
    }

    @Transactional
    public void deleteEmployeeWithMinimumSalary() {
        Double minSal = employeeRepository.findMinSalary();
        employeeRepository.deleteEmployeeWithMinimumSalary(minSal);
    }

}




















