package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.service;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.jpa.Address2;
import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withimplicitjoincolumn.repository.Address2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Address2Service {

    private final Address2Repository addressRepository;

    Page<Address2> findByStudentId(Long studentId, Pageable pageable) {
        return addressRepository.findByStudentId(studentId, pageable);
    }
}
