package com.example.poc.ElandasPOC.mapper;

import com.example.poc.ElandasPOC.entity.CompanyInfo;
import com.example.poc.ElandasPOC.entity.CompanyInfoMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper {
    @Autowired
    CompanyInfoMongo companyInfoMongo;
    public CompanyInfoMongo getData(CompanyInfo companyInfo) {
        companyInfoMongo.setId(companyInfo.getId());
        companyInfoMongo.setName(companyInfo.getName());
        companyInfoMongo.setAddress(companyInfo.getAddress());
        companyInfoMongo.setAge(companyInfo.getAge());
        companyInfoMongo.setSalary(companyInfo.getSalary());
        companyInfoMongo.setStartTime(companyInfo.getStartTime());
        companyInfoMongo.setEndTime(companyInfo.getEndTime());
        return companyInfoMongo;
    }
}
