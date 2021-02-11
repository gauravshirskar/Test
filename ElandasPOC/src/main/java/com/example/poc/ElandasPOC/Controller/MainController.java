package com.example.poc.ElandasPOC.Controller;

import com.example.poc.ElandasPOC.entity.CompanyInfo;
import com.example.poc.ElandasPOC.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("/main")
public class MainController extends Thread{
    @Autowired
    MainService mainService;
    @PostMapping("/saveData")
    public Map<String, Object> saveData(@RequestBody CompanyInfo companyInfo) {
        companyInfo.setStartTime(java.time.LocalDate.now().toString() + " " +java.time.LocalTime.now().toString());
        HashMap<String, Object> map = new HashMap<>();
        mainService.saveData(companyInfo);
        map.put("status", 1);
        map.put("data", "");
        map.put("lookups", "");
        map.put("message", companyInfo.getName() + "Data Save Successfully");
        return  map;
    }
    @GetMapping(path = "/getdata", produces= MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getData(@RequestParam(value = "startId") int startId, @RequestParam(value = "endId") int endId, @RequestParam(value = "databse") String databse) {
        HashMap<String, Object> map1 = new HashMap<>();
        return mainService.getData(map1, startId, endId, databse);
    }

}
