package com.example.booksearch.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class BookApiConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
