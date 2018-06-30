import Hotel.AllRoom.DiningRoom;
import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    ArrayList<Guest> guests;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setup(){
        guest1 = new Guest("Greg");
        guest2 = new Guest("Jesus");
        guest3 = new Guest("Iona");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        diningRoom = new DiningRoom(30, "Jimmy Chungs", guests);
    }

    @Test
    public void hasCapacity(){
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void doesDiningRoomHaveGuest(){
        assertEquals(guests, diningRoom.getGuests());
    }

    @Test
    public void howManyGuests(){
        assertEquals(3, diningRoom.guestCount());
    }

    @Test
    public void checkGuestIn(){
        diningRoom.addGuest(guest3);
        assertEquals(4, diningRoom.guestCount());
    }

    @Test
    public void canCheckGuestsOut(){
        assertEquals(0, diningRoom.checkedGuestsOut());
    }

    @Test
    public void canGetDiningRoomName(){
        assertEquals("Jimmy Chungs", diningRoom.getDiningRoomName());
    }
}
