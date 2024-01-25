package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.service;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Address2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Address2ServiceTest {
    @Autowired
    private Address2Service address2Service;

    // select * from address2 a1_0 left join student2 s1_0 on s1_0.id=a1_0.student_id
    // where s1_0.id=? offset ? rows fetch first ? rows only
    @Test
    void testFindByStudentId() {
        Page<Address2> result = address2Service.findByStudentId(1L, Pageable.ofSize(1));
        assertEquals(0, result.getTotalPages());
    }
}
