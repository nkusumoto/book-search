package com.example.booksearch.dao;


import com.example.booksearch.domain.ApiResponse;

public interface BookDao {
    ApiResponse getBooks(String query);
}
