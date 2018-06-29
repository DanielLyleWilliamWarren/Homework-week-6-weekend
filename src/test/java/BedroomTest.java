import Hotel.AllRoom.Bedroom;
import Hotel.AllRoom.BedroomType;
import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    ArrayList<Guest> guests;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom;

    @Before
    public void setup(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Fred");
        guest3 = new Guest("James");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        bedroom = new Bedroom(12, guests, BedroomType.DOUBLE);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void doesBedroomHaveGuest(){
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void howManyGuests(){
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void checkGuestIn(){
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void canCheckGuestsOut(){
        assertEquals(0, bedroom.checkedGuestsOut());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void hasNightRate(){
     assertEquals(20, bedroom.getDailyRate(),1);
    }

}
