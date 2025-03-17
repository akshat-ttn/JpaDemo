package com.akshat.JpaDemo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employeeTable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Employee {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private Long id;

    @Column(name = "empFirstName")
    private String firstName;

    @Column(name = "empLastName")
    private String lastName;

    @Column(name = "empSalary")
    private Double salary;

    @Column(name = "empAge")
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
