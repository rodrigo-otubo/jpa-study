package com.rodrigootubo.jpastudy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public interface ProductsDTO {
    @JsonProperty("product_name")
    String getName();

    @JsonProperty("customers")
    List<CustomerDTO> getCustomers();
}
