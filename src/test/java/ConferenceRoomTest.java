import Hotel.AllRoom.ConferenceRoom;
import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ArrayList<Guest> guests;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ConferenceRoom conferenceRoom;

    @Before
    public void setup(){
        guest1 = new Guest("David");
        guest2 = new Guest("James");
        guest3 = new Guest("John");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        conferenceRoom = new ConferenceRoom(50, guests, "Party Suite", 100.00);

    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void doesBedroomHaveGuest(){
        assertEquals(guests, conferenceRoom.getGuests());
    }

    @Test
    public void howManyGuests(){
        assertEquals(3, conferenceRoom.guestCount());
    }

    @Test
    public void checkGuestIn(){
        conferenceRoom.addGuest(guest3);
        assertEquals(4, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckGuestsOut(){
        assertEquals(0, conferenceRoom.checkedGuestsOut());
    }


    @Test
    public void doesTheConferenceRoomHaveAName(){
        assertEquals("Party Suite", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void doesHaveDayRate(){
        assertEquals(100.00, conferenceRoom.getDayRate(),1);
    }
}
