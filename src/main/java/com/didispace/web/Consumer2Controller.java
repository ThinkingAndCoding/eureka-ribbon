package com.didispace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer2Controller {

    @Autowired
    @Qualifier("ribbonrest")
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/resttest/ssssssadd", String.class).getBody();
        //return restTemplate.getForEntity("http://127.0.0.1:2222/resttest/ssssssadd", String.class).getBody();
    }


}