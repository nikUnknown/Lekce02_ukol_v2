package com.engeto.ja.hotel;

import java.time.LocalDate;


public class Booking {
    private int numberPeople;
    private LocalDate startDate;
    private LocalDate endDate;
    //boolean isVacation;
    //boolean isBusiness;
    private Guest guest;

    public Booking (int numberPeople, LocalDate startDate, LocalDate endDate){
        this.numberPeople = numberPeople;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


}


