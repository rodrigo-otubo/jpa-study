package com.rodrigootubo.jpastudy.service.basic;

import com.rodrigootubo.jpastudy.dto.CompanyDTO;
import com.rodrigootubo.jpastudy.mappers.CompanyMapper;
import com.rodrigootubo.jpastudy.repository.basic.CompanyBasicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyBasicService {

    private final CompanyBasicRepository companyBasicRepository;

    public List<CompanyDTO> listAllNonPageable() {
        return companyBasicRepository.findAllProjectedBy(CompanyDTO.class);
    }

    public CompanyDTO findByIdOrThrowBadRequestException(final long id) {
        return CompanyMapper.INSTANCE.companyToCompanyDTO(companyBasicRepository.findById(id).orElseThrow());
    }

    /*
    public void create(CompanyPostDTO companyPostDTO) {
        S save = companyBasicRepository.save(companyPostDTO);
    }

     */
}
