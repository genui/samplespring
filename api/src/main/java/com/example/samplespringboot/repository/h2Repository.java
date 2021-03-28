package com.example.samplespringboot.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER")

public class h2Repository {
    @Column(name = "username")
    private String username;
}
