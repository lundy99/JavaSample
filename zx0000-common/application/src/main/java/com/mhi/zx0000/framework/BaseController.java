package com.mhi.zx0000.framework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BaseController
{
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
    public void BaseController(){
        
    }
    // @RequestMapping( method = RequestMethod.GET )
    // public ResponseEntity<HelloWorldResponse> getHello( @RequestParam( defaultValue = "world" ) final String name )
    // {
    //     logger.info("I am running2!");
    //     logger.debug("I am running2!");
    //     return ResponseEntity.ok(new HelloWorldResponse(name));
    // }
}