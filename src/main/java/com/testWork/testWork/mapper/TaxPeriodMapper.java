package com.testWork.testWork.mapper;


import com.testWork.testWork.dto.TaxPeriodDTO;
import com.testWork.testWork.entity.TaxPeriod;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaxPeriodMapper {

    public TaxPeriodDTO toDto(TaxPeriod taxPeriod) {
        return TaxPeriodDTO.builder()
                .startDate(taxPeriod.getStartDate())
                .endDate(taxPeriod.getEndDate())
                .build();
    }

    public List<TaxPeriodDTO> toListDto(List<TaxPeriod> taxPeriods) {
        return taxPeriods.stream().map(this::toDto).toList();
    }
}
