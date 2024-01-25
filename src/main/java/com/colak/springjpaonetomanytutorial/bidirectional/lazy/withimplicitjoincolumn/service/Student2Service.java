package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.service;


import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Student2;
import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.repository.Student2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Student2Service {

    private final Student2Repository studentRepository;

    @Transactional
    public Student2 save(Student2 student) {
        return studentRepository.save(student);
    }
}
