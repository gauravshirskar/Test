package com.example.poc.ElandasPOC.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Getter
@Setter
@Component
@Document(collection = "test2")
public class CompanyInfoMongo {
    @Id
    private  int id;
    private String name ;
    private int age ;
    private String address ;
    private int salary ;
    private String startTime;
    private String endTime;
}
