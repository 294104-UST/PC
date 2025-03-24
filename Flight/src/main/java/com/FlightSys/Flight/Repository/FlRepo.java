package com.FlightSys.Flight.Repository;

import com.FlightSys.Flight.Model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlRepo extends JpaRepository<Details,Long> {
    List<Details> findBySourceAndDestinationAndDeptDateTime(String source, String destination, LocalDateTime departureDate);//, LocalDate departureDate //AndDeptDateTime

    List<Details> findBySource(String src);
}
