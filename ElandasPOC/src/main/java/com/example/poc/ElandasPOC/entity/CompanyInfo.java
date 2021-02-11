package com.example.poc.ElandasPOC.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "test2")
public class CompanyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private  int id;
    private String name ;
    private int age ;
    private String address ;
    private int salary ;
    private String startTime;
    private String endTime;
}
