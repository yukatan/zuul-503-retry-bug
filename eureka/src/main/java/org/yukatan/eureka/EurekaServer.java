package org.yukatan.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Jesus Barquín on 9/03/16.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String args[]){

        new SpringApplicationBuilder(EurekaServer.class).run(args);
    }
}
