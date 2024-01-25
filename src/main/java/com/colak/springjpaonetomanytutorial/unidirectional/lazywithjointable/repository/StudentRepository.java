package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.repository;

import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjointable.jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
