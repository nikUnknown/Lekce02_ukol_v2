package com.engeto.ja.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> bookings;

    //konstruktor pro atribut Listu bookings
    public BookingManager(List<Booking> bookings) {
        this.bookings = new ArrayList<Booking>();
    }

    //metoda pro vlozeni rezervace do seznamu bookings
    public void addBooking(){
        Booking newBooking = null;
        bookings.add(newBooking);
    }

    //metoda pro ziskani rezervace se zadanym indexem seznamu
    public Booking getBooking(int index){
        if ( (index >= 0) && (index < bookings.size())){
            return bookings.get(index);
        }
        System.out.println("No booking found at index");
        return null;
    }

    //metoda pro ziskani seznamu rezervaci
    public List<Booking> getBookings() {
        return bookings;
    }

    //metoda pro vymazani seznamu rezervaci
    public void clearBookings(){
        bookings.clear();
    }

    //metoda ktera vrati pocet rezervaci pro pracovni pobyty
    public int getNumberOfWorkingBookings(List<Booking> bookings){
        int workingBookings = 0;
        for (Booking booking : bookings){
            if(!booking.isVacation()){
                workingBookings++;
            }
        }
        return workingBookings;
    }

    public int getNumberOfVacationBookings(List<Booking> bookings){
        int vacationBookings = 0;
        for (Booking booking : bookings){
            if (booking.isVacation()){
                vacationBookings += booking.getNumberOfGuest();
            }
        }
        return vacationBookings;
    }

    //metoda ktera vrati prumerny pocet hostu na rezervaci
    public double getAverageGuests(List<Booking> bookings) {
        int totalGuests = 0;
        int totalBookings = 0;

        for (Booking booking : bookings) {
            totalGuests += booking.getNumberOfGuest();
        }

        if (totalBookings == 0) {
            return 0;
        } else {
            return (double) totalGuests / totalBookings;
        }
    }
}
