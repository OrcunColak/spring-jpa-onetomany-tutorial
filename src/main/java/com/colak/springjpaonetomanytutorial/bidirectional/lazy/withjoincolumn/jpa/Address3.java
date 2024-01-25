package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address3")
@Getter
@Setter
public class Address3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "my_student_id")
    private Student3 student;

}
