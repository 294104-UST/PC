package com.FlightSys.Flight.Controller;

import com.FlightSys.Flight.Model.Details;
import com.FlightSys.Flight.Service.Serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class Cntr {

    @Autowired
    Serv s;

    @GetMapping("/flights")
    public ResponseEntity<List<Details>> getThem( @RequestParam String source,
                                                  @RequestParam String destination,
                                                  /*@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDate*/
                                                  @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime departureDate){
        List<Details> flight=s.getFlight(source,destination,departureDate);/*,departureDate*/
        return (flight!=null)?ResponseEntity.status(HttpStatus.OK).body(flight):ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @GetMapping("/flights/{src}")
    public ResponseEntity<List<Details>> getsimple(@PathVariable String src){
        return ResponseEntity.status(HttpStatus.OK).body(s.getsim(src));
    }

}
