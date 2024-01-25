package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.service.impl;


import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.jpa.Student1;
import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.repository.Student1Repository;
import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.service.Student1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Student1ServiceImpl implements Student1Service {

    private final Student1Repository studentRepository;

    @Transactional
    @Override
    public Student1 save(Student1 student) {
        return studentRepository.save(student);
    }
}
