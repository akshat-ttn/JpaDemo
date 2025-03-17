package com.akshat.JpaDemo.repository;

import com.akshat.JpaDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("select firstName, lastName from Employee where salary > (select avg(e.salary) from Employee e) ORDER BY age, salary DESC")
    List<Object[]> findEmployeesWithSalaryAboveAverageOrderedByAgeAndSalary();

    @Query("select avg(e.salary) from Employee e")
    Double findAvgSalary();

    @Modifying
    @Query("update Employee set salary = :newSalary where salary < :avgSal")
    void updateEmployeeSalaryLessThanGivenSalary(@Param("newSalary") Double newSalary, @Param("avgSal") Double avgSal);

    @Query("select min(salary) from Employee")
    Double findMinSalary();

    @Modifying
    @Query("delete from Employee where salary = :minSalary")
    void deleteEmployeeWithMinimumSalary(@Param("minSalary") Double minSalary);


    @Query(value = "select emp_id, emp_first_name, emp_age from employee_table where emp_last_name = 'Singh' ", nativeQuery = true)
    List<Object[]> findEmployeesWithLastName();

    @Modifying
    @Query(value = "delete from employee_table where emp_age > :givenAge", nativeQuery = true)
    void deleteEmployeeGreaterThanGivenAge(@Param("givenAge") Integer givenAge);





}














