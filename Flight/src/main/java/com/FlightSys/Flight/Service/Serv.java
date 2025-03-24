package com.FlightSys.Flight.Service;

import com.FlightSys.Flight.Model.Details;
import com.FlightSys.Flight.Repository.FlRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Serv {

    @Autowired
    FlRepo fp;

    JPAStreamer js;
    @Autowired
    public Serv(final JPAStreamer jpaStreamer) {
        this.js = jpaStreamer;
    }

    public List<Details> getFlight(String source, String destination, LocalDate departureDate) {
        //return fp.findBySourceAndDestinationAndDeptDateTime(source,destination,departureDate);//,departureDate //AndDeptDateTime
        return js.stream(Details.class)
                .filter((Details x)->(x.getSource().equals(source))
                        &&(x.getDestination().equals(destination))
                        &&(x.getDeptDateTime().toLocalDate().isEqual(departureDate))).collect(Collectors.toList());
    }

    public List<Details> getSim(String src) {
        //return fp.findBySource(src);
        return js.stream(Details.class)
                .filter((x)->(x.getSource().equals(src)))
                .collect(Collectors.toList());
    }
}
