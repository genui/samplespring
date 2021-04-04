package com.example.samplespringboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.samplespringboot.domain.h2Domain;
import com.example.samplespringboot.repository.h2Repository;

@Service

public class h2Service{
    @Autowired
    h2Repository h2Repository;

    public List<h2Domain> findAll(){
        return h2Repository.findAll();
    }
}