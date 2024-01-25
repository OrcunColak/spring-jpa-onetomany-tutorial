package com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.service;


import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.jpa.Student1;
import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.repository.Student1Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Student1Service {

    private final Student1Repository studentRepository;

    @Transactional
    public Student1 save(Student1 student) {
        return studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public Optional<Student1> findById(Long id) {
        return studentRepository.findById(id);
    }
}
