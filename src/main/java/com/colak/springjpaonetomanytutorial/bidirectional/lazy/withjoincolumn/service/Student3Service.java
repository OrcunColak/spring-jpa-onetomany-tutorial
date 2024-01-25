package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.service;


import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.jpa.Student3;
import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.repository.Student3Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Student3Service {

    private final Student3Repository studentRepository;

    @Transactional
    public Student3 save(Student3 student) {
        return studentRepository.save(student);
    }
}
