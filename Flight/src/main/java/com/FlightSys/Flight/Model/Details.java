package com.FlightSys.Flight.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class Details {

    @Id
    long id;
    String airline;
    String source;
    @Column(name ="source name")
    String sourceName;
    String destination;
    @Column(name = "destination name")
    String destinationName;
    @Column(name = "Departure Date & Time")
    LocalDateTime deptDateTime;
    @Column(name = "Arrival Date & Time")
    LocalDateTime arrvDateTime;
    @Column(name = "Duration (hrs)")
    Double duration;
    String Stopovers;
    @Column(name = "aircraft type")
    String aircraftType;
    @Column(name = "class")
    String classes;
    @Column(name = "booking source")
    String bookingSource;
    @Column(name = "Base Fare (BDT)")
    Double baseFare;
    @Column(name = "Tax & Surcharge (BDT)")
    Double taxSurcharge;
    @Column(name = "Total Fare (BDT)")
    double totalFare;
    String Seasonality;
    @Column(name = "Days Before Departure")
    int daysBeforeDeparture;

    public Details() {
    }

    public long getFlId() {
        return id;
    }

    public void setFlId(long flId) {
        this.id = flId;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        airline = airline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        destination = destination;
    }

    public LocalDateTime getDeptDateTime() {
        return deptDateTime;
    }

    public void setDeptDateTime(LocalDateTime deptDateTime) {
        this.deptDateTime = deptDateTime;
    }

    public LocalDateTime getArrvDateTime() {
        return arrvDateTime;
    }

    public void setArrvDateTime(LocalDateTime arrvDateTime) {
        this.arrvDateTime = arrvDateTime;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        duration = duration;
    }

    public String getStopovers() {
        return Stopovers;
    }

    public void setStopovers(String stopovers) {
        Stopovers = stopovers;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public double getTaxSurcharge() {
        return taxSurcharge;
    }

    public void setTaxSurcharge(double taxSurcharge) {
        this.taxSurcharge = taxSurcharge;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public String getSeasonality() {
        return Seasonality;
    }

    public void setSeasonality(String seasonality) {
        Seasonality = seasonality;
    }

    public int getDaysBeforeDeparture() {
        return daysBeforeDeparture;
    }

    public void setDaysBeforeDeparture(int daysBeforeDeparture) {
        this.daysBeforeDeparture = daysBeforeDeparture;
    }
}
