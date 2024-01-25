package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.repository;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Address2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Address2Repository extends JpaRepository<Address2, Long> {

    Page<Address2> findByStudentId(Long studentId, Pageable pageable);
}
