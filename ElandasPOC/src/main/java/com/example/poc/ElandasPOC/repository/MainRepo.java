package com.example.poc.ElandasPOC.repository;

import com.example.poc.ElandasPOC.entity.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MainRepo extends JpaRepository<CompanyInfo, Integer> {
//    @Query("from CompanyInfo where id between :fromId and :toId")
//    List<CompanyInfo> getRangeData(@Param("fromId") int fromId, @Param("toId") int toId);
      List<CompanyInfo> findByIdBetween(int fromId, int toId);
}