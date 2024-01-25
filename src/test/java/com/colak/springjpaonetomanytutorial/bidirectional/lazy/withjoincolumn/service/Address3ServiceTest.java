package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.service;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.jpa.Address3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Address3ServiceTest {
    @Autowired
    private Address3Service address3Service;

    // Hibernate: select ...,a1_0.my_student_id from address3 a1_0 left join student3 s1_0 on s1_0.id=a1_0.my_student_id
    // where s1_0.id=? offset ? rows fetch first ? rows only
    @Test
    void testFindByStudentId() {
        Page<Address3> result = address3Service.findByStudentId(1L, Pageable.ofSize(1));
        assertEquals(0, result.getTotalPages());
    }
}
