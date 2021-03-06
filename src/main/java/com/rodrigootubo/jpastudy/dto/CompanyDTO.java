package com.rodrigootubo.jpastudy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public interface CompanyDTO {
    @JsonProperty("company_name")
    String getName();

    @JsonProperty("products")
    List<ProductsDTO> getProducts();
}
