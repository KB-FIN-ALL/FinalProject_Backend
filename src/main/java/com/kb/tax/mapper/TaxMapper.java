package com.kb.tax.mapper;

import com.kb.tax.domain.TaxPolicy;
import com.kb.tax.dto.TaxPolicyDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;

@Mapper
public interface TaxMapper {
    Integer getTaxTotalForLastWeek(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    TaxPolicy selectTaxPolicyByType(String policyType);


    void updateTaxPolicy(TaxPolicyDTO taxPolicyDTO);
}