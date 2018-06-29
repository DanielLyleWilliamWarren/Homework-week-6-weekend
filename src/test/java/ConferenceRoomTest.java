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
    ConferenceRoom conferenceRoom;

    @Before
    public void setup(){
        guest1 = new Guest("David");
        guest2 = new Guest("James");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom(50, guests, "Party Suite", 100.00);

    }

    @Test
    public void doesTheConferenceRoomHaveAName(){
        assertEquals("Party Suite", conferenceRoom.getConferenceRoomName());
    }
}
