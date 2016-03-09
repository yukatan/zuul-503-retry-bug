package zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Jesus Barquín on 9/03/16.
 */
@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class ZuulServer {


    public static void main(String args[]){

        new SpringApplicationBuilder(ZuulServer.class).run(args);
    }
}
