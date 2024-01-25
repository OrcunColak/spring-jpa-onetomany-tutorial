package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.repository;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.jpa.Address3;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Address3Repository extends JpaRepository<Address3, Long> {

    Page<Address3> findByStudentId(Long studentId, Pageable pageable);
}
