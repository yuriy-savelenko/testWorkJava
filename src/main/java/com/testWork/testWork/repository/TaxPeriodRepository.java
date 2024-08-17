package com.testWork.testWork.repository;

import com.testWork.testWork.dto.TaxPeriodDTO;
import com.testWork.testWork.entity.TaxPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaxPeriodRepository extends JpaRepository<TaxPeriodDTO, Long> {

    @Query("SELECT tp FROM TaxPeriod tp WHERE tp.startDate >= :startDate AND tp.endDate <= :endDate")
    List<TaxPeriod> findOverlappingPeriods(LocalDate start, LocalDate end);

}
