package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.service;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Address2;
import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Student2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Student2ServiceTest {

    @Autowired
    private Student2Service student2Service;

    // Hibernate: insert into student2 (age,mobile,name,id) values (?,?,?,default)
    // Hibernate: insert into address2 (city, student_id, zip_code, id) values (?,?,?,default)
    // Hibernate: insert into address2 (city,student_id,zip_code,id) values (?,?,?,default)
    // Hibernate: insert into address2 (city,student_id,zip_code,id) values (?,?,?,default
    @Test
    void testSave() {
        Student2 student = new Student2();
        student.setName("John");
        student.setAge(20);
        student.setMobile("1234567890");

        // address1
        Address2 address1 = new Address2();
        address1.setCity("Marrakech");
        address1.setZipCode("34226");

        //  address2
        Address2 address2 = new Address2();
        address2.setCity("Casablanca");
        address2.setZipCode("43563");

        // address3
        Address2 address3 = new Address2();
        address3.setCity("Rabat");
        address3.setZipCode("23512");

        List<Address2> addresses = student.getAddresses();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        // save student object
        Student2 savedStudent = student2Service.save(student);
        assertNotNull(savedStudent);
    }
}
