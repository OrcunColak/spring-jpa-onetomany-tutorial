package com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.repository;


import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.jpa.Address;
import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.jpa.Student;
import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    //7 queries needed to insert a student and his 3 addresses, the first 4 queries save the objects,
    // while the last 3 are solely for establishing the relationship by inserting into the join table.

    //    Hibernate: insert into student (age, mobile, name, id) values (?,?,?,default)
    //    Hibernate: insert into address (city,zip_code,id) values (?,?,default)
    //    Hibernate: insert into address (city,zip_code,id) values (?,?,default)
    //    Hibernate: insert into address (city,zip_code,id) values (?,?,default)
    //    Hibernate: insert into student_addresses (student_id,addresses_id) values (?,?)
    //    Hibernate: insert into student_addresses (student_id,addresses_id) values (?,?)
    //    Hibernate: insert into student_addresses (student_id,addresses_id) values (?,?)
    @Test
    void testSave() {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        student.setMobile("1234567890");

        // address1
        Address address1 = new Address();
        address1.setCity("Marrakech");
        address1.setZipCode("34226");

        //  address2
        Address address2 = new Address();
        address2.setCity("Casablanca");
        address2.setZipCode("43563");

        // address3
        Address address3 = new Address();
        address3.setCity("Rabat");
        address3.setZipCode("23512");

        List<Address> addresses = student.getAddresses();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        // save student object
        Student savedStudent = studentService.save(student);
        assertNotNull (savedStudent);
    }
}
