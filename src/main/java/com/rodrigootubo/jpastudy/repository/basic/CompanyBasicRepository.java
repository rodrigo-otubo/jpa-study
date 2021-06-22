package com.rodrigootubo.jpastudy.repository.basic;

import com.rodrigootubo.jpastudy.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyBasicRepository extends JpaRepository<Company, Long> {
    <T> List<T> findAllProjectedBy(Class<T> dto);
}
