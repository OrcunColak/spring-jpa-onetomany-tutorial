package com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.service;


import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.repository.StudentRepository;
import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjointable.jpa.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
