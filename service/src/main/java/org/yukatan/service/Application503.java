package org.yukatan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jesus Barquín on 9/03/16.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application503 {

    Logger logger = LoggerFactory.getLogger(Application503.class);

    public static void main(String args[]){

        new SpringApplicationBuilder(Application503.class).run(args);
    }


    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public void response503(@RequestBody String body){

        logger.info("Body arrived to the service: " + body);
        return;
    }
}
