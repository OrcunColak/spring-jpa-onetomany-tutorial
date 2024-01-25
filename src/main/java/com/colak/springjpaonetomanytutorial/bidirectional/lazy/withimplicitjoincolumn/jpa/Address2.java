package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address2")
@Getter
@Setter
public class Address2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String zipCode;

    @ManyToOne
    private Student2 student;

}
