package com.example.booksearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ListPrice {
    private String amount;
    private String currencyCode;
}
