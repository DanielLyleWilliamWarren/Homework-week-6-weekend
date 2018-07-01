package Hotel;

import Hotel.AllRoom.Room;
import Hotel.AllRoom.*;
import java.util.ArrayList;


public class Hotel {

    protected ArrayList<Bedroom> bedrooms;
    protected ArrayList<DiningRoom> diningRooms;
    protected ArrayList<ConferenceRoom> conferenceRooms;
    protected Room bedroom;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
    }


    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<DiningRoom> getDiningRoom() {
        return this.diningRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRoom() {
        return this.conferenceRooms;
    }

    public int bedroomCount() {
        return bedrooms.size();
    }

    public void addABedroom(Bedroom singleBedroom) {
        bedrooms.add(singleBedroom);
    }

    public int diningRoomCount() {
        return diningRooms.size();
    }

    public int conferenceRoomCount() {
        return conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.add(diningRoom);
    }

    public Bedroom findBedroomByNumber(int roomNumber) {
        Bedroom foundRoom = null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber)
                foundRoom = bedroom;
        }
        return foundRoom;
    }


    public Bedroom getBedroomToAddGuestTo(BedroomType bedroomType) {
        Bedroom avaliableRoom = null;
        for (Bedroom bedroom : bedrooms) {
            if(bedroom.getBedroomType() == bedroomType && !bedroom.isBedroomBooked())
                avaliableRoom = bedroom;
        }
        return avaliableRoom;
    }

    public void addGuest(Guest guest3, BedroomType single) {
        bedroom = getBedroomToAddGuestTo(single);
        bedroom.addGuest(guest3);
    }


    public void checkGuestsOut(BedroomType single) {
        bedroom = getBedroomToAddGuestTo(single);
        bedroom.checkedGuestsOut();
    }

}
