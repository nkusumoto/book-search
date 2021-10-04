package com.example.booksearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ApiResponse {
    private String kind;
    private List<Item> items;
    private int totalItems;
}
