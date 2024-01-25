package com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.repository;


import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.jpa.Address1;
import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.jpa.Student1;
import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.service.Student1Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Student1ServiceTest {

    @Autowired
    private Student1Service student1Service;

    // This method will generate exactly the same number of queries, but with some changes.
    // Instead of generating SQL queries that save the mapping inside the join table, Hibernate will now only raise an
    // update query to set the student_id in every persisted address.
    // While for us, it’s still 7 queries, I know we will reduce the number in the next section!

    //    Hibernate: insert into student1 (age,mobile,name,id) values (?,?,?,default)
    //    Hibernate: insert into address1 (city, zip_code, id) values (?,?,default)
    //    Hibernate: insert into address1 (city,zip_code,id) values (?,?,default)
    //    Hibernate: insert into address1 (city,zip_code,id) values (?,?,default)
    //    Hibernate: update address1 set student_id=? where id=?
    //    Hibernate: update address1 set student_id=? where id=?
    //    Hibernate: update address1 set student_id=? where id=?
    @Test
    void testSave() {
        Student1 student = new Student1();
        student.setName("John");
        student.setAge(20);
        student.setMobile("1234567890");

        // address1
        Address1 address1 = new Address1();
        address1.setCity("Marrakech");
        address1.setZipCode("34226");

        //  address2
        Address1 address2 = new Address1();
        address2.setCity("Casablanca");
        address2.setZipCode("43563");

        // address3
        Address1 address3 = new Address1();
        address3.setCity("Rabat");
        address3.setZipCode("23512");

        List<Address1> addresses = student.getAddresses();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        // save student object
        Student1 savedStudent = student1Service.save(student);
        assertNotNull(savedStudent);

    }
}
