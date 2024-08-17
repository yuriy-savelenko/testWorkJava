package com.testWork.testWork.dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;

@Value
@Builder
@Jacksonized
public class TaxPeriodDTO {

    LocalDate startDate;

    LocalDate endDate;

}
