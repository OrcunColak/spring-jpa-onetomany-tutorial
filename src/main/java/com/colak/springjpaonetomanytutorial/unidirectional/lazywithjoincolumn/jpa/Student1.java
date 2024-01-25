package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student1")
@Getter
@Setter
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String mobile;

    @OneToMany(cascade = CascadeType.ALL)
    // The table for Address1 is going to have a student_id column
    @JoinColumn(name = "student_id")
    private List<Address1> addresses = new ArrayList<>();

}
