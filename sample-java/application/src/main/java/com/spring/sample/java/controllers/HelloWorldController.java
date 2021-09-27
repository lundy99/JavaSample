package com.spring.sample.java.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import com.spring.sample.java.Repository.MinOrders;
import com.spring.sample.java.models.HelloWorldResponse;


// import com.mhi.zx0000.*;
import com.spring.sample.java.service.GetMinOrdersService;
@RestController
public class HelloWorldController 
{
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    // @Autowired DriverSapDB jdbc;

    @Autowired
    GetMinOrdersService minordersService;

    @GetMapping(path="/hello")
    public ResponseEntity<HelloWorldResponse> getHello( @RequestParam( defaultValue = "world" ) final String name )
    {
        logger.info("I am running!");

        // HelloWorldResponse memo = jdbc.queryForObject(
        //     "select ORDERID from MINORDERS ",
        //     new Object[] {ORDERID},
        //     (rs, num) -> new HelloWorldResponse(rs.getString("ORDERID"))
        // );

        // return ResponseEntity.ok(memo);
        return ResponseEntity.ok(new HelloWorldResponse(name));
    }

    @GetMapping(path="/minorders/all")
    public List<MinOrders> getMinordersAll()
    {
        logger.info("I'm getting minorders!");

        return minordersService.getPersons();
    }


}
