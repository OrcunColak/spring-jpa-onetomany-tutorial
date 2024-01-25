package com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.service;

import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.jpa.Address3;
import com.colak.springjpaonetomanytutorial.bidirectional.lazy.withjoincolumn.repository.Address3Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Address3Service {

    private final Address3Repository addressRepository;

    Page<Address3> findByStudentId(Long studentId, Pageable pageable) {
        return addressRepository.findByStudentId(studentId, pageable);
    }
}
