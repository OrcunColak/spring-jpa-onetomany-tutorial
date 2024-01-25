package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student3")
@Getter
@Setter
public class Student3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String mobile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    // Address2 is going to have a student_id column
    private List<Address3> addresses = new ArrayList<>();

}
