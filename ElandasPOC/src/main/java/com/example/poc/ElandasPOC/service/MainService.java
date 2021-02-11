package com.example.poc.ElandasPOC.service;

import com.example.poc.ElandasPOC.entity.CompanyInfo;
import com.example.poc.ElandasPOC.mapper.EntityMapper;
import com.example.poc.ElandasPOC.repository.MainRepo;
import com.example.poc.ElandasPOC.repository.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MainService {
    @Autowired
    MainRepo mainRepo;
    @Autowired
    MongoRepo mongoRepo;
    @Autowired
    EntityMapper entityMapper;

    public void saveData(CompanyInfo companyInfo) {
        companyInfo.setEndTime(java.time.LocalDate.now().toString() + " " +java.time.LocalTime.now().toString());
        mainRepo.save(companyInfo);
        mongoRepo.save(entityMapper.getData(companyInfo));
    }

    public Map<String, Object> getData(Map<String, Object> map1, int startId, int endId, String databse) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", 1);
        map.put("data", databse.equals("postgres")?mainRepo.findByIdBetween(startId, endId):mongoRepo.findByIdBetween(startId, endId));
        map.put("lookups", "");
        map.put("message", "Data get");
        return map;
    }
}