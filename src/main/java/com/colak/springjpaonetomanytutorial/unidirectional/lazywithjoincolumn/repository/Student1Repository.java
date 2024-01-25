package com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.repository;

import com.colak.springjpaonetomanytutorial.unidirectional.lazywithjoincolumn.jpa.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student1Repository extends JpaRepository<Student1, Long> {
}
