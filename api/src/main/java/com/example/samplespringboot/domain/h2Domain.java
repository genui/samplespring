package com.example.samplespringboot.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class h2Domain implements Serializable {
    @Id
    @GeneratedValue
    private Integer ID;
    @Column(nullable = false)
    private String USERNAME;
    @Column(nullable = false)
    private String PASSWORD;
}
