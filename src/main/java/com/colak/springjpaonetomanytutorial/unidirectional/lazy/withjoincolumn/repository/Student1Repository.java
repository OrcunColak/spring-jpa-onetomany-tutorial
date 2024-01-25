package com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.repository;

import com.colak.springjpaonetomanytutorial.unidirectional.lazy.withjoincolumn.jpa.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student1Repository extends JpaRepository<Student1, Long> {
}
