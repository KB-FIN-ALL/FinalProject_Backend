package com.kb.tax.service;

import com.kb.tax.domain.TaxPolicy;
import com.kb.tax.dto.TaxPolicyDTO;
import com.kb.tax.mapper.TaxMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TaxService {

    private final TaxMapper taxMapper;

    public Integer  getWeeklyTaxTotal() {
        LocalDate today = LocalDate.now();
        LocalDate oneWeekAgo = today.minusDays(7);
        return taxMapper.getTaxTotalForLastWeek(oneWeekAgo, today.minusDays(1));  // 오늘 제외하고 7일 전부터 어제까지 조회
    }

    public TaxPolicy getTaxPolicyByType(String policyType) {
        TaxPolicy taxPolicy = taxMapper.selectTaxPolicyByType(policyType);
        if(taxPolicy == null) {
            throw new NoSuchElementException("세금 정책을 제대로 못 불러왔음...");
        }
        return taxPolicy;
    }

    public void updateTaxPolicy(TaxPolicyDTO taxPolicyDTO) {
        taxMapper.updateTaxPolicy(taxPolicyDTO);
    }
}