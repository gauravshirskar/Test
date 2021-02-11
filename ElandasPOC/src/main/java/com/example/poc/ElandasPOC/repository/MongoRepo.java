package com.example.poc.ElandasPOC.repository;

import com.example.poc.ElandasPOC.entity.CompanyInfo;
import com.example.poc.ElandasPOC.entity.CompanyInfoMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MongoRepo extends MongoRepository<CompanyInfoMongo, Integer> {
//    @Query("from CompanyInfoMongo where id between :fromId and :toId")
//    List<CompanyInfo> getRangeData(@Param("fromId") int fromId, @Param("toId") int toId);
        List<CompanyInfoMongo> findByIdBetween(int fromId, int toId);

}
