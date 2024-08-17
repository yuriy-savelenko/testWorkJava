package com.testWork.testWork.utils;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateFormatter {
    private DateFormatter() {}
    public static LocalDate formatDateToFirstDayOfMonth(LocalDate date) {
        return date.with(TemporalAdjusters.firstDayOfMonth());
    }

    public static LocalDate formatDateToLastDayOfMonth(LocalDate date) {
        return date.with(TemporalAdjusters.lastDayOfMonth());
    }
}
