package com.testWork.testWork.controller;

import com.testWork.testWork.dto.TaxPeriodDTO;
import com.testWork.testWork.entity.TaxPeriod;
import com.testWork.testWork.mapper.TaxPeriodMapper;
import com.testWork.testWork.service.TaxPeriodService;
import com.testWork.testWork.validator.TaxPeriodValidator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tax-periods")
public class TaxPeriodController {

    private final TaxPeriodService taxPeriodService;
    private final TaxPeriodMapper mapper;
    private final TaxPeriodValidator validator;

    public TaxPeriodController(TaxPeriodService taxPeriodService, TaxPeriodMapper mapper, TaxPeriodValidator validator) {
        this.taxPeriodService = taxPeriodService;
        this.mapper = mapper;
        this.validator = validator;
    }

    @GetMapping("/overlapping")
    public List<TaxPeriodDTO> getOverlappingTaxPeriods(@RequestBody TaxPeriodDTO dto) {
        validator.validateTaxPeriod(dto.getStartDate(), dto.getEndDate());
        List<TaxPeriod> periods = taxPeriodService.findOverlappingTaxPeriods(dto.getStartDate(), dto.getEndDate());
        return mapper.toListDto(periods);
    }
}
