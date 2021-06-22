package com.rodrigootubo.jpastudy.mappers;

import com.rodrigootubo.jpastudy.dto.CompanyDTO;
import com.rodrigootubo.jpastudy.dto.CompanyPostDTO;
import com.rodrigootubo.jpastudy.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class CompanyMapper {

    public static final CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    public abstract List<CompanyDTO> companiesToCompanyDTO(List<Company> companies);

    public abstract CompanyDTO companyToCompanyDTO(Company company);

}
