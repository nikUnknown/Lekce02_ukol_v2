import java.math.BigDecimal;
import java.time.LocalDate;

import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Room;
import com.engeto.ja.hotel.Booking;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest();
        guest1.setName("Adela Malikova");
        guest1.setBorn(LocalDate.of(1993,3,13));
        System.out.println(guest1.getName() + " (" +guest1.getBorn()+")");

        Guest guest2 = new Guest();
        guest2.setName("Jan Dvorak");
        guest2.setBorn(LocalDate.of(1995,5,5));
        System.out.println(guest2.getName() + " (" +guest2.getBorn()+")");
        System.out.println();

        Room room1 = new Room();
        room1.setRoomNum(1);
        room1.setBed(1);
        room1.setPrice(BigDecimal.valueOf(1000));
        room1.setWithBalcone(true);
        room1.setSeaView(true);
        System.out.println("Pokoj cislo: "+room1.getRoomNum()+", pocet posteli: "+ room1.getBed()+", cena: " +room1.getPrice()+"Kc/noc"+", balkon: "+room1.isWithBalcone()+", vyhled na more: "+room1.isSeaView());

        Room room2 = new Room();
        room2.setRoomNum(2);
        room2.setBed(1);
        room2.setPrice(BigDecimal.valueOf(1000));
        room2.setWithBalcone(true);
        room2.setSeaView(true);
        System.out.println("Pokoj cislo: "+room2.getRoomNum()+", pocet posteli: "+ room2.getBed()+", cena: " +room2.getPrice()+"Kc/noc"+", balkon: "+room2.isWithBalcone()+", vyhled na more: "+room2.isSeaView());

        Room room3 = new Room();
        room3.setRoomNum(3);
        room3.setBed(3);
        room3.setPrice(BigDecimal.valueOf(2400));
        room3.setWithBalcone(false);
        room3.setSeaView(true);
        System.out.println("Pokoj cislo: "+room3.getRoomNum()+", pocet posteli: "+ room3.getBed()+", cena: " +room3.getPrice()+"Kc/noc"+", balkon: "+room3.isWithBalcone()+", vyhled na more: "+room3.isSeaView());

        System.out.println();
        Booking booking1 = new Booking();
        booking1.setNumberPeople(1);
        booking1.setStartDate(LocalDate.of(2021,7,1));
        booking1.setEndDate(LocalDate.of(2021,7,26));
        System.out.println("Rezervace na jmeno: "+guest1.getName()+", pokoj cislo: "+room1.getRoomNum()+", v terminu: "+ booking1.getStartDate()+" - "+booking1.getEndDate());


        Booking booking2 = new Booking();
        booking2.setNumberPeople(2);
        booking2.setStartDate(LocalDate.of(2021,9,1));
        booking2.setEndDate(LocalDate.of(2021,9,14));
        System.out.println("Rezervace na jmeno: "+guest1.getName()+", "+guest2.getName()+", pokoj cislo: "+room3.getRoomNum()+", v terminu: "+ booking2.getStartDate()+" - "+booking2.getEndDate());


    }
}