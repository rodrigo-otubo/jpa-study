package com.rodrigootubo.jpastudy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface CustomerDTO {
    @JsonProperty("customer_name")
    String getName();
}
