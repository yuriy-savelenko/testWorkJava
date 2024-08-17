package com.testWork.testWork.service;

import com.testWork.testWork.entity.TaxPeriod;
import com.testWork.testWork.repository.TaxPeriodRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class TaxPeriodService {

    private final TaxPeriodRepository taxPeriodRepository;

    public TaxPeriodService(TaxPeriodRepository taxPeriodRepository) {
        this.taxPeriodRepository = taxPeriodRepository;
    }

    public List<TaxPeriod> findOverlappingTaxPeriods(LocalDate startDate, LocalDate endDate) {
        return taxPeriodRepository.findOverlappingPeriods(startDate, endDate);
    }
}
