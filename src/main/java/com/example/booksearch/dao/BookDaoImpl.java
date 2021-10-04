package com.example.booksearch.dao;

import com.example.booksearch.domain.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class BookDaoImpl implements BookDao {

    @Autowired
    RestTemplate restTemplate;

    public static final String URL = "https://www.googleapis.com/books/v1/volumes?q=";

    @Override
    public ApiResponse getBooks(String query) {
        String searchURL = URL + query;
        return restTemplate.getForObject(searchURL, ApiResponse.class);
    }

}
