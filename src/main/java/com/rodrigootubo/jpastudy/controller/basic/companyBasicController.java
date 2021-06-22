package com.rodrigootubo.jpastudy.controller.basic;

import com.rodrigootubo.jpastudy.dto.CompanyDTO;
import com.rodrigootubo.jpastudy.dto.CompanyPostDTO;
import com.rodrigootubo.jpastudy.service.basic.CompanyBasicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/company/")
@RequiredArgsConstructor
public class companyBasicController {

    private final CompanyBasicService companyBasicService;

    @GetMapping("all")
    public ResponseEntity<List<CompanyDTO>> listAll(){
        return ResponseEntity.status(HttpStatus.OK).body(companyBasicService.listAllNonPageable());
    }

    @GetMapping("{id}")
    public ResponseEntity<CompanyDTO> findById(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(companyBasicService.findByIdOrThrowBadRequestException(id));
    }
    /*
    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CompanyPostDTO companyPostDTO){
        companyBasicService.create(companyPostDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

     */
}
