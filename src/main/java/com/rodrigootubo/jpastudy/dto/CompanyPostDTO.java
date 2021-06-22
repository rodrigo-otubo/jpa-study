package com.rodrigootubo.jpastudy.dto;

import lombok.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyPostDTO {
    @NotEmpty
    private String name;
}
