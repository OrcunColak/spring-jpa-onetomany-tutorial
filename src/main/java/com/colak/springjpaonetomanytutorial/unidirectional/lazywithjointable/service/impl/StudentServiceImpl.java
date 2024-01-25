package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.service.impl;


import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.jpa.Student;
import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.repository.StudentRepository;
import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Transactional
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
