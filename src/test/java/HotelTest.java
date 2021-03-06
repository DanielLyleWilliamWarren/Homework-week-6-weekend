import Hotel.AllRoom.Bedroom;
import Hotel.AllRoom.BedroomType;
import Hotel.AllRoom.ConferenceRoom;
import Hotel.AllRoom.DiningRoom;
import Hotel.AllRoom.Room;
import Hotel.Hotel;
import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Guest> twinRoomBooking;
    Bedroom singleBedroom;
    Bedroom doubleBedroom;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;

    @Before
    public void setup() {
        guest1 = new Guest("Daniel");
        guest2 = new Guest("Gabby");
        guest3 = new Guest("David");
        twinRoomBooking = new ArrayList<>();
        twinRoomBooking.add(guest1);
        twinRoomBooking.add(guest2);
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        doubleBedroom = new Bedroom(12, twinRoomBooking, BedroomType.DOUBLE);
        singleBedroom = new Bedroom(13, null, BedroomType.SINGLE);
        diningRoom = new DiningRoom(30, "Belle Mare", twinRoomBooking);
        conferenceRoom = new ConferenceRoom(50, twinRoomBooking, "Glass Suite", 100.00);
        hotel = new Hotel(bedrooms, diningRooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasDiningRoom() {
        assertEquals(diningRooms, hotel.getDiningRoom());
    }

    @Test
    public void hasConferenceRoom() {
        assertEquals(conferenceRooms, hotel.getConferenceRoom());
    }

    @Test
    public void howManyBedrooms() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddBedroom() {
        hotel.addABedroom(singleBedroom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void howManyDiningRooms() {
        assertEquals(0, hotel.diningRoomCount());
    }

    @Test
    public void howManyConferenceRooms() {
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void canAddConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canAddDiningRooms(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.diningRoomCount());
    }

    @Test
    public void canFindBedroomByNumber(){
        hotel.addABedroom(singleBedroom);
        assertEquals(singleBedroom, hotel.findBedroomByNumber(13));
    }

    @Test
    public void canCheckPeopleInToRooms() {
        hotel.addABedroom(singleBedroom);
        hotel.getBedroomToAddGuestTo(BedroomType.SINGLE);
        hotel.addGuest(guest3, BedroomType.SINGLE);
        assertEquals(1, singleBedroom.guestCount());
    }

    @Test
    public void checkGuestsOut(){
        hotel.addABedroom((singleBedroom));
        hotel.getBedroomToAddGuestTo(BedroomType.SINGLE);
        hotel.checkGuestsOut(BedroomType.SINGLE);
        assertEquals(0, singleBedroom.guestCount());
    }

    @Test
    public void canCheckGuestsInRoom(){
        hotel.addABedroom(singleBedroom);
        hotel.getBedroomToAddGuestTo(BedroomType.SINGLE);
        hotel.addGuest(guest1, BedroomType.SINGLE);
        assertEquals("[Daniel]", singleBedroom.geustsNamesInRoom());
    }


}
