package com.engeto.ja.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Booking {
    private int numberPeople;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isVacation;
    private ArrayList<Guest> guests;


    //konstruktor pro tridu Booking
    public Booking (int numberPeople, LocalDate startDate, LocalDate endDate, boolean isVacation){
        this.numberPeople = numberPeople;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isVacation = isVacation;
        this.guests = new ArrayList<Guest>();
    }

    public void addGuest(String name, LocalDate born) {
        Guest guest = new Guest(name,born);
        guests.add(guest);
    }



    public List<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuest(){
        return guests.size();
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

    public boolean isVacation() {
        return isVacation;
    }

    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }


}


