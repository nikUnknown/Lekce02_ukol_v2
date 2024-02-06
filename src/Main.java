import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.BookingManager;
import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static <List> void main(String[] args) {

        Guest guest1 = new Guest("Adela Malikova", LocalDate.of(1993, 3, 13));
        System.out.println(guest1.getName() + " (" + guest1.getBorn() + ")");

        Guest guest2 = new Guest("Jan Dvorak", LocalDate.of(1995, 5, 5));
        System.out.println(guest2.getName() + " (" + guest2.getBorn() + ")");
        System.out.println();

        Room room1 = new Room(1, 1, BigDecimal.valueOf(1000), true, true);
        System.out.println("Room number: " + room1.getRoomNum() + ", number of beds: " + room1.getBed() + ", price: " + room1.getPrice() + "Czk/night" + ", balcony: " + room1.isWithBalcone() + ", sea view: " + room1.isSeaView());

        Room room2 = new Room(2, 1, BigDecimal.valueOf(1000), true, true);
        System.out.println("Room number: " + room2.getRoomNum() + ", number of beds: " + room2.getBed() + ", price: " + room2.getPrice() + "Czk/night" + ", balcony: " + room2.isWithBalcone() + ", sea view: " + room2.isSeaView());

        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400), false, true);
        System.out.println("Room number: " + room3.getRoomNum() + ", number of beds: " + room3.getBed() + ", price: " + room3.getPrice() + "Czk/night" + ", balcony: " + room3.isWithBalcone() + ", sea view: " + room3.isSeaView());

        /*
        System.out.println();
        Booking booking1 = new Booking(1,LocalDate.of(2021,7,1), LocalDate.of(2021,7,26));
        System.out.println("Rezervace na jmeno: "+guest1.getName()+", pokoj cislo: "+room1.getRoomNum()+", v terminu: "+ booking1.getStartDate()+" - "+booking1.getEndDate());

        Booking booking2 = new Booking(2, LocalDate.of(2021,9,1), LocalDate.of(2021, 9, 14));
        System.out.println("Rezervace na jmeno: "+guest1.getName()+", "+guest2.getName()+", pokoj cislo: "+room3.getRoomNum()+", v terminu: "+ booking2.getStartDate()+" - "+booking2.getEndDate());
        */


        //Reservation n.1
        System.out.println();
        Booking booking1 = new Booking(0, LocalDate.now(), LocalDate.now(), true);
        booking1.setNumberPeople(1);
        booking1.setStartDate(LocalDate.of(2021, 7, 1));
        booking1.setEndDate(LocalDate.of(2021, 7, 26));
        System.out.println("Number of people: " + booking1.getNumberPeople() + ", name: " + guest1.getName() + ", reservation date: " + booking1.getStartDate() + " - " + booking1.getEndDate());

        //Reservation n.2
        Booking booking2 = new Booking(0, LocalDate.now(), LocalDate.now(), false);
        booking2.setNumberPeople(2);
        booking2.setStartDate(LocalDate.of(2021, 9, 1));
        booking2.setEndDate(LocalDate.of(2021, 9, 14));
        System.out.println("Number of people: " + booking2.getNumberPeople() + ", name: " + guest1.getName() + ", " + guest2.getName() + ", reservation date: " + booking2.getStartDate() + " - " + booking2.getEndDate());

        //Reservation n.3
        Booking booking3 = new Booking(1,LocalDate.of(2023,6,1),LocalDate.of(2023,6,7),false);
        booking3.addGuest("Karel Dvorak", LocalDate.of(1990,5,15));
        booking3.setNumberPeople(1);
        System.out.println("Date from:"+booking3.getStartDate()+" - date to:"+booking3.getEndDate()+": "+booking3.getGuests()+", number of guests: "+booking3.getNumberOfGuest()+" , sea view: "+room3.isSeaView()+" , price: "+room3.getPrice());

        /*
        public BookingManager fillBookings(){
        }
        */

    }
}