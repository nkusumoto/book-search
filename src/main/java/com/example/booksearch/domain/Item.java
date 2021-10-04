package com.example.booksearch.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Item {
    private VolumeInfo volumeInfo;
    private SaleInfo saleInfo;
}
