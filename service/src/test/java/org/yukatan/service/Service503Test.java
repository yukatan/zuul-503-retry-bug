package org.yukatan.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Created by Jesus Barquín on 9/03/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application503.class)
@WebAppConfiguration
@IntegrationTest
public class Service503Test {

    Logger logger = LoggerFactory.getLogger(Service503Test.class);

    @Test
    public void testRepeatUntilBadRequest() throws Exception {

        TestRestTemplate template = new TestRestTemplate();

        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8000/service-fail/test").build().toUri();

        while (true){
        RequestEntity postRequest = RequestEntity.post(uri).body("{\"content\":\"hello\"}".getBytes());
        ResponseEntity<String> response= template.exchange(postRequest, String.class);
        logger.info("Response:{}",response.toString());
        Thread.sleep(5000);
        }


    }
}
