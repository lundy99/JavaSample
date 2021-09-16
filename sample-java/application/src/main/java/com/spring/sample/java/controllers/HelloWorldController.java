package com.spring.sample.java.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.sample.java.models.HelloWorldResponse;
import javax.sql.DataSource;
// import org.springframework.jdbc.core.JdbcTemplate;
// import com.sap.cloud.db.JdbcTemplate;

// import com.fw.sample.java.*;
@RestController
public class HelloWorldController 
{
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    // @Autowired JdbcTemplate jdbc;

    @RequestMapping(path="/hello", method = RequestMethod.GET )
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
}
