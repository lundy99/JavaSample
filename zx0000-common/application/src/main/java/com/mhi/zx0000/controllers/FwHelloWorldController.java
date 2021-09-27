package com.mhi.zx0000.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.mhi.zx0000.models.FwHelloWorldResponse;

@RestController
@RequestMapping( "/helloFw" )
public class FwHelloWorldController
{
    private static final Logger logger = LoggerFactory.getLogger(FwHelloWorldController.class);

    @RequestMapping( method = RequestMethod.GET )
    public ResponseEntity<FwHelloWorldResponse> getHello( @RequestParam( defaultValue = "world" ) final String name )
    {
        logger.info("I am running2!");
        logger.debug("I am running2!");
        return ResponseEntity.ok(new FwHelloWorldResponse(name));
    }
}
