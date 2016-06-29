package com.didispace.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

@Configuration
@Component
public class RestTemplateConfig {

    @Bean(name = "springrest")
    public RestTemplate configRestTemplate() {
        HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpComponentsClientHttpRequestFactory.setReadTimeout(60*1000);
        httpComponentsClientHttpRequestFactory.setConnectTimeout(60*1000);
        RestTemplate restTemplate = new RestTemplate(httpComponentsClientHttpRequestFactory);
        return restTemplate;
    }

    @Bean
    public AsyncRestTemplate asyncRestTemplate() {
        return new AsyncRestTemplate();
    }

}
