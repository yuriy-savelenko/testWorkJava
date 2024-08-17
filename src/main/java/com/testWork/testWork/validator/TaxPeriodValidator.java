package com.testWork.testWork.validator;

import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TaxPeriodValidator {

    public void validateTaxPeriod(@NonNull LocalDate startDate, @NonNull LocalDate endDate){
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Дата начала не может быть позже даты окончания!");
        }
    }

}
