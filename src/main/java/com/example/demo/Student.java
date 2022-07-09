package com.example.demo;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="Student")
@Table
public class Student {

    public Student(Long id, String name, LocalDate dob, String email, int age) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }
    
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    private int age;
    
}
